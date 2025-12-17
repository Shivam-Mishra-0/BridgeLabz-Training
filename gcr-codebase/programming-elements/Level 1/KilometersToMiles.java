//Creating a class name with KilometersToMiles indicating to purpose is to convert the distance of Kilometer to miles.
import java.util.Scanner;

public class KilometersToMiles
{
	public static void main(String args[])
	{	
		//Create a double variable name with kilometer and Miles.
		double kilometers, miles;

		//Creating Scanner object to take input from the user.
		Scanner input = new Scanner(System.in);

		System.out.println("Enter the value in Kilometer : ");

		//Assign the user input in the variable.
		kilometers = input.nextDouble();

		//Multiplication Operator ( * ).
		//Converting the value of Kilometer to Miles.
		miles = kilometers * 1.6;

		//Print Miles.
		System.out.println("The distance " + kilometers + " km in miles is " + miles);

		input.close();
	}
}
	
