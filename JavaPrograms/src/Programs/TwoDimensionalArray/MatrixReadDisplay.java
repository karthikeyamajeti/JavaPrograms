package Programs.TwoDimensionalArray;
// WAP to read and display elements of an n×m matrix using 2D array
import java.util.Scanner;
public class MatrixReadDisplay {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Reading number of rows and columns from user
        System.out.println("Enter number of rows and columns of 2D array");
        int n = sc.nextInt();
        int m = sc.nextInt();

        // Creating a 2D array with n rows and m columns
        int[][] a = new int[n][m];

        // Reading matrix elements from user
        System.out.println("Enter "+n+"X"+m+" Matrix values:");
        
        for(int i = 0; i<a.length; i++){
            for(int j = 0; j<a[i].length; j++){
                a[i][j] = sc.nextInt();
            }
        }

        // Displaying the matrix elements
        System.out.println("The " + n + "X" + m + " Matrix values:");

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]+"\t");
            }
            System.out.println();
        }
    }
}