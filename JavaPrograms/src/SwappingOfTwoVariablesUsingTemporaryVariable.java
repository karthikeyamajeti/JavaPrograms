//To input 2 integer values & find swapping of two values by using Temporary variable
import java.util.*;
public class SwappingOfTwoVariablesUsingTemporaryVariable {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.println("Enter any two integer values");
        
        //Reading two integer values
        int x = sc.nextInt();
        int y = sc.nextInt();
        
        System.out.println("Before swapping");
        System.out.println(x+"\t"+y);
        
        //SMain logic of swapping
        int temp = x;
        x = y;
        y = temp;
        
        System.out.println("After swapping");
        System.out.println(x+"\t"+y);
    }
}