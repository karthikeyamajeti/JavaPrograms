//To input farenheit value & convert it into centigrade value
import java.util.*;
public class FarenheitToCentigrade {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for inputing a farenheit value
        System.out.print("Enter a farenheit value:");
        
        //Reading a farenheit value
        double f = sc.nextDouble();
        
        //Formula for converting farenheit value to centigrade
        double c = 5.0/9.0 * (f-32);
        
        System.out.println("The value of centigrade:"+c);
    }
}
