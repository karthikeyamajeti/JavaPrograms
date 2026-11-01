package Functions.Withargumentsandwithoutreturnvalue;
// WAP to find sum of two numbers using with arguments and without return value
import java.util.*;
public class AdditionOfTwoNumbers {
    /*
    User-defined method to add two integers.
    @param x - The first integer value passed as an argument
    @param y - The second integer value passed as an argument
    */
    public static void add(int x, int y){
        // Calculating the sum
        int sum = x+y;
        
        // Printing the final sum
        System.out.println("The addition of two numbers is "+sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Prompt for the user
        System.out.println("Enter two integer values");

        // Reading two integer values
        int x = sc.nextInt();
        int y = sc.nextInt();

        // Calling the add() method by passing arguments
        add(x, y);
    }
}
