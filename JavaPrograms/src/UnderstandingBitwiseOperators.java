//WAP to understand the concept of Bitwise operators
import java.util.*;
public class UnderstandingBitwiseOperators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int a = 75,b=25,c,d=-75,e=-25;
        System.out.println("Bitwise and operator");
        c=a&b;
        System.out.println(c);
        System.out.println("Bitwise or operator");
        c=a|b;
        System.out.println(c);
        System.out.println("Bitwise Exclusive or operator");
        c=a^b;
        System.out.println(c);
        System.out.println("Bitwise left shift operator");
        c=a<<1;
        System.out.println(c);
        c=b<<2;
        System.out.println(c);
        System.out.println("Bitwise Right shift operator");
        c=a>>1;
        System.out.println(c);
        c=b>>2;
        System.out.println(c);
        System.out.println("Bitwise complementary operator");
        c=~a;
        System.out.println(c);
        c=~b;
        System.out.println(c);
        c=~d;
        System.out.println(c);
        c=~e;
        System.out.println(c);
    }
}
