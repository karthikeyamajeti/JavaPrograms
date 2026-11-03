import java.util.*;
//WAP to implement Prim's Algorithm to find the Minimum Spanning Tree (MST) of a connected, weighted, undirected graph using an adjacency matrix
public class PrimsAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Reading number of vertices
        System.out.print("Enter the number of vertices: ");
        int n = sc.nextInt();

        //Creating 2D array to store the adjacency matrix
        int cost[][] = new int[n][n];
        
        //Reading the adjacency matrix
        System.out.println("Enter the adjacency matrix:");
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                cost[i][j] = sc.nextInt();
            }
        }

        // Create visited array
        // 0 = Not visited, 1 = Visited
        int visited[] = new int[n];

        // Start from vertex 0
        visited[0] = 1;

        // Initialize edge count and minimum cost
        int edges = 0, mincost = 0;

        // MST must contain exactly n-1 edges
        while(edges < n-1){

            // Initialize minimum edge weight
            int min = Integer.MAX_VALUE;

            // Initialize source and destination vertices
            int u = -1, v = -1;

            // Check all vertices
            for(int i = 0; i < n; i++){

                // Consider only visited vertices
                if(visited[i] == 1){

                    // Check all possible destination vertices
                    for(int j = 0; j < n; j++){

                        // Check whether destination is unvisited,
                        // edge exists, and edge weight is minimum
                        if(visited[j] == 0 && cost[i][j] != 0 && cost[i][j] < min){

                            // Update minimum edge weight
                            min = cost[i][j];

                            // Store source vertex
                            u = i;

                            // Store destination vertex
                            v = j;
                        }
                    }
                }
            }

            // Check whether a valid edge was found
            if(u == -1){

                System.out.println("MST not possible");
                sc.close();
                return;
            }

            // Add selected edge weight to total MST cost
            mincost += min;

            // Mark the new vertex as visited
            visited[v] = 1;

            // Increase selected edge count
            edges++;
        }

        //Displaying the minimum cost of MST
        System.out.println("Minimum cost of MST: " + mincost);
    }
}
