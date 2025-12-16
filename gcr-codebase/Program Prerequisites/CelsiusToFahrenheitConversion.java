import java.util.Scanner;

public class CelsiusToFahrenheitConversion
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the number in Celsius :");
		int celsius = sc.nextInt();
		
		/* Calculating the given number in Celsius to Fahrenheit. */
		
		int Fahrenheit = (celsius * 9/5) + 32;
		System.out.println("The temperature in Fahrenheit is :" + Fahrenheit);

	}
}
