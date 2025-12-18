//Creating a class name with FactorsOfNumberWhile indicating to purpose is to check the number is positive and mulitple of 3, 5 or both.
import java.util.Scanner;
public class FactorsOfNumberWhile
{	public static void main(String args[])
	{	//Create a int vairable name with number, result.
		int number, result;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number :");
		number = input.nextInt();
		//Check the integer is positive using while loop.
		if ( number > 0 )
		{	int i = 1;
			while ( i < number )
			{	if ( number % i == 0 )
				{	//print true.		
					System.out.println(i);		
				}
				i++;								
			}
		}
		else
		{
			System.out.println("Please enter a Positive number.");
		}
		input.close();
	}
}







				

