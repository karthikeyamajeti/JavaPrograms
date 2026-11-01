//Understanding increment and decrement concept
import java.util.*;
public class IncrementAndDecrement {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        int n =8;
        
        //Print the nth value and then increment the nth value by one
        System.out.println(n++);
        
        //Fist increment the nth value by one and then print the nth value
        System.out.println(++n);
        
        //Print the nthe value and decrement the nth vlaue by one
        System.out.println(n--);
        
        //First decrement the nth value by one and then print the nth value;
        System.out.println(--n);
    }
}
