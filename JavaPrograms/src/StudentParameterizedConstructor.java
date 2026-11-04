import java.util.*; 
class Person {
    // Instance variables
    String name;
    int age;

    // Parameterized constructor to initialize name and age
    Person(String name, int age) {

        // Assign parameter values to instance variables
        this.name = name;
        this.age = age;
        
    }

    // Instance method to display person details
    void displaydetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

public class StudentParameterizedConstructor {
    public static void main(String[] args) {      
        Scanner sc = new Scanner(System.in);

        // Prompt the user to enter name
        System.out.print("Enter name: ");

        // Read person's name
        String name = sc.next();

        // Prompt the user to enter age
        System.out.print("Enter age: ");

        // Read person's age
        int age = sc.nextInt();

        // Create Person object using parameterized constructor
        Person p = new Person(name, age);

        // Call method to display person details
        p.displaydetails();

    }
}
