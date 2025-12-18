//Creating a class name with CheckNumber indicating to purpose is to check if a number is divisible by 5.
import java.util.Scanner;
public class CheckNumber
{	public static void main(String args[])
	{	
		//Create a int vairable name with number.
		int number;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number :");
		number = input.nextInt();
		//Checking a number using ( if - else ) loop.
		if ( number % 5 == 0 )
		{
			System.out.println("Is the number " + number + " divisible by 5? " + "Yes " );
		}
		else
		{
			System.out.println("Is the number " + number + " divisible by 5? " + "No " );	
		}
	
		input.close();
	}
}
	
