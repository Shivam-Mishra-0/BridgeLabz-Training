//Creating a class name with HeightInFeetAndInches indicating to purpose is to convert the height in feet and inches.
import java.util.Scanner;

public class HeightInFeetAndInches
{
	public static void main(String args[])
	{	
		//Create a double vairable name with height, feet and inchs.
		double height , feet , inchs;
		
		//Create Scanner object to take a user input.
		Scanner input = new Scanner(System.in);

		//Take a input from user.
		System.out.println("Enter the value in height :");
		height = input.nextDouble();

		//First : We will convert centimeter into inchs.
		inchs = height / 2.54;

		//First : We will convert inchs to feet.
		feet = inchs / 12;

		//Print the inchs and feet.
		System.out.println("Your Height in cm is " + height + " while in feet is " + feet + " and inches is " + inchs);
	}
}
	
