package Programs.IfElseIf;
//WAP to find biggest of any three numbers by using if...else if
import java.util.*;
public class BiggestOfAnyThreeNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.println("Enter any three integer values");
        
        //Reading the three integer values;
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        
        if(a>b && a>c){
            System.out.println(a+" is  biggest");
        }else if(b>c){
            System.out.println(b+" is  biggest");
        }else{
            System.out.println(c+" is  biggest");
        }
        
    }
}
