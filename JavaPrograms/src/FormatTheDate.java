/*
WAP to accept a date in `yyyy-MM-dd` format from the user and convert it into
the format `Day, Month dd, yyyy` using the `LocalDate` and `DateTimeFormatter`
classes. Display the formatted date as the output.
*/
import java.util.*;
import java.time.*;
import java.time.format.*;

public class FormatTheDate {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read date in yyyy-MM-dd format
        String input = sc.nextLine();

        // Convert String into LocalDate
        LocalDate date = LocalDate.parse(input);

        // Define the required output format
        DateTimeFormatter formatter =
            DateTimeFormatter.ofPattern("EEEE, MMMM dd, yyyy");

        // Format and display the date
        System.out.println(date.format(formatter));
    }
}