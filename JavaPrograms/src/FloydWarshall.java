import java.util.*;
public class FloydWarshall{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Reading number of vertices
        System.out.print("Enter number of vertices: ");
        int n = sc.nextInt();

        // Create distance matrix
        int dist[][] = new int[n][n];

        // Read adjacency matrix
        System.out.println("Enter the adjacency matrix:");
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++){
                dist[i][j] = sc.nextInt();
                // Convert -1 into infinity
                if(dist[i][j] == -1) {
                    dist[i][j] = 99999;
                }
            }
        }

        // Floyd-Warshall Algorithm
        for(int k=0; k<n; k++){
            for(int i=0; i<n; i++) {
                for(int j=0; j<n; j++) {
                    // Check if path through vertex k is shorter
                    if(dist[i][k] != 99999 &&
                       dist[k][j] != 99999 &&
                       dist[i][k] + dist[k][j] < dist[i][j]) {
                        // Update shortest distance
                        dist[i][j] = dist[i][k] + dist[k][j];
                    }
                }
            }
        }

        // Display shortest distance matrix
        System.out.println("Shortest distance matrix:");
        for(int i=0; i<n; i++){
            for(int j=0;j<n; j++){
                // Print INF if no path exists
                if(dist[i][j] == 99999) {
                    System.out.print("INF");
                }
                else {
                    System.out.print(dist[i][j]);
                }
                System.out.print(" ");
            }
            System.out.println();
        }
    }
}