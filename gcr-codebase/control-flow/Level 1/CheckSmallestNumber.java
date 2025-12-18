//Creating a class name with CheckSmallestNumber indicating to purpose is to check if first number is the smallest of the three numbers.
import java.util.Scanner;
public class CheckSmallestNumber
{	public static void main(String args[])
	{	
		//Create a int vairable name with number1, number2, number3 and boolean with True and False.
		int number1, number2, number3;
		boolean isNumber1 , notNumber1;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number1 :");
		number1 = input.nextInt();
		System.out.println("Enter the number2 :");
		number2 = input.nextInt();
		System.out.println("Enter the number3 :");
		number3 = input.nextInt();
		isNumber1 = true;
		notNumber1 = false;
		//Checking if first number is smaller or not.
		if ( number1 < number2 && number1 < number3 )
		{
			System.out.println("Is the first number the smallest? " + isNumber1 );
		}
		else
		{
			System.out.println("Is the first number the smallest? " + notNumber1);	
		}
	
		input.close();
	}
}
	
