import java.util.*;

public class CurrencyKiosk18 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char continueChoice;

        do {
            System.out.println("+=====================================================+");
            System.out.println("|           Welcome to Mishra Currency Exchange       |");
            System.out.println("+=====================================================+");
            System.out.println("|  Currencies available in exchange are:              |");
            System.out.println("|  1. USD (United States Dollar) (1 USD = 89.97 INR)  |");
            System.out.println("|  2. EURO (European)            (1 EURO = 93.45 INR) |");
            System.out.println("|  3. YEN (Japanese Yen)         (1 YEN = 0.62 INR)   |");
            System.out.println("|  4. KWD (Kuwaiti Dinar)        (1 KWD = 292.20 INR) |");
            System.out.println("|  5. BHD (Bahraini Dinar)       (1 BHD = 238.10 INR) |");
            System.out.println("+=====================================================+");

            System.out.print("| Enter INR amount: ");
            double inr = input.nextDouble();
            
            // ANSI: Move up 1 line, move right to column 54, print closing bar
            System.out.print("\033[A\033[54C|\n");

            System.out.println("| Choose target (1-5):                                |");
            System.out.print("| Option: ");
            int target = input.nextInt();
            System.out.print("\033[A\033[54C|\n");

            double result = 0;
            String currencyName = "";

            switch (target) {
                case 1:
                    result = inr / 89.97;
                    currencyName = "USD";
                    break;
                case 2:
                    result = inr / 93.45;
                    currencyName = "EURO";
                    break;
                case 3:
                    result = inr / 0.62;
                    currencyName = "YEN";
                    break;
                case 4:
                    result = inr / 292.20;
                    currencyName = "KWD";
                    break;
                case 5:
                    result = inr / 238.10;
                    currencyName = "BHD";
                    break;
                default:
                    System.out.println("| Invalid option selected!                            |");
            }

            if (target >= 1 && target <= 5) {
                System.out.printf("| Converted Amount: %.2f %-25s|\n", result, currencyName);
            }

            System.out.println("+=====================================================+");
            System.out.print("Do you want another conversion? (y/n): ");
            continueChoice = input.next().toLowerCase().charAt(0);
            System.out.println(); // Space between sessions

        } while (continueChoice == 'y');

        System.out.println("Thank you for using Mishra Currency Exchange!");
        input.close();
    }
}