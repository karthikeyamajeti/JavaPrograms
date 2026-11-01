package Programs.DoWhile;
//Understanding do while loop
public class UnderstandingDoWhileLoop {
    public static void main(String[] args) {
        int count = 1;

        do {
            System.out.println("Count is: " + count);
            count++; // Increments the variable to eventually exit the loop
        } while (count <= 5);
        
    }
}
