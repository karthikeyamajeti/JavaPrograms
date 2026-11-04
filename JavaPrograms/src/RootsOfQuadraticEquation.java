//Write a Java program to find the roots of a quadratic equation of the form ax2+bx+c = 0
import java.util.*;
public class RootsOfQuadraticEquation {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the coefficients a, b and c:");
        //Take three double values as input
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        
        //Discriminant value = b*b-4*a*c
        double D = b*b-4*a*c;
        
        //Main Logic
        if(D>0){
            System.out.println("Two distinct real roots");
            double r1 = (-b+Math.sqrt(D))/(2*a);
            double r2 = (-b-Math.sqrt(D))/(2*a);
            System.out.println("Root1:"+r1);
            System.out.println("Root2:"+r2);
        }else if(D==0){
            System.out.println("One real root");
            double r1 = -b/(2*a);
            System.out.println("Root1:"+r1);
        }else{
            System.out.println("No real roots");
        }
        
    }
}
