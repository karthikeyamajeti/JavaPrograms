package Programs.For;
//WAP to find factors of given number
import java.util.*;
public class FactorsOfGivenNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter an integer value:");
        
        //Reading an integer value
        int n = sc.nextInt();
        
        System.out.println("The factors of "+n+" numbers");
        for(int i=1; i<=n; i++){
            if(n%i==0)
                System.out.print(i+"\t");
        }
        
    }
}
