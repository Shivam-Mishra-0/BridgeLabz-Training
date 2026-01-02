//Creating a class name with BasicCalculator indicating to purpose is to calculate addition, subtraction, multiplication and division.
import java.util.Scanner;
public class BasicCalculator
{	public static void main(String args[])
	{			//Create a float vairable name with number1 and number2.
		float number1, number2, addition, subtraction, multiplication, division;
		

		//Create Scanner object to take a user input.
		Scanner input = new Scanner(System.in);


		//Take a input from user.
		System.out.println("Enter the value in number1 :");
		number1 = input.nextFloat();
		//Take a input from user.
		System.out.println("Enter the value in number2 :");
		number2 = input.nextFloat();
		//First : addition of 2 numbers using addition operator ( + ).
		addition = number1 + number2;
		//Second : subtraction of 2 numbers using subtraction operator ( - ).
		subtraction = number1 - number2;
		//third : multiplication of 2 numbers using multiplication operator ( * ).
		multiplication = number1 * number2;
		//fourth : Division of 2 numbers using division operator ( / ).
		division = number1 / number2;
		

		//Print the inchs and feet.
		System.out.println("The addition, subtraction, multiplication and division value of 2 numbers " + number1 + " and " + number2 + " is " + addition + " , " + subtraction + " , " + multiplication + " and " + division );
		input.close();
	}
}
	
