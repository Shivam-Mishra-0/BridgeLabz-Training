import java.util.Scanner;

public class KilometersToMiles
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		/* We will calculate the kilometer to miles while taking kilometer as a input. */

		System.out.println("Enter the value of Distance in km :");
		double kilometer = sc.nextDouble();
		
		double miles = kilometer * 0.621371;

		System.out.println("Result is :" + miles);
	}
}
