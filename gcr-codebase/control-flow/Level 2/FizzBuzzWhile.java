//Creating a class name with FizzBuzzWhile indicating to purpose is to check the number is positive and mulitple of 3, 5 or both.
import java.util.Scanner;
public class FizzBuzzWhile
{	public static void main(String args[])
	{	//Create a int vairable name with number, result.
		int number, result;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the number :");
		number = input.nextInt();
		//Check the integer is positive using while loop.
		if ( number > 0 )
		{	int i = 1;
			while ( i <= number)
			{	if ( i % 3 == 0 && i % 5 == 0 )
				{	//print FizzBuzz.		
					System.out.println("FizzBuzz");		
				}			 
				else if ( i % 3 == 0 )
				{	//print Fizz.		
					System.out.println("Fizz");
				}
				else if ( i % 5 == 0 )
				{	//print Buzz.		
					System.out.println("Buzz");
				}
				else
				{	//print i.		
					System.out.println(i);
				}
				i++;				
			}
		}
		else
		{
			System.out.println("Please enter a Positive number.");
		}
		input.close();
	}
}







				

