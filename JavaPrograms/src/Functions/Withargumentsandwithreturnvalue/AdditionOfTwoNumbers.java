package Functions.Withargumentsandwithreturnvalue;
//WAP to find sum of two numbers using with arguments and with return value
import java.util.*;
public class AdditionOfTwoNumbers {
    /*
    User-defined method to add two integers.
    @param x - The first integer value passed as an argument
    @param y - The second integer value passed as an argument
    @return int - The arithmetic sum of x and y
    */
    public static int add(int x,int y){
        return x+y;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.println("Enter two integer values");
        
        //Reading two integer values
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        // Calls the 'add' method by passing x and y as arguments 
        // and stores the returned integer value in the 'sum' variable
        int sum=add(x,y);
        
        // Prints the final calculated sum to the console
        System.out.println("The addition of two numbers is "+sum);
    }
}
