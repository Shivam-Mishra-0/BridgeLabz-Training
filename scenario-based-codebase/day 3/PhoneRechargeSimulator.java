/*	10. Phone Recharge Simulator 📱
	Take the user's mobile operator and amount.
	● Use a switch to display offers.
	● Loop to allow repeated recharges.
	● Show balance after each recharge.   */


import java.util.Scanner;

public class PhoneRechargeSimulator{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        double balance = 0;
        char choice;

        do {
		System.out.println( "=======================================" );
            	System.out.println( "|Enter Mobile Operator (Airtel/Jio/VI)|");
		System.out.println( "=======================================" );
            	String operator = sc.next();

            	System.out.println("| Enter Recharge Amount           |");
		System.out.println( "=======================================" );
            	double amount = sc.nextDouble();

            balance += amount;

            // switch for offers
            switch (operator.toLowerCase()) {
                case "airtel": 
		// System.out.println("|  No offers available        |");
                    System.out.println("|  Offer: 1GB/day for 28 days        |");
                    break;

                case "jio":
                    System.out.println("|  Offer: Unlimited calls + 1.5GB/day     |");
                    break;

                case "vi":
                    System.out.println("|  Offer: Weekend data rollover        |");
                    break;

                default:
                    System.out.println("|  No offers available            |");
            }
	   System.out.println( "=======================================" );
            System.out.println( "|  Current Balance: ₹        | " + balance  + "   |");
	  System.out.println( "=======================================" );
            System.out.println( "| Do you want to recharge again? (Y/N)|" );
            choice = sc.next().charAt(0);
	  System.out.println( "=======================================" );
        } while (choice == 'Y' || choice == 'y');

           System.out.println( "|Thank you for using Recharge Simulator|" );
	 System.out.println( "=======================================" );
    }
}
