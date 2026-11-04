/*
WAP to demonstrate single inheritance using the `extends` keyword and the 
`super` keyword to call a parent class method.Create a parent class `Parents` 
to perform addition and a child class `Child` to perform subtraction, using
`super.add()` to call the parent's addition method.
*/
import java.util.*;
// Parent class
class Parents {
    // Method to perform addition
    void add(int num1, int num2) {
        System.out.println("Addition: "+(num1+num2));
    }
}

// Child class inheriting Parents
class Child extends Parents {
    // Method to perform subtraction
    void sub(int num1, int num2) {

        // Calling parent class method using super
        super.add(num1, num2);

        System.out.println("Subtraction: "+(num1-num2));
    }
}

// Main class
public class SuperasParentMethod {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Read two integers
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();

        // Create Child class object
        Child c = new Child();

        // Call child class method
        c.sub(num1,num2);
    }    
}
