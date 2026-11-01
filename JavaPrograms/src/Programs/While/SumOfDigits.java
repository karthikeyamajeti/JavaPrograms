package Programs.While;
//WAP to find the sum of the digits in a given number
import java.util.*;
public class SumOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter an integer value:");
        
        
        //Reading an integer value
        int n = sc.nextInt();
        int r,sum=0;
        
        while(n>0){
            r = n%10;
            sum+=r;
            n/=10;
        }
        
        System.out.println("The sum of the digits of given number is "+sum);
    }
}
