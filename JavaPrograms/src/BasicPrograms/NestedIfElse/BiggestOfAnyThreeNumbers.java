package BasicPrograms.NestedIfElse;
//WAP TO FIND BIGGEST OF ANY THREE NUMBERS USING NESTED 'if else'
import java.util.*;
public class BiggestOfAnyThreeNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.println("Enter any three integer values");
        
        //Reading 4 integer values
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        //Main Logic
        if(a>b){
            if(a>c)
                System.out.println(a+" is biggest");
            else
                System.out.println(c+" is biggest");
        }else{
            if(b>c)
                System.out.println(b+" is biggest");
            else
                System.out.println(c+" is biggest");
        }
        
    }
}
