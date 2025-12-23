//Creating a class name with MaximumFinder .
import java.util.Scanner;
public class MaximumFinder { 
    public static int getNumberInput(String prompt) {
        Scanner scanner = new Scanner(System.in);
        System.out.print(prompt);
        while (!scanner.hasNextInt()) {
            System.out.println("Invalid input. Please enter an integer.");
            System.out.print(prompt);
            scanner.next();
        }
        return scanner.nextInt();
    }
    public static int findMax(int a, int b, int c) {
        int max = a; 
        if (b > max) {
            max = b;
        }
        if (c > max) {
            max = c;
        }        
        return max;
    }
    public static void displayResult(int n1, int n2, int n3, int max) {
        System.out.println("\nNumbers entered: " + n1 + ", " + n2 + ", " + n3);
        System.out.println("The maximum value is: " + max);
    }
	  public static void main(String[] args) {
        System.out.println("--- Maximum of Three Numbers ---");
        
        int num1 = getNumberInput("Enter first number: ");
        int num2 = getNumberInput("Enter second number: ");
        int num3 = getNumberInput("Enter third number: ");
        int max = findMax(num1, num2, num3);
        displayResult(num1, num2, num3, max);
    }
}