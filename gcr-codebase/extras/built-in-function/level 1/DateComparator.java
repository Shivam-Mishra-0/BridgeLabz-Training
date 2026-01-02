//Creating a class name with DateComparator .
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
public class DateComparator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        try {
            System.out.print("Enter the first date (yyyy-MM-dd): ");
            LocalDate date1 = LocalDate.parse(scanner.nextLine(), formatter);

            System.out.print("Enter the second date (yyyy-MM-dd): ");
            LocalDate date2 = LocalDate.parse(scanner.nextLine(), formatter);

            System.out.println("\nComparison Results:");
            if (date1.isBefore(date2)) {
                System.out.println("The first date (" + date1 + ") is BEFORE the second date (" + date2 + ").");
            } else if (date1.isAfter(date2)) {
                System.out.println("The first date (" + date1 + ") is AFTER the second date (" + date2 + ").");
            } else if (date1.isEqual(date2)) {
                System.out.println("Both dates are the SAME.");
            }           
        } catch (Exception e) {
            System.out.println("Invalid date format. Please use yyyy-MM-dd.");
        }

        scanner.close();
    }
}