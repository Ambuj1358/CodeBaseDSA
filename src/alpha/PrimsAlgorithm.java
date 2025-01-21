package alpha;

import java.util.*;

public class PrimsAlgorithm {

    // Edge class to store vertex and weight of the edge
    static class Edge {
        int vertex;
        int weight;

        public Edge(int vertex, int weight) {
            this.vertex = vertex;
            this.weight = weight;
        }
    }

    // Function to calculate the sum of minimum cost of MST using Prim's algorithm
    // and also to return the MST as an adjacency list
    public static List<Edge>[] primMST(List<Edge>[] graph, int startVertex) {
        int mstCost = 0;
        boolean[] visited = new boolean[graph.length];
        PriorityQueue<Edge> minHeap = new PriorityQueue<>(Comparator.comparingInt(e -> e.weight));
        List<Edge>[] mst = new List[graph.length];//all vertex will take part inside this mst graph also
        for (int i = 0; i < graph.length; i++) {
            mst[i] = new ArrayList<>();
        }//initialising arraylist inside array with null value to avoid null pointer exception

        // Add initial vertex to the heap with 0 cost
        minHeap.add(new Edge(startVertex, 0));//as vertex has no mapping with itself so take it as wt->0 which will not affect mstCost

        while (!minHeap.isEmpty()) {
            Edge currentEdge = minHeap.poll();
            int currentVertex = currentEdge.vertex;

            // If the vertex is already visited, skip it
            if (visited[currentVertex]) {
                continue;
            }

            // Add the vertex to the visited set and update the MST cost
            visited[currentVertex] = true;
            mstCost += currentEdge.weight;

            // If it's not the starting vertex, add the edge to the MST
            if (currentEdge.weight != 0) {
                mst[currentEdge.vertex].add(new Edge(currentVertex, currentEdge.weight));
              //  mst[currentVertex].add(new Edge(currentEdge.vertex, currentEdge.weight));
            }

            // Iterate through all the adjacent vertices and add the edges to the priority queue
            for (Edge edge : graph[currentVertex]) {
                if (!visited[edge.vertex]) {
                    minHeap.add(edge);
                }
            }
        }

        System.out.println("Total cost of MST: " + mstCost);
        return mst;
    }

    public static void main(String[] args) {
        // Number of vertices in the graph
        int numVertices = 5;

        // Create the graph as an adjacency list
        List<Edge>[] graph = new List[numVertices];
        for (int i = 0; i < numVertices; i++) {
            graph[i] = new ArrayList<>();
        }

        // Initialize the graph
        graph[0].add(new Edge(1, 2));
        graph[0].add(new Edge(3, 6));
        graph[1].add(new Edge(0, 2));
        graph[1].add(new Edge(2, 3));
        graph[1].add(new Edge(3, 8));
        graph[1].add(new Edge(4, 5));
        graph[2].add(new Edge(1, 3));
        graph[2].add(new Edge(4, 7));
        graph[3].add(new Edge(0, 6));
        graph[3].add(new Edge(1, 8));
        graph[4].add(new Edge(1, 5));
        graph[4].add(new Edge(2, 7));

        // Find the MST and print it
        List<Edge>[] mst = primMST(graph, 0);
        for (int i = 0; i < mst.length; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Edge edge : mst[i]) {
                System.out.print(" -> (" + edge.vertex + ", " + edge.weight + ")");
            }
            System.out.println();
        }
    }
}

