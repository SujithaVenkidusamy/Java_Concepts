import java.util.*;

class Edge {
    int src, dest, weight;

    Edge(int s, int d, int w) {
        src = s;
        dest = d;
        weight = w;
    }
}

class Kruskal_Operations {
    Edge[] edgeDB;

    Kruskal_Operations(Edge[] edgeDB) {
        this.edgeDB = edgeDB;
    }
    
    void sort(){       //Selection Sort
        for(int i=0;i<edgeDB.length-1;i++){
            for(int j=i+1;j<edgeDB.length;j++){
                if(edgeDB[i].weight > edgeDB[j].weight){
                    Edge temp=edgeDB[i];
                    edgeDB[i]=edgeDB[j];
                    edgeDB[j]=temp;
                }
            }
        }
    }   
    int findAndUnion(int nodes, ArrayList<Integer>[]list){
        int totMinCost=0;
        for(Edge ed: edgeDB){
            int src=ed.src;
            int dest=ed.dest;
            int setsrc=-1;
            int setdest=-1;
            
            for(int setNo=0;setNo<nodes;setNo++){
                if(list[setNo].contains(src)){
                    setsrc=setNo;
                }
                if(list[setNo].contains(dest)){
                    setdest=setNo;
                }
            }
            
            if(setsrc!=setdest){
                list[setsrc].addAll(list[setdest]);
                list[setdest].clear();
                totMinCost+=ed.weight;
                System.out.printf("%d - %d :: %d\n",ed.src,ed.dest,ed.weight);
                //System.out.printf("%c - %c :: %d\n",(ed.src+65),(ed.dest+65),ed.weight);
            }
        }
        return totMinCost;
    }
    int buildMST(int nodes){
        //Set setup
        ArrayList<Integer>[] list=new ArrayList[nodes];
        for(int set=0;set<nodes;set++){
            list[set]=new ArrayList<>();
            list[set].add(set);
        }
        return findAndUnion(nodes, list);
    }
}

public class Main {
    public static void main(String[] args) {
        //Graph in Excel
				Edge[] edgeDB = {
            new Edge(0, 1, 5), new Edge(0, 3, 7), new Edge(0, 8, 3), new Edge(1, 7, 4),
            new Edge(7, 2, 3), new Edge(2, 3, 8), new Edge(3, 4, 2), new Edge(4, 8, 6),
            new Edge(2, 5, 1), new Edge(5, 6, 2)
        };
        
        //Graph in PPT
        /*Edge[] edgeDB = {
            new Edge(0, 5, 10), new Edge(5, 2, 3), new Edge(2, 3, 3), new Edge(3, 4, 1),
            new Edge(4, 6, 3), new Edge(6, 7, 3), new Edge(7, 0, 5), new Edge(0, 1, 8),
            new Edge(5, 1, 4), new Edge(2, 1, 4), new Edge(1, 4, 4), new Edge(1, 7, 4),
            new Edge(6, 3, 2), new Edge(5, 3, 6)
        };*/
        
        Kruskal_Operations kru = new Kruskal_Operations(edgeDB);
        kru.sort();
        int totalWeight = kru.buildMST(9);
        
        System.out.print("Total Wright of MST: "+totalWeight);
    }
}
