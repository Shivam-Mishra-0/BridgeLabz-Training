//Creating a class name with CheckArmstrongNumber indicating to purpose is to check the number is armstrong or not .
import java.util.Scanner;
public class CheckArmstrongNumber
{	public static void main(String args[])
	{	//Create a int vairable number, sum and reminder.
		int number, sum = 0, originalNumber, reminder;
		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number :");
		number = input.nextInt();
		originalNumber = number;
		//Using while loop till originalNumber is not equal to zero.
		while ( originalNumber != 0 )
		{	reminder = originalNumber % 10;
			sum = sum + ( reminder * reminder * reminder );
			originalNumber = originalNumber / 10;
		}
		if ( number == sum ) 
		{	System.out.println( number + " is an Armstrong number.");
		}
		else
		{	System.out.println( number + " is not an Armstrong number..");
		}

		input.close();
	}
}







				

