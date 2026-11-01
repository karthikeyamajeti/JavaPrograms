package Programs.For;
//Given number is armstrong number or not
import java.util.*;
public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter an integer value:");
        
        //Read an integer value
        int n = sc.nextInt();
        int t = n,sum,r;
        
        for(sum=0;n>0;n=n/10){
            r=n%10;
            sum=sum+r*r*r;
        }
        
        if(t==sum){
            System.out.println(t+" is an armstrong number");
        }else{
            System.out.println(t+" is not an armstrong number");
        }
        
    }
}
