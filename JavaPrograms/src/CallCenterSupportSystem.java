import java.util.*;

// Customer class
class Customer {
    String name;
    int urgency;

    Customer(String name, int urgency) {
        this.name = name;
        this.urgency = urgency;
    }
}

public class CallCenterSupportSystem {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Create a Queue to store customers
        Queue<Customer> queue = new LinkedList<>();

        int choice;

        do {
            // Display menu
            System.out.println("1. Join Queue");
            System.out.println("2. Handle Call");
            System.out.println("3. View Queue");
            System.out.println("4. Exit");

            choice = sc.nextInt();

            switch (choice) {

                case 1:
                    // Add customer to queue
                    sc.nextLine();

                    System.out.print("customer name: ");
                    String name = sc.nextLine();

                    System.out.print("urgency level: ");
                    int urgency = sc.nextInt();

                    queue.add(new Customer(name, urgency));

                    System.out.println(name + " joined with urgency level " + urgency);
                    break;

                case 2:
                    // Handle the most urgent customer
                    if (queue.isEmpty()) {
                        System.out.println("Call queue is empty");
                    } else {

                        Customer selected = null;

                        // Find the customer with highest urgency
                        for (Customer c : queue) {
                            if (selected == null || c.urgency > selected.urgency) {
                                selected = c;
                            }
                        }

                        // Remove the selected customer
                        queue.remove(selected);

                        System.out.println("Handling call from " +
                                selected.name + " (urgency level " +
                                selected.urgency + ")");
                    }
                    break;

                case 3:
                    // Display customers in joining order
                    if (queue.isEmpty()) {
                        System.out.println("Call queue is empty");
                    } else {
                        for (Customer c : queue) {
                            System.out.println(c.name +
                                    " (urgency level " + c.urgency + ")");
                        }
                    }
                    break;

                case 4:
                    // Exit the program
                    break;

                default:
                    System.out.println("Invalid choice");
            }

        } while (choice != 4);

    }
}