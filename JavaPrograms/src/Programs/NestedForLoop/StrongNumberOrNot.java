package Programs.NestedForLoop;
//WAP to check whether the given number is strong number or not
import java.util.*;
public class StrongNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter an integer value:");
        
        //Reading an integer value
        int n = sc.nextInt();
        
        int t=n,sum,r,f;
        
        for(sum=0;n>0;n/=10){
            r = n%10;
            for(f=1;r>0;r--){
                f=f*r;
            }
            sum+=f;
        }
        
        if(t==sum){
            System.out.println(t+" is a strong number");
        }else{
            System.out.println(t+" is not a strong number");
        }
    }
}
