//Creating a class name with GCDLCMCalculator .
import java.util.Scanner;
public class GCDLCMCalculator {
    public static int findGCD(int a, int b) {
        if (b == 0) {
            return a;
        }
        return findGCD(b, a % b);
    }
    public static int findLCM(int a, int b, int gcd) {
        if (a == 0 || b == 0) return 0;
        return Math.abs(a * b) / gcd;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter second number: ");
        int num2 = scanner.nextInt();
        int a = Math.abs(num1);
        int b = Math.abs(num2);
        int gcd = findGCD(a, b);
        int lcm = findLCM(a, b, gcd);
        System.out.println("\nResults for " + num1 + " and " + num2 + ":");
        System.out.println("Greatest Common Divisor (GCD): " + gcd);
        System.out.println("Least Common Multiple (LCM): " + lcm);

        scanner.close();
    }

}