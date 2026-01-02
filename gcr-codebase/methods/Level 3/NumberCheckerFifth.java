//Creating a class name with NumberCheckerFifth.
import java.util.Scanner;

public class NumberCheckerFifth {
    private static int sumOfProperDivisors(int number) {
        int sum = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sum += i;
            }
        }
        return sum;
    }
    public static boolean isPerfect(int number) {
        return number > 0 && sumOfProperDivisors(number) == number;
    }
    public static boolean isAbundant(int number) {
        return number > 0 && sumOfProperDivisors(number) > number;
    }
    public static boolean isDeficient(int number) {
        return number > 0 && sumOfProperDivisors(number) < number;
    }
    private static int factorial(int digit) {
        int fact = 1;
        for (int i = 1; i <= digit; i++) {
            fact *= i;
        }
        return fact;
    }
    public static boolean isStrong(int number) {
        int sum = 0;
        int tempNumber = number;
        while (tempNumber > 0) {
            sum += factorial(tempNumber % 10);
            tempNumber /= 10;
        }
        return sum == number;
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter a number to check: ");
        int n = input.nextInt();

        System.out.println("Is Perfect Number: " + isPerfect(n));
        System.out.println("Is Abundant Number: " + isAbundant(n));
        System.out.println("Is Deficient Number: " + isDeficient(n));
        System.out.println("Is Strong Number: " + isStrong(n));
        input.close();
    }
}