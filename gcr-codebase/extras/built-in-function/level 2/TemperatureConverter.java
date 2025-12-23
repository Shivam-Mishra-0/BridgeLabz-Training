//Creating a class name with TemperatureConverter .
import java.util.Scanner;
public class TemperatureConverter {
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Choose an option (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double result = celsiusToFahrenheit(celsius);
            System.out.printf("%.2f°C is equal to %.2f°F%n", celsius, result);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double result = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%.2f°F is equal to %.2f°C%n", fahrenheit, result);
        } else {
            System.out.println("Invalid option.");
        }

        scanner.close();
    }

}