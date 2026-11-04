import java.util.*;
import java.time.*;
import java.time.format.*;
/*
WAP to accept a date in `yyyy-MM-dd` format from the user and convert it into
the format `Day, Month dd, yyyy` using the `LocalDate` and `DateTimeFormatter`
classes. Display the formatted date as the output.
*/
public class FormatTheDate {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        LocalDate date = LocalDate.parse(str);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE,MMMM dd,yyyy");
        System.out.println(date.format(formatter));
    }
}
