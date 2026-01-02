//Creating a class name with CheckPositiveNegativeZero indicating to purpose is to check the number taken from user is whether even or odd using an array.
import java.util.Scanner;
public class CheckPositiveNegativeZero
{	public static void main(String args[])
	{	//Create a int vairable name with number.
		int[] number = new int[5];

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number :");
		//using a loop to get user input.
		for ( int i = 0; i < 5; i++ )
		{	System.out.print(( i + 1 ));
			number[i] = input.nextInt();
		}
		//Using for loop to check if number is positive, negative or zero.
		for ( int i = 0; i < 5; i++ )
		{	int tempNumber = number[i];
			if ( tempNumber < 0 )
			{	System.out.println( "Number " + tempNumber + " is negative." );
			}
			else if ( tempNumber == 0 )
			{ 	System.out.println( "Number " + tempNumber + " is zero." );
			}
			else
			{	System.out.println( "Number " + tempNumber + " is positive." );
				if ( tempNumber % 2 == 0 )
				{	System.out.println( "Number " + tempNumber + " is positive but even number." );
				}
				else 
				{	System.out.println( "Number " + tempNumber + " is positive but odd number." );
				}

		 	}
		}
		for ( int i = 0; i < 5; i++ )
		{	//int tempNumber = number[i];
			if ( number[i] == number[number.length - 1] )
			{	System.out.println( "Number " + number[i] + " is equal to " + number[number.length - 1] );
			}
			else if ( number[i] >= number[number.length - 1] )
			{	System.out.println( "Number " + number[i] + " is greater than " + number[number.length - 1] );
			}
			else 
			{	System.out.println( "Number " + number[i] + " is less than  " + number[number.length - 1] );
			}
		}

		input.close();
	}
}







				

