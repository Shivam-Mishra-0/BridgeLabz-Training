//Creating a class name with SumOfNumbers indicating to purpose is to count down the number for a rocket launch.
import java.util.Scanner;
public class SumOfNumbers
{	public static void main(String args[])
	{	//Create a double vairable name with total, store.
		double total = 0.0, store;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the store :");
		store = input.nextDouble();
		//Find the sum of numbers that user entered using while loop.
		while ( store >= 0 )
		{	System.out.println("Enter the store again :");
			store = input.nextDouble();
			total = total + store;
			if ( store == 0 )  break;
			store--;
		}
		
		//Print the total value.
		System.out.println("The Total sum is " + total);
		input.close();
	}
}
				

