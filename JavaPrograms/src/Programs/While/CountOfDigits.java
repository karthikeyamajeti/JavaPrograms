package Programs.While;
//WAP to count the digits of given number 
import java.util.*;
public class CountOfDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter an integer value:");
        
        //Reading an integer value
        int n = sc.nextInt();
        
        //Initialising count to zero
        int count = 0;
        
        while(n>0){
            count++;
            n/=10;
        }
        
        System.out.println("The count of digits of given number is "+count);
    }
}
