package Programs.Arrays;
//Write a Java program to read `n` integer values into an array using a user-defined method `input()` and display all the array elements using another user-defined method `display()
import java.util.Scanner;
public class ReadingAndTraversing {
    // Method to accept integer array values
    public static void input(int x[]){
        Scanner sc = new Scanner(System.in);

        // Displaying message to enter array values
        System.out.println("Enter " + x.length + " integer array values");

        // Loop to read array elements
        for(int i = 0; i < x.length; i++)
            x[i] = sc.nextInt();
    }
    // Method to display integer array values
    public static void display(int x[]){
        // Displaying the number of array elements
        System.out.println("The " + x.length + " integer array values");

        // Loop to print all array elements
        for(int i = 0; i < x.length; i++)
            System.out.print(x[i] + "\t");

        // Moving the cursor to the next line
        System.out.println();
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        // Asking the user to enter the number of values
        System.out.print("Enter No. of Values to input:");

        // Reading the number of array elements
        int n = sc.nextInt();

        // Creating an integer array of size n
        int a[] = new int[n];

        // Calling input() method to accept array values
        input(a);

        // Calling display() method to print array values
        display(a);
    }
}