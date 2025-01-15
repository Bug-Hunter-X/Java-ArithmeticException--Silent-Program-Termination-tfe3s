import java.util.InputMismatchException;

public class UncommonBugSolution {
    public static void main(String[] args) {
        int x = 5;
        int y = 0;
        try {
            int z = x / y; 
            System.out.println(z);
        } catch (ArithmeticException e) {
            System.err.println("Error: Division by zero!");
            // Add more robust error handling as needed
        } catch (InputMismatchException e) {
            System.err.println("Error: Invalid input.");
        } catch (Exception e) {
            System.err.println("An unexpected error occurred.");
            e.printStackTrace(); // For debugging purposes
        }
    }
}