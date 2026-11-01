package Programs.While;
//WAP to print 1 to x natural numbers
import java.util.*;
public class PrintOneToXNaturalNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter a final value:");
        
        //Reading a value
        int x = sc.nextInt();
        
        int n = 1;
        
        while(n<=x){
            System.out.print(n+" \t");
            n++;
        }
    }
}
