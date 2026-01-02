//Creating a class name with FizzBuzz indicating to purpose is to check the number is positive and mulitple of 3, 5 or both.
import java.util.Scanner;
public class FizzBuzz
{	public static void main(String args[])
	{	//Create a int vairable name with number, result.
		int number, result;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number :");
		number = input.nextInt();
		//Check the integer is positive using for loop.
		if ( number > 0 )
		{	for ( int i = 1 ; i <= number; i++ )
			{	if ( i % 3 == 0 && i % 5 == 0 )
				{	//print FizzBuzz.		
					System.out.println("FizzBuzz");
				}			 
				else if ( i % 3 == 0 )
				{	//print Fizz.		
					System.out.println("Fizz");
				}
				else 
				{	//print Buzz.		
					System.out.println("Buzz");						}					
			}
		}

		input.close();
	}
}







				

