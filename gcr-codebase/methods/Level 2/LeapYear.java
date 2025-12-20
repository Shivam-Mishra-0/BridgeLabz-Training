//Creating a class name with LeapYear indicating to purpose is to check whether the year is a Leap Year or not .
import java.util.Scanner;
public class LeapYear 
{	public static void checkLeapYear( int year )
	{	if( year >= 1582 ) 
		{	if ( year % 4 == 0 && year % 100 != 0 )
			{	System.out.println( year + " is a Leap Year." );
			}
			else if (year % 100 == 0 )
			{	if ( year % 400 == 0 )
				{	System.out.println( year + " is a Leap Year." );
				}
				else
				{	System.out.println( year + " is not a Leap Year." );
				}
			}
			else 
			{	System.out.println( year + " is not a Leap Year." );
			}
		}
    	}
   	public static void main(String [] args)
	{	int year;
		Scanner input = new Scanner(System.in);
	    
		System.out.print("Enter year :");
		year = input.nextInt();

		checkLeapYear(year);		
		input.close();  
    	}
}