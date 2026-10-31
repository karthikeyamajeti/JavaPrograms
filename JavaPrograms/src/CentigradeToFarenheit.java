//To input centigrade value and convert it into farenheit value
import java.util.*;
public class CentigradeToFarenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter centigrade value:");
        
        //Reading an double value
        double c = sc.nextDouble();
        double f;
        
        //Main formula for converting centigrade value to farenheit
        f = (1.8 * c) + 32;
        
        System.out.println("The value of farenheit is "+f);
    }
}
