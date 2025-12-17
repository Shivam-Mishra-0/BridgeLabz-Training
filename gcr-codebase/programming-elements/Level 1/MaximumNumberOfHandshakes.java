//Creating a class name with MaximumNumberOfHandshakes indicating to purpose is to find the maximum number of Handshakes.
import java.util.Scanner;
public class MaximumNumberOfHandshakes
{	public static void main(String args[])
	{	
		//Create a double vairable name with numberOfStudents, combination.
		double numberOfStudents, combination;
		

		//Create Scanner object to take a user input.
		Scanner input = new Scanner(System.in);


		//Take a input from user.
		System.out.println("Enter the value in numberOfStudents :");
		numberOfStudents = input.nextDouble();
		//find the maximum number of possible handshakes.
		combination = ( numberOfStudents * ( numberOfStudents - 1 )) / 2;
		
		//Print the Maximum Number of Handshakes
		System.out.println("The number of possible handshakes is " + combination);
		input.close();
	}
}
	
