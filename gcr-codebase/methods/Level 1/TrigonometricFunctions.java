//Creating a class name with TrigonometricFunctions indicating to purpose is to find sine, cosine and tangent.
import java.util.Scanner;
public class TrigonometricFunctions
{	public static double[] calculateTrigonometricFunctions(double angle)
	{	double[] trignometricFunctions = new double[3];
		double radians = angle * ( 3.14 / 180 );
		double sine = Math.sin( radians );
		double cosine = Math.cos( radians );
		double tangent = Math.tan( radians );	
		trignometricFunctions[0] = sine;
		trignometricFunctions[1] = cosine;
		trignometricFunctions[2] = tangent;
		return trignometricFunctions;
	}
	public static void main(String args[])
	{	double angle;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the angle :");
		angle = input.nextDouble();
			
		double[] trignometricFunctions = TrigonometricFunctions.calculateTrigonometricFunctions( angle );
		System.out.println( "The Trignometric angle of sine is " + trignometricFunctions[0] + ", cosine is " + trignometricFunctions[1] + " and tangent is " + trignometricFunctions[2] );
		input.close();
	}
}
	
