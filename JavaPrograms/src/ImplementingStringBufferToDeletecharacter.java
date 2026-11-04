import java.util.*;
public class ImplementingStringBufferToDeletecharacter {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Prompting the user to input a string
        System.out.print("Enter a string:");

        //Reading the complete string including spaces
        String str = sc.nextLine();

        //Asking the user which position need to be delted
        System.out.print("Enter the position to delete:");

        //Reading the position
        int pos = sc.nextInt();

        //Convertingg the String into a StringBuffer object
        StringBuffer sb = new StringBuffer(str);

        // Check whether the given position is valid
        if(pos>=0 && pos<sb.length()){

            //Deleting the character at the specified position
            sb.deleteCharAt(pos);

            //Displaying the updated string
            System.out.println("Updated string: " + sb);

        } else {
            //Displaying an error message if the position is invalid
            System.out.println("Invalid position");
        }

    }
}