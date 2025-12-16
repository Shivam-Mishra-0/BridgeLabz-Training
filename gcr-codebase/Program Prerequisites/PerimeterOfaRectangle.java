import java.util.Scanner;

public class PerimeterOfaRectangle
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the value of Length :");
		double length = sc.nextDouble();

		System.out.println("Enter the value of Width :");
		double width = sc.nextDouble();

		/* We will calculate the perimeter of a rectangle while taking length and width as a input. */

		double perimeter = 2 * ( length + width );

		System.out.println("The perimeter of a rectangle is :" + perimeter);
	}
}
