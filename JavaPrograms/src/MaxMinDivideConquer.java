    //WAP to find the maximum and minimum using the divide and conquer technique
    import java.util.*;
    public class MaxMinDivideConquer {
        
        //Static instance variables to store minimum and maximum
        static int max,min;
        
        // Recursive function to find min and max
        static void maxmin(int a[],int low,int high){
            if(low==high){
                if(a[low]<min){
                    min=a[low];
                }
                if(a[low]>max){
                    max=a[high];
                }
                return;
            }
            //Finding middle index
            int mid = (low + high) / 2;

            //Dividing into left half
            maxmin(a, low, mid);

            //Dividing into right half
            maxmin(a, mid+1, high);
        }
        public static void main(String[] args) {
            Scanner sc = new Scanner(System.in);

            //Reading the size of the array
            System.out.print("Enter the size of the array:");
            int n = sc.nextInt();

            //Array declaration and memory allocation
            int a[] = new int[n];

            //Reading the elements in the array
            System.out.println("Enter elements to the array");
            for(int i=0; i<n; i++){
                a[i] = sc.nextInt();
            }

            //Initialize max and min
            max=a[0];
            min=a[0];

            //Calling recursive function
            maxmin(a,0,n-1);

            //Printing max & min elements
            System.out.println("Maximum element = "+max);
            System.out.println("Minimum element = "+min);
        }
    }
