/*
WAP to calculate areas of circle, rectangle, square using method overloading.
Use different parameter lists for each area() method, accept the required
dimensions from the user, and display all three areas formatted to two
decimal places.
*/
import java.util.*;
// Class to calculate areas of different shapes
class Shape {

    // Method to calculate area of circle
    double area(double radius) {
        return Math.PI *radius*radius;
    }

    // Method to calculate area of rectangle
    double area(double length, double width) {
        return length*width;
    }

    // Method to calculate area of square
    double area(int side) {
        return side*side;
    }
}

public class MethodOverloadingAreasOfCircleRectangleSquare {
    public static void main(String[] args) {

        // Create an object of Shape class
        Shape s = new Shape();

        // Create Scanner object to get input from user
        Scanner sc = new Scanner(System.in);

        // Accept radius of circle
        System.out.print("Enter radius of circle: ");
        double r = sc.nextDouble();

        // Calculate and display area of circle
        double circlearea = s.area(r);
        System.out.printf("Area of circle: %.2f%n", circlearea);

        // Accept length of rectangle
        System.out.print("Enter length of rectangle: ");
        double l = sc.nextDouble();

        // Accept width of rectangle
        System.out.print("Enter width of rectangle: ");
        double w = sc.nextDouble();

        // Calculate and display area of rectangle
        double rectanglearea = s.area(l, w);
        System.out.printf("Area of rectangle: %.2f%n", rectanglearea);

        // Accept side length of square
        System.out.print("Enter side of square: ");
        int si = sc.nextInt();

        // Calculate and display area of square
        double squarearea = s.area(si);
        System.out.printf("Area of square: %.2f%n", squarearea);
    }
}
