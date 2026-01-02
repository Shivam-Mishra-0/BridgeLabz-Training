//Creating a class name with PositiveNegativeZero indicating to purpose is to check whether number is positive, negative or zero.
import java.util.Scanner;
public class PositiveNegativeZero
{	//Created a method with name checkNumber.
	public static int checkNumber( int number )
	{	if ( number > 0 )
		{	//int positive = 1;
			return 1;
		}
		else if ( number < 0 )
		{	//int negative = -1;
			return -1;
		}
		else
		{	//int zero = 0;
			return 0;
		}
	}
		
	public static void main(String args[])
	{	int number, result ;	
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		//Calling the checkNumber method in the PositiveNegativeZero class.
       		result = checkNumber( number ); 
	
		//Print rounds.
		System.out.println( result );
		input.close();
	}
}

 







				

