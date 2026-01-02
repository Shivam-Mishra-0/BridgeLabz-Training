//Creating a class name with CheckAbundantNumber indicating to purpose is to check if a number taken from the user is a Abundant Number.
import java.util.Scanner;
public class CheckAbundantNumber
{	public static void main(String args[])
	{	//Create a int vairable name with number, sum.
		int number , sum = 0;
		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number :");
		number = input.nextInt();
		int tempNumber = Math.abs( number );
		//Use for loop from i = 1 to i < number.
		for ( int i = 1; i < number; i++ )
		{	if ( number % i == 0 )
			{	sum += i;
			}
		}
		if ( sum > number )
		{	System.out.println( "Abundant Number" );
		}
		else
		{	System.out.println( "Not a Abundant Number" );
		}	
				
		input.close();
	}
}







				

