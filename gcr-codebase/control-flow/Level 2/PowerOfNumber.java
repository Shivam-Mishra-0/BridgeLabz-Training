//Creating a class name with PowerOfNumber indicating to purpose is to find the power of a number using for loop.
import java.util.Scanner;
public class PowerOfNumber
{	public static void main(String args[])
	{	//Create a int vairable name with number, power, result.
		int number, power, result = 1;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number :");
		number = input.nextInt();
		System.out.println("Enter the power :");
		power = input.nextInt();
		//Check the integer is positive using for loop.
		if ( number > 0 && power > 0 )
		{	for ( int i = 1; i <= power; i++ )
			{	result *= number;						
			}
			System.out.println("Result is " + result);
		}
		else
		{
			System.out.println("Please enter a Positive number.");
		}

		input.close();
	}
}







				

