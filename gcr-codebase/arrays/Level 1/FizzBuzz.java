//Creating a class name with FizzBuzz indicating to purpose is to print Fizz, Buzz and FizzBuzz.
import java.util.Scanner;
public class FizzBuzz
{	public static void main(String args[])
	{	int number, index = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		String[] array = new String[number + 1];                  
		if ( number >= 0 )
		{ 	for ( int i = 0; i <= number; i++ )
			{	if (i % 3 == 0 && i % 5 == 0 )
				{	array[i] = "FizzBuzz ";
				}
				else if ( i % 3 == 0 )
				{	array[i] = "Fizz ";
				}
				else if ( i % 5 == 0 )
				{	array[i] = "Buzz ";
				}
				else
				{	array[i] = String.valueOf(i);
				}
				index++;
			}
		}
		System.out.print( "The Output of the given number is : " );
		for ( int i = 0; i < array.length; i++ )
		{	System.out.println( "Position " + i + " + " + array[i] );
		}

		
		input.close();
	}
}

 







				

