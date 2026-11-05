package Programs.CollectionFrameWork;
/*
Write a menu-driven Java program using `HashSet` and `switch-case` to perform
basic operations such as searching, deleting, and displaying integer elements.
The program should repeatedly display a menu with options to Search, Delete, 
Display, and Exit until the user selects the Exit option.
*/
import java.util.*;
public class HashSetMenuProgram {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create a HashSet
        HashSet<Integer> set = new HashSet<>();

        // Read number of elements
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();

        // Add elements to HashSet
        System.out.println("Enter " + n + " elements:");

        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        int choice;

        // Repeat menu until choice 4
        while(true){
            System.out.println("\nMenu:");
            System.out.println("1. Search for an element");
            System.out.println("2. Delete an element");
            System.out.println("3. Display elements");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            choice = sc.nextInt();

            // Perform operations using switch-case
            switch (choice) {

                case 1:
                    // Search an element
                    System.out.print("Enter element to search: ");
                    int search = sc.nextInt();

                    if (set.contains(search)) {
                        System.out.println(search + " is found");
                    } else {
                        System.out.println(search + " is not found");
                    }
                    break;

                case 2:
                    // Delete an element
                    System.out.print("Enter element to delete: ");
                    int delete = sc.nextInt();

                    if (set.remove(delete)) {
                        System.out.println(delete + " is deleted");
                    } else {
                        System.out.println(delete + " does not exist");
                    }
                    break;

                case 3:
                    // Display HashSet elements
                    System.out.println("Current elements: " + set);
                    break;

                case 4:
                    // Exit the program
                    System.out.println("Exiting program");
                    return;

                default:
                    // Invalid choice
                    System.out.println("Invalid choice. Please enter a valid option");
            }

        }
    }
}
