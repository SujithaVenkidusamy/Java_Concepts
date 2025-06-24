import java.util.*;

class Node {
    int enode;
    int weight;
    Node link;

    Node(int enode, int weight) {
        this.enode = enode;
        this.weight = weight;
        this.link = null;
    }
}

class GraphOperation {
    Node[] list;
    int nodes;

    GraphOperation(int nodes) {
        list = new Node[nodes];
        this.nodes = nodes;
    }

    // Method to print the adjacency matrix
    public static void printAdjacentMatrix(int[][] graph, int nodes) {
        System.out.println("\nAdjacency Matrix:");
        for (int i = 0; i < nodes; i++) {
            for (int j = 0; j < nodes; j++) {
                System.out.print(graph[i][j] + " ");
            }
            System.out.println();
        }
    }

    // Convert matrix to adjacency list using custom Node class
    public void convertMatrixToList(int[][] graph) {
        for (int snode = 0; snode < nodes; snode++) {
            Node head = null;
            Node tail = null;

            for (int enode = 0; enode < nodes; enode++) {
                if (graph[snode][enode] != 0) {
                    Node newNode = new Node(enode, graph[snode][enode]);
                    if (head == null) {
                        head = newNode;
                        tail = newNode;
                    } else {
                        tail.link = newNode;
                        tail = newNode;
                    }
                }
            }

            list[snode] = head;
        }
    }

    // Print adjacency list
    public void printAdjacencyList() {
        System.out.println("\nAdjacency List:");
        for (int i = 0; i < nodes; i++) {
            System.out.print(i + " -> ");
            Node temp = list[i];
            while (temp != null) {
                System.out.print("(" + temp.enode + ", weight=" + temp.weight + ") ");
                temp = temp.link;
            }
            System.out.println();
        }
    }

    // DFS traversal helper method
    private void dfsTraversal_helper(int currNode, boolean[] visited) {
        visited[currNode] = true;
        System.out.print(currNode + " ");
        Node temp = list[currNode];
        while (temp != null) {
            if (!visited[temp.enode]) {
                dfsTraversal_helper(temp.enode, visited);
            }
            temp = temp.link;
        }
    }

    // Public method to start DFS traversal from a node
    public void dfsTraversal(int startNode) {  //Wrapper Function
        boolean[] visited = new boolean[nodes];
        System.out.print("DFS Traversal starting from node " + startNode + ": ");
        dfsTraversal_helper(startNode, visited);
        
        /*For Disconnected Graph
        for(int i=0;i<nodes;i++){
            if(visited[i]==false){
                dfsTraversal_helper(i, visited);
            }
        }*/
        System.out.println();
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

        // Print adjacency matrix
        GraphOperation.printAdjacentMatrix(graph, nodes);

        // Convert to and print adjacency list
        GraphOperation gp = new GraphOperation(nodes);
        gp.convertMatrixToList(graph);
        gp.printAdjacencyList();

        // Perform DFS traversal starting from node 0 (you can change the start node)
        gp.dfsTraversal(0);

        ip.close();
    }
}
