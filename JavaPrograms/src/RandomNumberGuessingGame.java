/*
WAP to implement a Random Number Guessing Game. Generate a random number 
between 1 and 10 using a seed value of 100, accept an integer guess from the
user, and display whether the guess is correct or incorrect. If incorrect,
display the correct random number.
*/
import java.util.*;
public class RandomNumberGuessingGame{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        
        // Read user's guess
        System.out.println("Guess a number between 1 and 10: ");
        int guess = sc.nextInt();
        
        // Generate random number using seed 100
        Random r = new Random(100);
        int num = r.nextInt(10)+1;

        // Check the guess
        if(guess == num){
            System.out.println("Congratulations! You guessed it right");
        }else{
            System.out.println("Wrong guess! The correct number was " + num);
        }

        sc.close();
    }
}