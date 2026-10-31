package BasicPrograms.IfElseIf;
/*
To input student number and six subject marks and find total marks, average 
marks, result and grade in all subjects above are equal to 35 the result = 
Pass otherwise Fail then only find teh grade
    Average         Grade
    >=75              A
    <75 to >=60       B
    <60 to >=50       C
    <50 to >=35       D
*/
import java.util.*;
public class ResultCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        //Prompt for the user
        System.out.println("Enter student number and 6 subject marks");
        
        //Reading student number and followed by six subject marks
        int sno = sc.nextInt();
        int tel = sc.nextInt();
        int hin = sc.nextInt();
        int eng = sc.nextInt();
        int mat = sc.nextInt();
        int sci = sc.nextInt();
        int soc = sc.nextInt();
        
        //Calculating total and average marks
        int tot = tel+hin+eng+mat+sci+soc;
        double avg = tot/6.0;
        
        //Printing Total marks followed by average marks
        System.out.println("Total marks = "+tot);
        System.out.println("Average marks = "+avg);
        
        //Main logic
        if(tel >= 35 && hin >= 35 && eng >= 35 && mat >= 35 && sci >= 35 && soc >= 35){
            System.out.println("Result = Pass");
            if(avg >= 75){
                System.out.println("Grade = A");
            }else if(avg >= 60){
                System.out.println("Grade = B");
            }else if(avg >= 50){
                System.out.println("Grade = C");
            }else{
                System.out.println("Grade = D");
            }
        }else{
            System.out.println("Result = Fail");
        }
        
    }
}
