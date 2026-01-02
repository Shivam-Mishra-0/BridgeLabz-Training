//Creating a class name with CheckNaturalNumber indicating to purpose is to check natural numbers of sum of n numbers.
import java.util.Scanner;
public class CheckNaturalNumber
{	public static void main(String args[])
	{	
		//Create a int vairable name with number and sum.
		int number, sum;
		

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number :");
		number = input.nextInt();
		//Checking the natural number using (if-else) condition.
		
		if ( number >= 1 )
		{	
			sum = number * ( number + 1 ) / 2;
			System.out.println("The sum of " + number + " natural numbers is " + sum);
		}
		else
		{
			System.out.println("The number " + number + " is not a natural number");
		}
		input.close();
	}
}
	
