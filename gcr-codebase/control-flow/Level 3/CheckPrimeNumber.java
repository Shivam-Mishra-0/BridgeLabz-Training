//Creating a class name with CheckPrimeNumber indicating to purpose is to check the number of prime numbers from number to user input .
import java.util.Scanner;
public class CheckPrimeNumber
{	public static void main(String args[])
	{	//Create a int vairable number, result.
		int number, result = 1;;
		boolean isPrime = true;
		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number :");
		number = input.nextInt();
		//Check the number is greater than 1 or not.
		if ( number > 1 )
		{	for ( int i = 2; i <= number; i++ ) //Loop from 2 to number
			{	if ( number % i == 0 )
				{	isPrime = false;
					break;
				}
			}
		}
		if ( isPrime ) 
		{	System.out.println( number + " is a prime number.");
		}
		else
		{	System.out.println( number + " is not a prime number.");
		}
	

		input.close();
	}
}







				

