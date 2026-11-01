package Functions.Withoutargumentsandwithoutreturnvalue;
// WAP to find sum of two numbers without arguments and without return value
import java.util.*;
public class AdditionOfTwoNumbers {
    // User-defined method without arguments and without return value
    public static void add() {
        Scanner sc = new Scanner(System.in);
        
        // Prompt for the user
        System.out.println("Enter two integer values");

        // Reading two integer values
        int x = sc.nextInt();
        int y = sc.nextInt();

        // Calculating the sum
        int sum = x+y;

        // Printing the final sum
        System.out.println("The addition of two numbers is " + sum);
    }

    public static void main(String[] args) {
        // Calling the add() method without passing arguments
        add();
    }
}
