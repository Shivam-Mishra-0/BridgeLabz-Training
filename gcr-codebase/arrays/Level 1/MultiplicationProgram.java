//Creating a class name with MultiplicationProgram indicating to purpose is to print the multiplication table for entered number.
import java.util.Scanner;
public class MultiplicationProgram
{	public static void main(String args[])
	{	int number;
		int[] result = new int[10];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers :");	
		number = input.nextInt();
		for ( int i = 6; i <= 9; i++ )
		{ 	result[i] = number * i;
		}
		for ( int i = 6; i <= 9; i++ )
		{	System.out.println( number + " * " + i + " = " + result[i] );
		}
		
		input.close();
	}
}

 







				

