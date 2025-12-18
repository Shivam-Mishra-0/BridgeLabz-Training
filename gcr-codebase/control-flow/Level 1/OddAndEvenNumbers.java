//Creating a class name with OddAndEvenNumbers indicating to purpose is to find the odd and even numbers between 1 and the user input.
import java.util.Scanner;
public class OddAndEvenNumbers
{	public static void main(String args[])
	{	//Create a int vairable name with number, oddNumber and evenNumber.
		int number;
		String oddNumber = " ", evenNumber = " ";

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number :");
		number = input.nextInt();
		//Find the odd and even number between 1 and user input using for loop
		for ( int i = 1 ; i <= number; i++ )
		{	if ( i % 2 == 0 )
			{	evenNumber = evenNumber + i + " ";
			}
			else
			{	oddNumber = oddNumber + i + " ";
			}
		}

		//print odd and even number.		
		System.out.println("The odd number are " + oddNumber );
		System.out.println("The even number are " + evenNumber );
		input.close();
	}
}
				

