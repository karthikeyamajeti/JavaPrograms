package Programs.For;
//WAP to find factorial of a given number
import java.util.*;
public class FactorialOfGivenNumber1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter an integer value:");
        int n = sc.nextInt();
        int f=1;
        
        for(int i=1; i<=n; i++){
            f=f*i;
        }
        
        System.out.println("The factorial of given number is "+f);
    }
}
