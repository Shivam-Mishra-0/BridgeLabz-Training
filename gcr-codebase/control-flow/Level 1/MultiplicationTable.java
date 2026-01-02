//Creating a class name with MultiplicationTable indicating to purpose is to find  the multiplication table of a number entered by the user from 6 to 9.
import java.util.Scanner;
public class MultiplicationTable
{	public static void main(String args[])
	{	//Create a int vairable name with number, result.
		int number, result;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number :");
		number = input.nextInt();
		//Find the multiplication table of a number using a for loop.
		for ( int i = 6 ; i <= 9; i++ )
		{	result = number * i;
			//print multiplication table.		
			System.out.println(number + " * " + i + " = " + result );
		}

		input.close();
	}
}
				

