import java.util.*;
public class DijkstrasAlgorithm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //1.Read graph
        int n = sc.nextInt();

        int cost[][] = new int[n][n];

        for(int i=0; i<n; i++) {
            for(int j=0; j<n; j++) {
                cost[i][j]=sc.nextInt();
            }
        }

        //2.Read source vertex
        int src = sc.nextInt();

        // 3. Initialize arrays
        int dist[] = new int[n];
        int visited[] = new int[n];

        for(int i=0; i<n; i++){
            dist[i] = Integer.MAX_VALUE;
        }

        dist[src] = 0;

        // 4. Dijkstra's Algorithm
        for(int count = 0; count < n; count++) {

            int min = Integer.MAX_VALUE;
            int u = -1;

            // Find minimum distance vertex
            for(int i = 0; i < n; i++) {
                if(visited[i] == 0 && dist[i] < min) {
                    min = dist[i];
                    u = i;
                }
            }

            if(u == -1) {
                break;
            }

            visited[u] = 1;

            // Update adjacent vertices
            for(int v = 0; v < n; v++) {

                if(visited[v] == 0 &&
                   cost[u][v] != 0 &&
                   dist[u] != Integer.MAX_VALUE &&
                   dist[u] + cost[u][v] < dist[v]) {

                    dist[v] = dist[u] + cost[u][v];
                }
            }
        }

        // 5. Print shortest distances
        for(int i=0; i<n; i++) {
            if(dist[i]  == Integer.MAX_VALUE) {
                System.out.println("INF");
            }
            else {
                System.out.println(dist[i]);
            }
        }
    }
}
