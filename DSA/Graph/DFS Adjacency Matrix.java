import java.util.*;

class GraphOperation {

	int nodes;
	int[][] adjMatrix;

	GraphOperation(int nodes, int[][] matrix) {
		this.nodes = nodes;
		this.adjMatrix = matrix;
	}
	// Method to print the adjacency matrix
	public static void printAdjacentMatrix(int[][] graph, int nodes) {
		System.out.println("\nAdjacency Matrix:");
		for (int snode = 0; snode < nodes; snode++) {
			for (int enode = 0; enode < nodes; enode++) {
				System.out.print(graph[snode][enode] + " ");
			}
			System.out.println();
		}
	}



	// DFS helper (recursive)
	void dfsTraversalMatrix_helper(int currNode, boolean[] visited) {
		visited[currNode] = true;
		System.out.print(currNode + " ");
		for(int enode=0; enode<nodes; enode++) {
			if(adjMatrix[currNode][enode]!=0 && visited[enode]==false) {
				dfsTraversalMatrix_helper(enode,visited);
			}
		}
	}


	// DFS wrapper
	void dfsTraversalMatrix(int start) {
		boolean[] visited = new boolean[nodes];
		System.out.println("\nDFS Traversal starting from node " + start + ":");
		dfsTraversalMatrix_helper(start, visited);

		// Check for disconnected components
		for (int vindex = 0; vindex < nodes; vindex++) {
			if (!visited[vindex]==false) {
				dfsTraversalMatrix_helper(vindex, visited);
			}
		}
	}
}

public class Main {
	public static void main(String[] args) {
		Scanner ip = new Scanner(System.in);

		System.out.print("Enter number of nodes: ");
		int nodes = ip.nextInt();

		System.out.print("Enter number of edges in graph: ");
		int edges = ip.nextInt();

		System.out.print("Is it directed? (y/n): ");
		String directed = ip.next();

		int[][] graph = new int[nodes][nodes];

		for (int ed = 0; ed < edges; ed++) {
			System.out.printf("Enter start node, end node, weight of edge %d: ", ed + 1);
			int snode = ip.nextInt();
			int enode = ip.nextInt();
			int weight = ip.nextInt();

			graph[snode][enode] = weight;

			if (directed.equalsIgnoreCase("n")) {
				graph[enode][snode] = weight;
			}
		}

		GraphOperation gp = new GraphOperation(nodes,graph);
		gp.printAdjacentMatrix(graph, nodes);
		//gp.convertMatrixToList(graph);
		//gp.printAdjacencyList();

		System.out.print("\nEnter the start node to start DFS: ");
		int start = ip.nextInt();

		gp.dfsTraversalMatrix(start);


	}
}
