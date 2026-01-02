//Creating a class name with GreatestFactorOfNumber indicating to purpose is to check the greatest factor of a number.
import java.util.Scanner;
public class GreatestFactorOfNumber
{	public static void main(String args[])
	{	//Create a int vairable name with number, greatestFactor .
		int number, greatestFactor = 1;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as salary and year.
		System.out.println("Enter the number :");
		number = input.nextInt();
		//Find the greatest number using for loop.
		for ( int i = number - 1; i >= 1; i-- )
		{	if ( number % i == 0 )
			{	greatestFactor = i;
				break;
			}
		}
		System.out.println(greatestFactor);

		input.close();
	}
}
				

