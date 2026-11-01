package Programs.While;
//WAP to print fibonacci series upto n
import java.util.*;
public class ToPrintFibonacciSeriesUptoN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Promprt for the user
        System.out.print("Enter a final value:");
        
        //Reading an integer value
        int n = sc.nextInt();
        int a=0,b=1,c;
        
        System.out.print(a+"\t"+b);
        c=a+b;
        while(c<=n){
            System.out.print(c+"\t");
            a=b;
            b=c;
            c=a+b;
        }
    }
}