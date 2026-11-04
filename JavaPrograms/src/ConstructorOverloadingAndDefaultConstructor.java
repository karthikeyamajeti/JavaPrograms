/*
WAP to demonstrate constructor overloading in class named `Test`. Create three
constructors: a default constructor that initializes `i` and `j` to 0, 
single-parameter constructor that initializes `i` and sets `j` to 0, and 
two-parameter constructor that initializes both variables.Create three 
objects using these constructors and display their values using  `display()` method.
*/
import java.util.*;
//Class to demonstrate constructor overloading
class Test {

    // Private instance variables
    private int i;
    private int j;

    // Default constructor
    // Initializes both i and j to 0
    Test() {
        i = 0;
        j = 0;
    }

    // Parameterized constructor with one parameter
    // Initializes i with the given value and j to 0
    Test(int i) {
        this.i = i;
        this.j = 0;
    }

    // Parameterized constructor with two parameters
    // Initializes both i and j with given values
    Test(int i, int j) {
        this.i = i;
        this.j = j;
    }

    // Method to display values of i and j
    void display() {
        System.out.println("Value of i: " + i);
        System.out.println("Value of j: " + j);
    }
}

public class ConstructorOverloadingAndDefaultConstructor{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Create obj1 using default constructor
        Test obj1 = new Test();

        // Display obj1 values
        System.out.println("Displaying values for obj1:");
        obj1.display();

        // Accept value of i for obj2
        System.out.print("Enter a value for i: ");
        int a = sc.nextInt();

        // Create obj2 using one-parameter constructor
        Test obj2 = new Test(a);

        // Display obj2 values
        System.out.println("Displaying values for obj2:");
        obj2.display();

        // Accept values of i and j for obj3
        System.out.print("Enter a value for i: ");
        int b = sc.nextInt();

        System.out.print("Enter a value for j: ");
        int c = sc.nextInt();

        // Create obj3 using two-parameter constructor
        Test obj3 = new Test(b, c);

        // Display obj3 values
        System.out.println("Displaying values for obj3:");
        obj3.display();

    }
}
