//Creating a class name with QuotientAndReminder indicating to purpose is to find the reminder and quotient.
import java.util.Scanner;
public class QuotientAndReminder
{	public static void main(String args[])
	{	
		//Create a double vairable name with number1, number2, reminder and quotient.
		double number1, number2, reminder, quotient;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number1 and number2.
		System.out.println("Enter the number1 :");
		number1 = input.nextDouble();
		System.out.println("Enter the number2 :");
		number2 = input.nextDouble();
		//find the quotient and reminder using division operator ( / ) and modulus operator ( % ).
		quotient = Math.abs( number1 / number2 );
		reminder = Math.abs( number1 % number2 );
		
		//Print quotient and reminder.
		System.out.println("The Quotient is " + quotient + " and Reminder is " + reminder + " of two number " + number1 + " and " +  number2 );
		input.close();
	}
}
	
