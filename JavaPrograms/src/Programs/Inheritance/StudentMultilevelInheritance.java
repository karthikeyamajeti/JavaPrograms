package Programs.Inheritance;
/*
WAP  to demonstrate multilevel inheritance using `Student`, `Marks`, and 
`Result` classes.Accept student details and marks in three subjects, then 
calculate and display the total and average marks using inherited methods.
*/
import java.util.*;

// Parent class
class Student {

    int id;
    String name;

    // Method to accept student details
    void setData(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Method to display student details
    void displayData() {
        System.out.println("Id : " + id);
        System.out.println("Name : " + name);
    }
}

// Child class inheriting Student
class Marks extends Student {

    float javaMarks;
    float cMarks;
    float cppMarks;

    // Method to accept subject marks
    void setMarks(float javaMarks, float cMarks, float cppMarks) {
        this.javaMarks = javaMarks;
        this.cMarks = cMarks;
        this.cppMarks = cppMarks;
    }

    // Method to display subject marks
    void displayMarks() {
        System.out.println("Java marks : " + javaMarks);
        System.out.println("C marks : " + cMarks);
        System.out.println("Cpp marks : " + cppMarks);
    }
}

// Child class inheriting Marks
class Result extends Marks {

    float total;
    float avg;

    // Method to calculate total and average
    void compute() {
        total = javaMarks + cMarks + cppMarks;
        avg = total / 3;
    }

    // Method to display result
    void showResult() {
        System.out.println("Total : " + total);
        System.out.println("Avg : " + avg);
    }
}

// Main class
public class StudentMultilevelInheritance {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create Result class object
        Result r = new Result();

        // Accept student details
        System.out.print("Enter student ID: ");
        int id = sc.nextInt();

        sc.nextLine(); // Consume newline

        System.out.print("Enter student name: ");
        String name = sc.nextLine();

        // Accept subject marks
        System.out.print("Enter Java marks: ");
        float javaMarks = sc.nextFloat();

        System.out.print("Enter C marks: ");
        float cMarks = sc.nextFloat();

        System.out.print("Enter C++ marks: ");
        float cppMarks = sc.nextFloat();

        // Set student details and marks
        r.setData(id, name);
        r.setMarks(javaMarks, cMarks, cppMarks);

        // Calculate result
        r.compute();

        // Display student details
        r.displayData();

        // Display subject marks
        r.displayMarks();

        // Display total and average
        r.showResult();

    }
}