package Programs.SortingTechniques;
//WAP to implement Quick Sort to sort arr of integers in asc order Use the Divide and Conquer technique and display the sorted array. Include appropriate methods for partitioning and recursively sorting the array.
import java.util.Scanner;
public class QuickSort {
    // Method to partition the array
    static int partition(int a[], int low, int high) {

        // Select the last element as pivot
        int pivot = a[high];

        // Index of smaller element
        int i = low - 1;

        // Traverse the array from low to high-1
        for (int j = low; j < high; j++) {

            // Check if current element is smaller than pivot
            if (a[j] < pivot) {
                i++;
                int temp = a[i];// Swap a[i] and a[j]
                a[i] = a[j];
                a[j] = temp;
            }
        }

        // Place pivot in its correct position
        int temp = a[i+1];
        a[i+1] = a[high];
        a[high] = temp;

        // Return pivot index
        return i + 1;
    }

    // Method to perform Quick Sort
    static void quickSort(int a[], int low, int high) {

        // Check whether the array has more than one element
        if(low<high){

            // Find the correct position of pivot
            int pi = partition(a, low, high);

            // Sort the left subarray
            quickSort(a, low, pi - 1);

            // Sort the right subarray
            quickSort(a, pi + 1, high);
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Read number of elements
        System.out.print("Enter number of elements: ");
        int n = sc.nextInt();

        // Declare array
        int a[] = new int[n];

        // Read array elements
        System.out.println("Enter array elements:");

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        // Calling Quick Sort method
        quickSort(a,0,n-1);

        // Displaying the sorted array
        System.out.println("Sorted array:");

        for (int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }

    }
}
