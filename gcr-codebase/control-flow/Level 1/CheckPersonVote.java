//Creating a class name with CheckPersonVote indicating to purpose is to check if first number is the smallest of the three numbers.
import java.util.Scanner;
public class CheckPersonVote
{	public static void main(String args[])
	{	
		//Create a int vairable name with age.
		int age;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the age :");
		age = input.nextInt();
		//Checking if person's age is 18 or older .
		if ( age >= 18 )
		{
			System.out.println("The person's age is " + age + " and can vote." );
		}
		else
		{
			System.out.println("The person's age is " + age + " and cannot vote." );
		}
	
		input.close();
	}
}
	
