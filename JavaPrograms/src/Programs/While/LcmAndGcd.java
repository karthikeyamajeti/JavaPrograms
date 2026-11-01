package Programs.While;
//LCM and GCD of given two numbers
import java.util.*;
public class LcmAndGcd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.println("Enter any two integer values");
        
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        int gcd,lcm,t;
        t=a*b;
        
        while(a!=b){
            if(a>b)
                a=a-b;
            else
                b=b-a;
        }
        gcd=a;
        lcm=t/gcd;
        System.out.println("The gcd of given two numbers is "+gcd);
        System.out.println("The lcm of given two numbers is "+lcm);
    }
}
