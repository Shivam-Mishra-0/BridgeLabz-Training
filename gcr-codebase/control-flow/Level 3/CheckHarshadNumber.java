//Creating a class name with CheckHarshadNumber indicating to purpose is to check if a number taken from the user is a Harshad Number.
import java.util.Scanner;
public class CheckHarshadNumber
{	public static void main(String args[])
	{	//Create a int vairable name with number, sum.
		int number , sum = 0;
		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number :");
		number = input.nextInt();
		int tempNumber = Math.abs( number );
		//Use while loop to access each digit number.
		while ( tempNumber != 0 )
		{	tempNumber = tempNumber % 10;
			sum += tempNumber;
			tempNumber = tempNumber / 10;
		} 
		if ( number % sum == 0 )
		{	//Print Harshad Number.
			System.out.println( "Harshad Number" );
		}
		else
		{	//Print Not a Harshad Number.
			System.out.println( "Not a Harshad Number" );
		}
			
				
		input.close();
	}
}







				

