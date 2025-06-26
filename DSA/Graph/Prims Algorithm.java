import java.util.*;

class GraphOperations
{
	int[][] adjMax;
	int nodes;

	GraphOperations(int nodes, int[][] adjMax)
	{
		this.adjMax=adjMax;
		this.nodes=nodes;
	}

	int findMinDistance(int[] distance, boolean[] visited)
	{
		int min = Integer.MAX_VALUE;
		int min_index = -1;

		for(int v=0; v<nodes; v++)
		{
			if(visited[v] == false && distance[v] < min)
			{
				min = distance[v];
				min_index = v;
			}
		}

		return min_index;
	}

	void ShortestPath(int currNode)
	{
		boolean[] visited = new boolean[nodes];
		int[] distance = new int[nodes];
		int[] parent = new int[nodes];

		Arrays.fill(distance, Integer.MAX_VALUE);
		Arrays.fill(parent,-1);
		distance[currNode] = 0;

		for(int count = 0; count<nodes; count++)
		{
			visited[currNode] = true;

			for(int enode=0; enode<nodes; enode++)
			{
				if(adjMax[currNode][enode] != 0 && visited[enode] == false)
				{
					if(distance[enode] > adjMax[currNode][enode])
					{
						parent[enode] = currNode;
						distance[enode] =adjMax[currNode][enode];
					}
				}
			}

			currNode = findMinDistance(distance, visited);

		}

		System.out.printf("Node\tVisited\tDistance\tParent\n");
		int minCost = 0;

		for(int i=0; i<nodes; i++)
		{
			System.out.printf("%d\t%b\t%d\t%d\n", i, visited[i], distance[i], parent[i]);
			minCost+=distance[i];
		}
		System.out.println("The minimum spanning cost: "+minCost);

	}


}


public class Main                     //Driver Class
{
	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);

		System.out.print("Enter number of nodes in a graph: ");
		int nodes = scan.nextInt();

		System.out.print("Enter the number of edges in the graph: ");
		int edges = scan.nextInt();
		
		int[][] graph=new int[nodes][nodes];

		System.out.printf("Enter the start node, enode, weight of %d Edges: ", edges);
		for(int ed=0; ed<edges; ed++)
		{
			int snode = scan.nextInt();
			int enode = scan.nextInt();
			int weight = scan.nextInt();

			graph[snode][enode]=weight;
			graph[enode][snode]=weight;
		}

		GraphOperations gp=new GraphOperations(nodes, graph);

		System.out.println("Enter the Source node of Dijkstra: ");
		int source = scan.nextInt();

		gp.ShortestPath(source);
	}
}
