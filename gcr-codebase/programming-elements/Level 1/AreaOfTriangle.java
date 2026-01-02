//Creating a class name with AreaOfTriangle indicating to purpose is to calculate the area using base and height.
import java.util.Scanner;
public class AreaOfTriangle
{	public static void main(String args[])
	{	
		//Create a double vairable name with base and height.
		double height, base, area, areaInch, squareInches, squareCentimeters;
		

		//Create Scanner object to take a user input.
		Scanner input = new Scanner(System.in);


		//Take a input from user.
		System.out.println("Enter the value in base :");
		base = input.nextDouble();
		//Take a input from user.
		System.out.println("Enter the value in height :");
		height = input.nextDouble();
		//First : Find the area.
		area = 0.5 * base * height;
		//Second : area in sqaure centimeters.
		squareCentimeters = area * area;
		//third : area in inches.
		areaInch = area * 0.3937008;
		//fourth : area in square inches.
		squareInches = areaInch * areaInch;
		

		//Print the square inches and square centimeters
		System.out.println("The Area of Triangle in square inches is " + squareInches + " and in square centimeter is " + squareCentimeters);
		input.close();
	}
}
	
