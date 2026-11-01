package Functions.Withoutargumentsandwithreturnvalue;
// WAP to find sum of two numbers using without arguments and with return value
import java.util.*;
public class AdditionOfTwoNumbers {
    /*
    User-defined method to add two integers.
    Without arguments and with return value.
    @return int - The arithmetic sum of two numbers
    */
    public static int add() {
        Scanner sc = new Scanner(System.in);

        // Prompt for the user
        System.out.println("Enter two integer values");

        // Reading two integer values
        int x = sc.nextInt();
        int y = sc.nextInt();

        // Calculating the sum
        int sum = x + y;

        // Returning the sum
        return sum;
    }

    public static void main(String[] args) {
        // Calling the add() method and storing the returned value
        int sum = add();

        // Printing the final sum
        System.out.println("The addition of two numbers is " + sum);
    }
}