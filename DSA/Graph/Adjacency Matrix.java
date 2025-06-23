import java.util.*;
class GraphOperations{
    static void printAdjMatrix(int graph[][], int nodes){
        for(int s_node=0;s_node<nodes;s_node++){
            for(int e_node=0;e_node<nodes;e_node++){
            System.out.print(graph[s_node][e_node]+" ");
            }
            System.out.println();
            
        } 
        
    }
    
}
public class Main{
    public static void main(String [] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the number of nodes in a graph: ");
        int nodes=sc.nextInt();
        System.out.print("Enter the number of edges in a graph: ");
        int edges=sc.nextInt();
        System.out.print("Is the graph direct? (Yes/No): ");
        String directed=sc.next();
        
        int graph[][]=new int[nodes][nodes];
        for(int ed=0;ed<edges;ed++){
            System.out.printf("Enter the start node, end node, weight of edge node %d: ",ed+1);
            int s_node=sc.nextInt();
            int e_node=sc.nextInt();
            int weight=sc.nextInt();
            
            graph[s_node][e_node]=weight;
            if(directed.equals("No")){
                graph[e_node][s_node]=weight;
            }
        } 
            System.out.println("The Adjacency Matrix: ");
            GraphOperations.printAdjMatrix(graph,nodes);
        
    }
    
}


