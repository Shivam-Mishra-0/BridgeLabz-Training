//Creating a class name with UnitConvertorSecond  indicating to purpose is To convert yards to feet, convert feet to yards, convert meters to inches , inches to meters and convert inches to centimeters and return the value.
import java.util.Scanner;
public class UnitConvertorSecond  
{	public static double convertYardsToFeet(double yard)
	{	double yards2feet = 3;
		double feets = yard * yards2feet;
		return feets;
    	}
	public static double convertFeetToYards(double feet)
	{	double feet2yards = 0.333333;
		double yards = feet * feet2yards;
		return yards;
    	}
	public static double convertMetersToInches(double meter)
	{	double meters2inches = 39.3701;
		double inches = meter * meters2inches;
		return inches;
    	}
	public static double convertInchesToMeters(double inch)
	{	double inches2meters = 0.0254;
		double meters = inch * inches2meters;
		return meters;
    	}
	public static double convertInchesToCm(double inch)
	{	double inches2cm = 2.54;
		double cm = inch * inches2cm;
		return cm;
    	}

   	public static void main(String [] args)
	{	Scanner input = new Scanner(System.in);
	    
		System.out.print("Enter the number in yard :");
		double yard = input.nextDouble();
		System.out.print("Enter the number in feet :");
		double feet = input.nextDouble();
		System.out.print("Enter the number in meter :");
		double meter = input.nextDouble();
		System.out.print("Enter the number in inch :");
		double inch = input.nextDouble();
		System.out.println();
		
		double feets = UnitConvertorSecond.convertYardsToFeet(yard);
		double yards = UnitConvertorSecond.convertFeetToYards(feet);
		double inches = UnitConvertorSecond.convertMetersToInches(meter);
		double meters = UnitConvertorSecond.convertInchesToMeters(inch);
		double cm = UnitConvertorSecond.convertInchesToCm(inch);


		System.out.println( "Distance in from yards to feets: " + feets );
		System.out.println( "Distance in from feet to yards: " + yards );
		System.out.println( "Distance in from meters to inches: " + inches );
		System.out.println( "Distance in from inches to  meter: " + meters );
		System.out.println( "Distance in from inches to  cm: " + cm );
		input.close();  
    	}
}