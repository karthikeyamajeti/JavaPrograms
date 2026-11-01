package Programs.For;
//To print 10 natural numbers 10 odd numbers 10 even numbers
import java.util.*;
public class PrintTenNaturalNumbersOddNumbersEvenNubers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Natural\tOdd\tEven");
        int n,o,e;
        for(n=1,o=1,e=2; n<=10; n=n+1,o=o+2,e=e+2){
            System.out.println(n+"\t"+o+"\t"+e);
        }
    }
}
