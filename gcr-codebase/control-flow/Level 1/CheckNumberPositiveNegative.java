//Creating a class name with CheckNumberPositiveNegative indicating to purpose is to check whether number is positive, negative or zero.
import java.util.Scanner;
public class CheckNumberPositiveNegative
{	public static void main(String args[])
	{	//Create a int vairable name with number.
		int number;
		

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number :");
		number = input.nextInt();
		//Checking the natural number using (if-else) condition.
		if ( number > 0 )
		{	
			System.out.println("The number " + number + " is positive.");
		}
		else if ( number < 0 )
		{
			System.out.println("The number " + number + " is negative.");
		}
		else
		{
			System.out.println("The number " + number + " is negative.");
		}

		input.close();
	}
}
	
