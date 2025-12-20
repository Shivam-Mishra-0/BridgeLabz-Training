//Creating a class name with NaturalNumber indicating to purpose is to check natural numbers of sum of n numbers.
import java.util.Scanner;
public class NaturalNumber
{	public static int checkNaturalNumber ( int number )
	{	int sum = 0;
		for ( int i = 1; i <= number; i++ )
		{	sum += i;
		}
		return sum;			
	}
	public static void main(String args[])
	{	
		//Create a int vairable name with number and sum.
		int number, sum;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number :");
		number = input.nextInt();
		
		sum = NaturalNumber.checkNaturalNumber( number );
		System.out.println( sum );
		input.close();
	}
}
	
