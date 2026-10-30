package BasicPrograms.ProgramsOnSimpleIf;
//WAP TO FIND BIGGEST OF ANY FOUR NUMBERS USING SIMPLE 'if'
import java.util.*;
public class BiggestOfAnyFourNumbers {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //Prompt for user
        System.out.println("Enter any four integer values");
        
        //Reading 4 integer values
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int d = sc.nextInt();
        
        //Assuming the big element as a
        int big = a;
        
        //Checking the whether the remaining elements are bigger than big or not
        if(b>big){
            big = b;
        }
        
        if(c>big){
            big = c;
        }
        
        if(d>big){
            big = d;
        }
        
        //Printing the big value
        System.out.println("Biggest = "+big);
        
        
    }
}
