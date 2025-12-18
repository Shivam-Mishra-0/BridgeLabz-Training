//Creating a class name with MultiplesOfNumber indicating to purpose is to find all the multiples of a number.
import java.util.Scanner;
public class MultiplesOfNumber
{	public static void main(String args[])
	{	//Create a int vairable name with number.
		int number;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number :");
		number = input.nextInt();
		//Check the integer is positive using for loop.
		if ( number > 0 && number < 100 )
		{	for ( int i = 100; i >= 1; i-- )
			{	if ( i % number == 0 )
				{	//print i.		
					System.out.println(i);	
				}								
			}
		}
		else
		{
			System.out.println("Please enter a Positive number.");
		}

		input.close();
	}
}







				

