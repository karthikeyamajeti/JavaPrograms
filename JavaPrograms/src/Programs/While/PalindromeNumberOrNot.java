package Programs.While;
//WAP to check whether the given number is palindrome or not
import java.util.*;
public class PalindromeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter an integer value:");
        
        //Reading an integer value
        int n = sc.nextInt();
        int t=n,r,rn=0;
        
        while(n>0){
            r = n%10;
            rn=rn*10+r;
            n/=10;
        }
        
        if(t==rn){
            System.out.println(t+" is palindrome");
        }else{
            System.out.println(t+" is not a palindrome");
        }
    }
}
