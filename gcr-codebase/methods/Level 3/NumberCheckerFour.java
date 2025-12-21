//Creating a class name with NumberCheckerFour.
import java.util.Scanner;
public class NumberCheckerFour {
    public static boolean isPrime(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) return false;
        }
        return true;
    }
    public static boolean isNeon(int number) {
        int square = number * number;
        int sumOfDigits = 0;
        while (square > 0) {
            sumOfDigits += square % 10;
            square /= 10;
        }
        return sumOfDigits == number;
    }
    public static boolean isSpy(int number) {
        int sum = 0;
        int product = 1;
        int tempNumber = Math.abs(number);
        while (tempNumber > 0) {
            int digit = tempNumber % 10;
            sum += digit;
            product *= digit;
            tempNumber /= 10;
        }
        return sum == product;
    }
    public static boolean isAutomorphic(int number) {
        int square = number * number;
        String s1 = Integer.toString(number);
        String s2 = Integer.toString(square);
        return s2.endsWith(s1);
    }
    public static boolean isBuzz(int number) {
        return (number % 7 == 0) || (number % 10 == 7);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = input.nextInt();

        System.out.println("Is Prime: " + isPrime(n));
        System.out.println("Is Neon: " + isNeon(n));
        System.out.println("Is Spy: " + isSpy(n));
        System.out.println("Is Automorphic: " + isAutomorphic(n));
        System.out.println("Is Buzz: " + isBuzz(n));
        input.close();
    }
}