package Programs.Inheritance;
/*
WAP to demonstrate single inheritance by creating a parent class 
Person with a name variable and methods to accept and display the name.
Create a child class Citizen that extends Person and includes an age
variable with methods to accept and display the age.
Create an object of itizen` and demonstrate the use of both inherited and child-class methods.
*/
import java.util.*;
class Person{
    String name;
    void inputName(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name:");
        name = sc.next();
    }
    void displayName(){
        System.out.println("The person name is "+name);
    }    
}
class Citizen extends Person{
    int age;
    void inputAge(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age:");
        age=sc.nextInt();
    }
    void displayAge(){
        System.out.println("age = "+age);
    }
}
public class PersonNameandAgeSingleInheritance {
    public static void main(String[] args) {
        Citizen c = new Citizen();
        c.inputName();
        c.displayName();
        c.inputAge();
        c.displayAge();
    }
}
