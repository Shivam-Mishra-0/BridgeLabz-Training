//Creating a class name with MultiplicationTable indicating to purpose is to print a multiplication table of a number.
import java.util.Scanner;
public class MultiplicationTable
{	public static void main(String args[])
	{	int number; 
		int[] result = new int[11];

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");	
		number = input.nextInt();	
		for ( int i = 1; i < 10; i++ )
		{	
			result[i]  = number * i;
			System.out.println( "number " + number + " * " + i + " is " + result );
		}
		

		/* 
		for ( int i = 0; i < 10; i++ )
		{	int result = table * i;
			System.out.println( "Result: " + result );
			
		} */

		input.close();
	}
}

 







				

