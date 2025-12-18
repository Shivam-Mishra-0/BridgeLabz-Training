//Creating a class name with Factorial indicating to purpose is to find the factorial of an integer.
import java.util.Scanner;
public class Factorial
{	public static void main(String args[])
	{	//Create a int vairable name with number, factorial.
		int number, factorial = 1;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number :");
		number = input.nextInt();
		int originalNumber = number;
		//Find the factorail of an integer using while loop.
		while ( number != 0 )
		{	factorial = factorial * number;
			number--;
		 }
		
					
		//print the value of factorial.
		System.out.println("The factorail of a number " + originalNumber + " is " + factorial);		
		input.close();
	}
}
				

