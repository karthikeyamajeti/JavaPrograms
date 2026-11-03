package Programs.SortingTechniques;
import java.util.*;
public class MergeSort {
    // Function to divide the array
    static void mergeSort(int a[], int low, int high) {

        // Base condition: continue if more than one element exists
        if(low < high) {

            // Find middle index
            int mid = (low+high)/2;

            // Divide and sort the left half
            mergeSort(a,low,mid);

            // Divide and sort the right half
            mergeSort(a,mid+1,high);

            // Merge both sorted halves
            merge(a,low,mid,high);
        }
    }

    // Function to merge two sorted halves
    static void merge(int a[], int low, int mid, int high) {

        // Create temporary array to store sorted elements
        int temp[] = new int[high-low+1];

        // Initialize pointers for left half, right half and temp array
        int i=low;
        int j=mid+1;
        int k=0;

        // Compare elements from both halves
        while(i <= mid && j <= high){

            // If left element is smaller, copy it
            if(a[i] <= a[j]) {
                temp[k] = a[i];
                i++;
            }

            // Otherwise, copy right element
            else {
                temp[k] = a[j];
                j++;
            }

            // Move to next temporary array position
            k++;
        }

        // Copy remaining elements from left half
        while(i <= mid){
            temp[k] = a[i];
            i++;
            k++;
        }

        // Copy remaining elements from right half
        while(j <= high){
            temp[k] = a[j];
            j++;
            k++;
        }

        // Copy sorted elements back into original array
        for(i=low,k=0;i<=high;i++,k++){
            a[i]=temp[k];
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Reading the size of the array
        System.out.print("Enter the size of the array: ");
        int n = sc.nextInt();

        //Array declaration & memory allocation
        int a[] = new int[n];

        //Reading array elments
        System.out.println("Enter the array elements:");
        for(int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }

        //Calling mergeSort to sort the array
        mergeSort(a,0,n-1);

        // Display sorted array
        System.out.println("Sorted array in ascending order:");
        for(int i = 0; i < n; i++) {
            System.out.print(a[i] + " ");
        }
    }
}