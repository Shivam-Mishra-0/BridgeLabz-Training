import java.util.Scanner;

public class AverageOfThreeNumber
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		/* We will calculate the average of three numbers while taking num1, num2 and num3 as a input. */

		System.out.println("Enter the value of num1 :");
		double num1 = sc.nextDouble();
	
		System.out.println("Enter the value of num2 :");
		double num2 = sc.nextDouble();

		System.out.println("Enter the value of num3 :");
		double num3 = sc.nextDouble();

		double average = ( num1 + num2 + num3 ) / 3;

		System.out.println("Result is :" + average);
	}
}
