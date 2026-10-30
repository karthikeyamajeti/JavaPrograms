package BasicPrograms.ProgramsOnIfElse;
//WAP TO FIND SMALLEST OF ANY TWO NUMBERS USING 'if-else'
import java.util.*;
public class SmallestOfAnyTwoNumbersUsingIfElse {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the use for taking two integer values
        System.out.println("Enter any two intege values");
        
        //Reading two integer values a,b
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if(a<b){
            System.out.println(a+" is smallest");
        }else{
            System.out.println(b+" is smallest");
        }
        
    }
}
