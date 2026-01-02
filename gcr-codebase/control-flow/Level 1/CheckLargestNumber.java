//Creating a class name with CheckLargestNumber indicating to purpose is to check if first number is the smallest of the three numbers.
import java.util.Scanner;
public class CheckLargestNumber
{	public static void main(String args[])
	{	
		//Create a int vairable name with number1, number2, number3.
		int number1, number2, number3;
		

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number1 :");
		number1 = input.nextInt();
		System.out.println("Enter the number2 :");
		number2 = input.nextInt();
		System.out.println("Enter the number3 :");
		number3 = input.nextInt();
		//Checking the number1, number2 and number3 is largest or not using boolean.
		boolean isNumber1 = (number1 > number2 && number1 > number3 );
		boolean isNumber2 = (number2 > number1 && number2 > number3 );
		boolean isNumber3 = (number3 > number1 && number3 > number2 );
		//Print the all the tree output.
		System.out.println("Is the first number the largest? " + isNumber1);
		System.out.println("Is the second number the largest? " + isNumber2);
		System.out.println("Is the third number the largest? " + isNumber3);
		
		input.close();
	}
}
	
