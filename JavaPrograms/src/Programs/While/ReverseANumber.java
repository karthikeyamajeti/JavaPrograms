package Programs.While;
//WAP to input a number and reverse that number
import java.util.*;
public class ReverseANumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter an integer value:");
        
        //Reading an integer value
        int n = sc.nextInt();
        int r,rn=0;
        
        while(n>0){
            r = n%10;
            rn=rn*10+r;
            n/=10;
        }
        
        System.out.println("The reverse number is "+rn);
    }
}
