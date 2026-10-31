//To input 2 integer values & find swapping of 2 values by using without temp variable
import java.util.Scanner;
public class SwappingOfTwoVariablesWithoutUsingTemporaryVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.println("Enter any two integer values");
        
        //Reading two integer values
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        System.out.println("Before swapping");
        System.out.println(x+"\t"+y);
        
        //Main logic of swapping
        x = x+y;
        y = x-y;
        x = x-y;
        
        /*
            x = x*y;
            y = x/y;
            x = x/y;
        */
        /*
            x = x^y;
            y = x^y;
            x = x^y;
        */
        
        System.out.println("After swapping");
        System.out.println(x+"\t"+y);
    }
}
