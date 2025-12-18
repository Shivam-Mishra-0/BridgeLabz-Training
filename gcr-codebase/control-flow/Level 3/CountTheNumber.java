//Creating a class name with CountTheNumber indicating to purpose is to count the number of digits in an integer.
import java.util.Scanner;
public class CountTheNumber
{	public static void main(String args[])
	{	//Create a int vairable number, count.
		int number, count = 0;
		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number :");
		number = input.nextInt();
		int tempNumber = Math.abs( number );
		if ( tempNumber == 0 )
		{	count =1;
		}
		else
		{	//Using while loop until number is not equal to 0.
			while ( tempNumber != 0 )
			{	tempNumber = tempNumber / 10;
				count++;
			}
		}

		//Print the number of digits.
		System.out.println( "Number of digits: " + count);
		input.close();
	}
}







				

