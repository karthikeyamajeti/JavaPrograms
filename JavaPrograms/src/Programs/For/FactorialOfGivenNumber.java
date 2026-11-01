package Programs.For;
//WAP to find factorial of a given number
import java.util.*;
public class FactorialOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter an integer value:");
        int n = sc.nextInt();
        int f;
        
        for(f = 1;n>0;n--){
            f=f*n;
        }
        System.out.println("The factorial of given number is "+f);
    }
}
