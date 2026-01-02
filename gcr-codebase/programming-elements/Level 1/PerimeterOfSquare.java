//Creating a class name with PerimeterOfSquare indicating to purpose is to find the side of the square.
import java.util.Scanner;
public class PerimeterOfSquare
{	public static void main(String args[])
	{	
		//Create a double vairable name with perimeter and lengthSide.
		double perimeter, lengthSide;
		

		//Create Scanner object to take a user input.
		Scanner input = new Scanner(System.in);


		//Take a input from user.
		System.out.println("Enter the value in perimeter :");
		perimeter = input.nextDouble();
		//find the lengthSide using user input perimeter.
		lengthSide = perimeter / 4;

		//Print the side
		System.out.println("The length of the side is " + lengthSide + " whose perimeter is " + perimeter);
		input.close();
	}
}
	
