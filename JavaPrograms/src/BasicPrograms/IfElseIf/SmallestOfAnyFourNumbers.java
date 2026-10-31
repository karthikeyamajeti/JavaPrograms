package BasicPrograms.IfElseIf;
//WAP to find smallest of any four numbers using if...else if
import java.util.*;
public class SmallestOfAnyFourNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.println("Enter any four integer values");
        
        //Reading four integer values
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        //Main logic
        if(a<b && a<c && a<d){
            System.out.println(a+" is smallest");
        }else if(b<c && b<d){
            System.out.println(b+" is smallest");
        }else if(c<d){
            System.out.println(c+" is smallest");
        }else{
            System.out.println(d+" is smallest");
        }
        
    }
}
