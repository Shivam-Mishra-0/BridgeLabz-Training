//Creating a class name with CountDownNumberFor indicating to purpose is to count down the number for a rocket launch.
import java.util.Scanner;
public class CountDownNumberFor
{	public static void main(String args[])
	{	//Create a int vairable name with count.
		int count;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the count :");
		count = input.nextInt();
		//Check if counter is 1 using for loop .
		for ( int i = count ; i >= 1 ; i-- )
		{
			System.out.println("The count Down : " + count );
			count--;
			if ( count == 0 )
			{	System.out.println("Take Off");
			}
		}
				
		input.close();
	}
}
				

