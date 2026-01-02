//Creating a class name with FibonacciGenerator .
import java.util.Scanner;
public class FibonacciGenerator {
    public static void generateFibonacci(int n) {
        long firstTerm = 0;
        long secondTerm = 1;
        for (int i = 1; i <= n; i++) {
            System.out.print(firstTerm + " ");
            long nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
        System.out.println(); 
    }
	    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of terms for the Fibonacci sequence: ");
        if (scanner.hasNextInt()) {
            int terms = scanner.nextInt();            
            if (terms <= 0) {
                System.out.println("Please enter a positive integer.");
            } else {
                System.out.println("Fibonacci Sequence up to " + terms + " terms:");
                generateFibonacci(terms);
            }
        } else {
            System.out.println("Invalid input. Please enter a number.");
        }

        scanner.close();
    }

}