//Creating a class name with CheckStudentVote indicating to purpose is to check the students age whether they can vote or not using an array.
import java.util.Scanner;
public class CheckStudentVote
{	public static void main(String args[])
	{	//Create a int vairable name with elements, age.
		int[] age = new int[10];

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as age.
		System.out.println("Enter the age :");
		//using a loop to get user input.
		for ( int i = 0; i < 10; i++ )
		{	System.out.print(( i + 1 ));
			age[i] = input.nextInt();
		}
		//Using for loop to check if the age is negative then print invalid age.
		for ( int i = 0; i < 10; i++ )
		{	int currentAge = age[i];
			if ( currentAge < 0 )
			{	System.err.println("Invalid Age. ");
				System.exit(0);
			}
			else if ( currentAge >= 18 )
			{ 	System.out.println( "The student with age " + currentAge + " can vote.");
			}
			else
			{	System.out.println( "The student with age " + currentAge + " cannot vote."); 	}
		}

		input.close();
	}
}







				

