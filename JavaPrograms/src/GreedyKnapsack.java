import java.util.*;
public class GreedyKnapsack{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Reading number of items
        System.out.print("Enter number of items: ");
        int n = sc.nextInt();

        int profit[] = new int[n];
        int weight[] = new int[n];
        double ratio[] = new double[n];

        //reading profits
        System.out.println("Enter profits:");
        for(int i=0; i<n; i++) {
            profit[i] = sc.nextInt();
        }

        //Reading weights
        System.out.println("Enter weights:");
        for(int i=0; i<n; i++) {
            weight[i] = sc.nextInt();
        }

        //Reading knapsack capacity
        System.out.print("Enter capacity: ");
        int capacity = sc.nextInt();

        //Calculating profit-to-weight ratio
        for(int i=0; i<n; i++){
            ratio[i] = (double) profit[i]/weight[i];
        }

        // Sort items in descending order of ratio
        for(int i=0; i<n-1; i++){
            for(int j=i+1; j<n; j++) {

                if(ratio[i] < ratio[j]) {

                    // Swap ratios
                    double temp = ratio[i];
                    ratio[i] = ratio[j];
                    ratio[j] = temp;

                    // Swap profits
                    int t = profit[i];
                    profit[i] = profit[j];
                    profit[j] = t;

                    // Swap weights
                    t = weight[i];
                    weight[i] = weight[j];
                    weight[j] = t;
                }
            }
        }

        double totalProfit = 0;

        // Select items using Greedy method
        for(int i=0; i<n; i++) {

            if(weight[i] <= capacity) {

                // Take complete item
                totalProfit += profit[i];
                capacity -= weight[i];
            }
            else {

                // Take fraction of item
                totalProfit += ratio[i] * capacity;
                capacity = 0;
                break;
            }
        }

        // Display maximum profit
        System.out.println("Maximum profit: " + totalProfit);
        
    }
}
