package Programs.Arrays;
import java.util.*;
public class SumOfArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter the size of the array:");
        
        //Read the size of the array
        int n = sc.nextInt();
        
        //Single dimensional Array declaration & memory allocation
        int a[] = new int[n];
        
        System.out.println("Enter "+n+" array elements");
        
        //Reading array elements
        for(int i=0; i<n; i++){
            a[i] = sc.nextInt();
        }
        
        int sum = 0;
        for(int i=0; i<n; i++){
            sum+=a[i];
        }
        
        System.out.println("The sum of array elements = "+sum);
    }
}
