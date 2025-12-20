//Creating a class name with UnitConvertor  indicating to purpose is To convert kilometers to miles, convert miles to kilometers, convert meters to feet and convert feet to meters and return the value.
import java.util.Scanner;
public class UnitConvertor  
{	public static double convertKmToMiles(double km)
	{	double km2miles = 0.621371;
		double miles = km * km2miles;
		return miles;
    	}
	public static double convertMilesToKm(double mile)
	{	double miles2km = 1.60934;
		double kilometers = mile * miles2km;
		return kilometers;
    	}
	public static double convertMetersToFeet(double meter)
	{	double meters2feet = 3.28084;
		double feets = meter * meters2feet;
		return feets;
    	}
	public static double convertFeetToMeters(double feet)
	{	double feet2meters = 0.3048;
		double meters = feet * feet2meters;
		return meters;
    	}
   	public static void main(String [] args)
	{	Scanner input = new Scanner(System.in);
	    
		System.out.print("Enter the number in Km :");
		double km = input.nextDouble();
		System.out.print("Enter the number in mile :");
		double mile = input.nextDouble();
		System.out.print("Enter the number in meter :");
		double meter = input.nextDouble();
		System.out.print("Enter the number in feet :");
		double feet = input.nextDouble();
		System.out.println();
		
		double miles = UnitConvertor.convertKmToMiles(km);
		double kilometers = UnitConvertor.convertMilesToKm(mile);
		double feets = UnitConvertor.convertMetersToFeet(meter);
		double meters = UnitConvertor.convertFeetToMeters(feet);

		System.out.println( "Distance in miles: " + miles );
		System.out.println( "Distance in kilometer: " + kilometers );
		System.out.println( "Distance in feet: " + feets );
		System.out.println( "Distance in meter: " + meters );
		input.close();  
    	}
}