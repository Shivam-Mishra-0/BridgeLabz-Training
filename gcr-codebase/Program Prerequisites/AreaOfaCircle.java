import java.util.Scanner;

public class AreaOfaCircle
{
	public static void main(String[] args)
	{
		Scanner sc = new Scanner(System.in);
	
		System.out.println("Enter the radius of a Circle :");
		double radius = sc.nextDouble();

		/* We will Calculate the Area of Cirlce while taking Radius as a input. 
		   We will take the value of pi as 3.14.*/
	

		double area = 3.14 * radius * radius;		

		System.out.println("The Area of a Circle is :" + area);
	}
}
		