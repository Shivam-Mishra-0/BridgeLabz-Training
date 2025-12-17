//Creating a class name with KilometersToMiles indicating to purpose is to convert kilometers to miles.
import java.util.Scanner;

public class KilometerToMile
{
	public static void main(String args[])
	{	
		//Create a double vairable name with Kilomters, miles .
		double kilometers, miles;

		//Create Scanner object to take a user input.
		Scanner input = new Scanner(System.in);

		//Take a input from user.
		System.out.println("Enter the value in Km :");

		//Create a double variable name with kilometer.
		kilometers = input.nextDouble();

		//converting kilometer into miles.
		miles = kilometers / 1.6;

		//Print Miles.
		System.out.println("The total miles is " + miles + " mile for the given " + kilometers);
	}
}
	
