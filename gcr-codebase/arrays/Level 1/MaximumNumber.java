//Creating a class name with MaximumNumber indicating to purpose is to print all numbers and sum of all numbers.
import java.util.Scanner;
public class MaximumNumber
{	public static void main(String args[])
	{	double total = 0.0; 
		double[] result = new double[10];
		int index = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter 10 numbers :");	
		while( true )
		{	double number = input.nextDouble();
			if( number <= 0 )
			{	break;
			}
			result[index] = number;
			index++;
			if ( index == 0 )
			{	break;
			} 	
		}
		for ( int i = 0; i < index; i++ )
		{ 	System.out.println( "Number " + (i + 1) + " : " + result[i] );
			total += result[i];
		}
		
		System.out.println( "The total value is " + total );
		input.close();
	}
}

 







				

