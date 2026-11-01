//WAP to input a character
import java.util.*;
public class InputingACharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter a character:");
        
        //Reading an character
        char ch = sc.next().charAt(0);
        
        //Printing a character
        System.out.println("The entered character is "+ch);
    }
}
