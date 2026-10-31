package Programs.IfElse;
//To input a character and find whether the given character is vowel or not
import java.util.*;
public class VowelOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for user
        System.out.print("Enter a character :");
        
        //Inputing a character 
        char ch = sc.next().charAt(0);
        
        //Main logic
        if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U'){
            System.out.println(ch+" is vowel");
        }else{
            System.out.println(ch+" is not a vowel");
        }
        
    }
}
