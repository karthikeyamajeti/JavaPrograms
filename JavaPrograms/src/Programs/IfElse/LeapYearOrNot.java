package Programs.IfElse;
//WAP TO FIND WHETHER THE GIVEN NUMBER IS LEAP YEAR OR NOT 'if else'
import java.util.*;
public class LeapYearOrNot {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Enter an integer value :");
        //Reading an integer
        int year = sc.nextInt();
        
        //Condition:(year % 400 ==0) || (year %4 == 0 && year % 100 != 0)
        /* 
        Leap Year Rules Assessmen:
        1.A year is a leap year if it is perfectly divisible by 400 (e.g., 2000).
        2. Alternatively, a year is a leap year if it is divisible by 4 BUT NOT divisible by 100 
        (e.g., 2024 is a leap year, but 1900 is not).
        */
        
        if((year % 400 ==0) || (year %4 == 0 && year % 100 != 0)){
            System.out.println(year+" is a leap year");
        }else{
            System.out.println(year+" is not a leap year");
        }
        
    }
}
