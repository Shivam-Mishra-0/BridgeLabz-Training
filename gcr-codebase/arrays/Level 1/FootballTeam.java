//Creating a class name with FootballTeam indicating to purpose is to  find the mean height of players present in a football team.
import java.util.Scanner;
public class FootballTeam
{	public static void main(String args[])
	{	double number, sum = 0;
		double[] height = new double[11];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers :");	
		for ( int i = 0; i <= 10; i++ )
		{	System.out.println( "Number " + (i + 1) + " : " + height[i] );
			height[i] = input.nextDouble();
			sum += height[i];
		}
		double meanHeight = sum / 11;
		System.out.println("The mean height of the football team is " + meanHeight );
		
		input.close();
	}
}

 







				

