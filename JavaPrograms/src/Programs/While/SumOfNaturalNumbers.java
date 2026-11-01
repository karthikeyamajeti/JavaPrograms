package Programs.While;
//WAP to find the sum of 1 to x natural numbers
import java.util.*;
public class SumOfNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter a final value: ");
        
        //Reading an integer value
        int x = sc.nextInt();
        
        int n = 1,sum=0;
        
        while(n<=x){
            sum+=n;
            n++;
        }
        
        System.out.println("The sum of 1 to "+x+" natural numbers is "+sum);
    }
}
