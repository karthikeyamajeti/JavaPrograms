package Programs.SortingTechniques;
import java.util.*;
public class BubbleSort{
    static void bubbleSort(int a[], int n) {

        // Outer loop controls the number of passes
        for(int i=0; i<n-1; i++) {

            // Inner loop compares adjacent elements
            // After every pass, the largest element
            // moves to its correct position at the end
            for(int j=0; j<n-i-1; j++) {

                // Check whether the current element
                // is greater than the next element
                if(a[j] > a[j+1]){

                    // Swap the two elements
                    int temp = a[j];
                    a[j] = a[j+1];
                    a[j+1] = temp;
                }
                
            }
            
        }
    }
    public static void main(String[] args) {     
        Scanner sc = new Scanner(System.in);
        
        //Reading the size of the array
        System.out.print("Enter number of elements:");
        int n = sc.nextInt();

        //Declaring an array of size n
        int a[] = new int[n];
        
        // Read array elements from the user
        System.out.println("Enter elements to the array");
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }

        // Calling the Bubble Sort function
        bubbleSort(a,n);

        //Printing the sorted array
        System.out.println("Sorted Array:");

        for(int i=0; i<n; i++){
            System.out.print(a[i] + " ");
        }
    }
}
