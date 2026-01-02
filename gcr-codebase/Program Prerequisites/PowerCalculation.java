import java.util.Scanner;

public class PowerCalculation
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of base :");
		double base = sc.nextDouble();

		System.out.println("Enter the value of exponent :");
		double exponent = sc.nextDouble();

		/* We will calculate the power while taking base and exponent as a input. */

		double result = Math.pow(base, exponent);

		System.out.println("Result is :" + result);
	}
}
