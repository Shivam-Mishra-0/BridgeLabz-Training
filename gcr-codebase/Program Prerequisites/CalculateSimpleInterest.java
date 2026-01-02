import java.util.Scanner;

public class CalculateSimpleInterest
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of Principal :");
		double principal = sc.nextDouble();

		System.out.println("Enter the value of Rate :");
		double rate = sc.nextDouble();

		System.out.println("Enter the value of Time :");
		double time = sc.nextDouble();

		/* We will calculate Simple Interest while taking principal, rate and time as a input. */

		double simple_interest = ( principal * rate * time ) / 100;

		System.out.println("Simple Interest is :" + simple_interest);
	}
}
