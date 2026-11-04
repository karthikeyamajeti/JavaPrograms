/*
WAP using `ArrayList` to find the maximum and minimum values in a list of 
integers. Read integers from the user until a non-numeric character is 
entered, then display the maximum and minimum values on separate lines.
*/
import java.util.*;
public class MaxAndMinValuesInListOfNumbers {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create an ArrayList to store integer values
        ArrayList<Integer> al = new ArrayList<>();

        // Read integers until a non-numeric character is entered
        System.out.println("Enter numbers (enter a non-numeric character to stop):");

        while (sc.hasNextInt()) {
            al.add(sc.nextInt());
        }

        // Check whether the ArrayList is empty
        if (al.isEmpty()) {
            System.out.println("No numbers entered");
        } else {

            // Assume the first element is both maximum and minimum
            int max = al.get(0);
            int min = al.get(0);

            // Traverse the ArrayList to find maximum and minimum
            for (int x : al) {

                // Update minimum if the current value is smaller
                if (x < min)
                    min = x;

                // Update maximum if the current value is greater
                if (x > max)
                    max = x;
            }

            // Display maximum and minimum on separate lines
            System.out.println("Maximum value: " + max);
            System.out.println("Minimum value: " + min);
        }
    }
}