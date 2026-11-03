package Programs.SearchingTechniques;
//WAP to implement the Binary Search to search for given element in an array
import java.util.*;
public class BinarySearch {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Reading the size of the array
        System.out.print("Enter the size of the array:");
        int n = sc.nextInt();

        // Array declaration and memory allocation
        int a[] = new int[n];
        
        // Reading elements in the array
        System.out.println("Enter elements to array");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Sorting the array
        Arrays.sort(a);

        // Reading the element to search
        System.out.print("Enter element to search:");
        int key = sc.nextInt();

        // Initialising searching range
        int low=0, high=n-1, pos=0;

        boolean found = false;

        while(low <= high){

            int mid = (low+high)/2;
            if (a[mid] == key) {
                found = true;
                pos = mid;
                break;
            }
            else if (key < a[mid]) {
                high = mid - 1;
            }
            else {
                low = mid + 1;
            }
        }

        // Displaying the result
        if (found) {
            System.out.println("Element found at position " + (pos + 1));
        }
        else {
            System.out.println("Element not found");
        }
    }
}