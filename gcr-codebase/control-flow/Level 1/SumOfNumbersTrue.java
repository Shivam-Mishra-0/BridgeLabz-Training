//Creating a class name with SumOfNumbersTrue indicating to purpose is to find the sum of numbers untill the user enter 0.
import java.util.Scanner;
public class SumOfNumbersTrue
{	public static void main(String args[])
	{	//Create a double vairable name with total, store.
		double total = 0.0, store;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the store :");
		store = input.nextDouble();
		//Find the sum of numbers that user entered using while loop.
		while ( true )
		{	System.out.println("Enter the store again :");
			store = input.nextDouble();
			if ( store == 0 || store < 0 )  break;
			total = total + store;
			store--;
		}
		
		//Print the total value.
		System.out.println("The Total sum is " + total);
		input.close();
	}
}
				

