//Creating a class name with RecursiveFactorial .
import java.util.Scanner;
public class RecursiveFactorial {
    public static long calculateFactorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * calculateFactorial(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a non-negative integer: ");
        if (scanner.hasNextInt()) {
            int number = scanner.nextInt();

            if (number < 0) {
                System.out.println("Factorial is not defined for negative numbers.");
            } else {
                long result = calculateFactorial(number);
                System.out.println("The factorial of " + number + " is: " + result);
            }
        } else {
            System.out.println("Invalid input. Please enter an integer.");
        }

        scanner.close();
    }

}