package Programs.For;
//Given number is a prime number or not using for loop
import java.util.*;
public class PrimeNumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer value:");
        int n = sc.nextInt(),i;
        
        for(i=2;i*i<=n;i++){
            if(n%i==0)
                break;
        }
        
        if(n==i)
            System.out.println(n+" is Prime number");
        else
            System.out.println(n+" is not a Prime number");
    }
}
