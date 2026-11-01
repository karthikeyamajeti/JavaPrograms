//WAP to input a string
import java.util.*;
public class InputingAString {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter a string:");
        
        //Reading an string
        String str = sc.nextLine();
        
        //Printing a string
        System.out.println("The given string is "+str);
    }
}
