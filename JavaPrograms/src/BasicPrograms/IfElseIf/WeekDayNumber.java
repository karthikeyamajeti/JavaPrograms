package BasicPrograms.IfElseIf;
//To input a week day number and print that week day name.
//For example 1-sun,2-mon,3-tue,,,,,,,,,,,7-sat
import java.util.*;
public class WeekDayNumber {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter a week day number:");
        
        //Reading an integer value
        int n = sc.nextInt();
        
        if(n==1){
            System.out.println("Sunday");
        }
        else if(n==2){
            System.out.println("Monday");
        }
        else if(n==3){
            System.out.println("Tuesday");
        }
        else if(n==4){
            System.out.println("Wednesday");
        }
        else if(n==5){
            System.out.println("Thursday");
        }
        else if(n==6){
            System.out.println("Friday");
        }
        else{
            System.out.println("Saturday");
        }
        
    }
}
