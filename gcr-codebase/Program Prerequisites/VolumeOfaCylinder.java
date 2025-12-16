import java.util.Scanner;

public class VolumeOfaCylinder
{
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Radius of a Cylinder :");
		double radius = sc.nextDouble();

		System.out.println("Enter the Height of a Cylinder :");
		double height = sc.nextDouble();

		/* We will Calculate the Volume of a Cylinder while taking radius and height as a input.
		   We will take the value of pi as 3.14 . */

		double volume = 3.14 * ( radius * radius ) * height;

		System.out.println("The Volume of a Cylinder is :" + volume);

	}
}  