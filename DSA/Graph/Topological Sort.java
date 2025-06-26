import java.util.*;

class GraphOperations{
    int nodes;
    int[][] adjMat;
    GraphOperations(int nodes, int[][]adjMat){
        this.nodes=nodes;
        this.adjMat=adjMat;
    }
    
    void dfsTopology_helper(int currNode, boolean[] visited, Stack<Integer> stk){
        visited[currNode]=true;
        for(int enode=0;enode<nodes;enode++){
            if(adjMat[currNode][enode]!=0 && visited[enode]==false){
                dfsTopology_helper(enode,visited,stk);
            }
        }
        stk.push(currNode);
    }
    void dfsTopology(){
        boolean[] visited=new boolean[nodes];
        Stack<Integer> stk=new Stack<>();
        for(int nodNo=0;nodNo<nodes;nodNo++){
            if(visited[nodNo]==false){
                dfsTopology_helper(nodNo, visited, stk);
            }
        }
        System.out.println("Topological Sort: ");
        while(stk.isEmpty()!=true){
            System.out.print(stk.pop()+" ");
        }
        
    }
}

class Main    //Graph_Matrix_Topology	//Driver Class
{
	public static void main(String[] args)
	{
		Scanner ip=new Scanner(System.in);
		System.out.print("Enter number of nodes in a graph: ");
		int nodes=ip.nextInt();
		System.out.print("Enter the number of edges in the graph: ");
		int edges=ip.nextInt();
int[][] graph=new int[nodes][nodes];
		
		System.out.printf("Enter the start node, enode, weight of each edges (Direct Acyclic Graph) :\n");
		for(int ed=0; ed<edges; ed++)
		{
			int snode=ip.nextInt();		
			int enode=ip.nextInt();		
			int weight=ip.nextInt();	
			
			graph[snode][enode]=weight;		//Directed Graph
		}
GraphOperations gp=new GraphOperations(nodes, graph);
		gp.dfsTopology();
	}
}
