package Programs.Switch;
/*
Write a Java program to accept a day of the week from the user at runtime 
using the Scanner class. Use a switch statement with String values 
*/
import java.util.Scanner;
public class WeekDayNumberString {
    public static void main(String[] args) {

        // Create Scanner object to get user input
        Scanner sc = new Scanner(System.in);

        // Read day from the user at runtime
        System.out.print("Enter a day:");
        String day = sc.nextLine();

        // Check the entered day using switch
        switch (day) {

            case "Monday":
                // Executes when user enters Monday
                System.out.println("Start of the week");
                break;

            case "Tuesday":
                System.out.println("Second day of the week");
                break;

            case "Wednesday":
                System.out.println("Middle of the week");
                break;

            case "Thursday":
                System.out.println("Almost weekend");
                break;

            case "Friday":
                System.out.println("Last working day");
                break;

            case "Saturday":
                System.out.println("Weekend!");
                break;

            case "Sunday":
                System.out.println("Enjoy your holiday!");
                break;

            default:
                // Executes if the entered day doesn't match
                System.out.println("Invalid day");
        }
        
    }
}

