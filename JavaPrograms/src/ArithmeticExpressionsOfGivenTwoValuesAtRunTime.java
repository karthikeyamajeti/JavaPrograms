//To input 2 integer values & perform arithmetic expressions for given two value
import java.util.*;
public class ArithmeticExpressionsOfGivenTwoValuesAtRunTime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.println("Enter two integer values");
        
        //Reading two integer vlaues;
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        System.out.println("The sum of "+a+" and "+b+" is "+(a+b));
        System.out.println("The sub of "+a+" and "+b+" is "+(a-b));
        System.out.println("The mul of "+a+" and "+b+" is "+(a*b));
        System.out.println("The div of "+a+" and "+b+" is "+(a/b));
        System.out.println("The mod of "+a+" and "+b+" is "+(a%b));
    }
}
