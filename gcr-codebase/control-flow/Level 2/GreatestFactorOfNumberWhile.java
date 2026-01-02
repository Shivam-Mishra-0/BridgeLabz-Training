//Creating a class name with GreatestFactorOfNumberWhile indicating to purpose is to check the greatest factor of a number.
import java.util.Scanner;
public class GreatestFactorOfNumberWhile
{	public static void main(String args[])
	{	//Create a int vairable name with number, greatestFactor .
		int number, greatestFactor = 1;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as salary and year.
		System.out.println("Enter the number :");
		number = input.nextInt();
		int counter = number - 1;
		//Find the greatest number using while loop.
		while ( counter >= 1 )
		{	if ( number % counter == 0 )
			{	greatestFactor = counter;
				break;
			}
			counter--;
		}
		System.out.println(greatestFactor);

		input.close();
	}
}
				

