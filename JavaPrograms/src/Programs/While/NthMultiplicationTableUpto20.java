package Programs.While;
//WAP to fin Nth Multiplication table upto 20
import java.util.*;
public class NthMultiplicationTableUpto20 {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        
        //Prompt for the user
        System.out.print("Enter an table value:");
        
        //Reading an integer value
        int n = sc.nextInt();
        int i=1;
        
        while(i<=20){
            System.out.println(n+" *  "+i+" = "+(n*i));
            i++;
        }
    }
}
