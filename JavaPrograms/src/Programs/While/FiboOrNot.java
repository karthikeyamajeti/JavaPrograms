package Programs.While;
//WAP to tell whether the given number is fibo number or not
import java.util.*;

public class FiboOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer value: ");
        int n = sc.nextInt();
        
        int a = 0, b = 1, c = 0;
        boolean found = false;
        
        // Handle edge cases immediately: 0 and 1 are always Fibonacci numbers
        if (n == 0 || n == 1) {
            found = true;
        } else {
            // Generate next numbers until we meet or cross the target 'n'
            c = a + b; 
            while (c <= n) {
                if (c == n) {
                    found = true;
                    break;
                }
                a = b;
                b = c;
                c = a + b; // Fix: Correctly calculate the next term instead of c = a = b
            }
        }
        
        // Direct boolean check (no need for == true)
        if (found) {
            System.out.println(n + " is a fibo number");
        } else {
            System.out.println(n + " is not a fibo number");
        }
        
        sc.close();
    }
}
