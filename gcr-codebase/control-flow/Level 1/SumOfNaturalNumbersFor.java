//Creating a class name with SumOfNaturalNumbersFor indicating to purpose is to find the sum of natural numbers and compare with a formaulae.
import java.util.Scanner;
public class SumOfNaturalNumbersFor
{	public static void main(String args[])
	{	//Create a int vairable name with number, check.
		int number, check, duplicateNumber, numberFormulae;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number :");
		number = input.nextInt();
		//Find the sum of natural numbers using both For loop and formulae
		duplicateNumber = number; // Storing the number for later use.
		int numberFor = 0;
		for ( int i = duplicateNumber ; i >= 1; i-- )
		{	numberFor += duplicateNumber; 
			duplicateNumber--;
		}
		numberFormulae = number * ( number + 1 ) / 2;

		//Compare two results and print		
		if ( numberFor == numberFormulae )
		{	System.out.println("The sum of natural number using for is " + numberFor);
			System.out.println("The sum of natural number using formulae is " + numberFormulae);
		}
		else
		{
			System.out.println("Results do not match!");
		}
		input.close();
	}
}
				

