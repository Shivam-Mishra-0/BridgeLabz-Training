//Creating a class name with CountDownNumber indicating to purpose is to count down the number for a rocket launch.
import java.util.Scanner;
public class CountDownNumber
{	public static void main(String args[])
	{	
		//Create a int vairable name with count.
		int count;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the count :");
		count = input.nextInt();
		//Check if counter is 1 using while loop .
		while ( count >= 1 )
		{	System.out.println("The count down starts " + count);
			count-- ;
			if ( count == 0 )
			{	System.out.println("Take Off");
			}
		}
	
		input.close();
	}
}
				

