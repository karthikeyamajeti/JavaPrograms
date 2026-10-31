package BasicPrograms.SimpleIf;
//WAP TO FIND WHETHER THE GIVEN NUMBER IS A POSITTIVE NUMBER OR  NEGATIVE NUMBER OR ZERO
import java.util.*;
public class PositiveOrNegativeNumberOrZero {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter an integer value:");
        
        //Reading an integer 
        int n = sc.nextInt();
        
        //Main logic
        if(n>0){
            System.out.println("Positive number");
        }        
        if(n<0){
            System.out.println("Negative number");
        }        
        if(n==0){
            System.out.println("Zero");
        }
        
    }
}
