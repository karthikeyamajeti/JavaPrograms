package Programs.For;
//Given number is perfect number or not
import java.util.*;
public class PerfectNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter an integer value:");
        
        //Reading an integer value
        int n = sc.nextInt();
        int sum=0;
        
        for(int i=1;i<n;i++){
            if(n%i==0)
                    sum=sum+i;
        }
        
        if(n==sum){
            System.out.println(n+" is perfect number");
        }else{
            System.out.println(n+" is not a perfect number");
        }
        
    }
}
