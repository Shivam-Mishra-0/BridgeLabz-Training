//Creating a class name with LeapYear indicating to purpose is to check the year is leap year or not.
import java.util.Scanner;
public class LeapYear
{	public static void main(String args[])
	{	//Create a int vairable name with year.
		int year;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the year :");
		year = input.nextInt();
		//Check the year is leap year or not.
		if ( year >= 1582 )
		{	if ( year % 4 == 0 )
			{	System.out.println( year + " is a Leap Year" );
			}
			else if ( year % 100 == 0 )
			{	System.out.println( year + " is not a Leap Year" );
			}
			else if ( year % 400 == 0 )
			{	System.out.println( year + " is a Leap Year" );
			}
			else 
			{	System.out.println( year + " is not a Leap Year" );
			}
		}
		else
		{
			System.out.println("Year must be 1582 or later.");
		}

		input.close();
	}
}







				

