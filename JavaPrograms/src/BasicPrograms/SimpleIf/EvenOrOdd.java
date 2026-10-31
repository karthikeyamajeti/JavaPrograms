package BasicPrograms.SimpleIf;
//WAP TO FIND WHETHER THE GIVEN NUMBER IS EVEN NUMBER OR ODD NUMBER 
import java.util.*;
public class EvenOrOdd {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter an integer value:");
                
        //Reading an integer
        int n = sc.nextInt();
        
        //Main logic
        if(n%2==0){
            System.out.println("Even Number");
        }
        if(n%2!=0){
            System.out.println("Odd Number");
        }
        
    }
}
