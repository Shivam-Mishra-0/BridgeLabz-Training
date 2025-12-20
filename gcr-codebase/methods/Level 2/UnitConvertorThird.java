//Creating a class name with UnitConvertorThird  indicating to purpose is To convert yards to feet, convert feet to yards, convert meters to inches , inches to meters and convert inches to centimeters and return the value.
import java.util.Scanner;
public class UnitConvertorThird  
{	public static double convertFarhenheitToCelsius(double farhenheitTemp)
	{	double farhenheit2celsius = (farhenheitTemp - 32) * 5 / 9;
		double celsius = farhenheitTemp * farhenheit2celsius;
		return celsius;
    	}
	public static double convertCelsiusToFarhenheit(double celsiusTemp)
	{	double celsius2farhenheit = (celsiusTemp * 9 / 5) + 32;
		double farhenheit = celsiusTemp * celsius2farhenheit;
		return farhenheit;
    	}
	public static double convertKilogramsToPounds(double kilogram)
	{	double kilograms2pounds = 2.20462;
		double pounds = kilogram * kilograms2pounds;
		return pounds;
    	}
	public static double convertPoundsToKilograms(double pound)
	{	double pounds2kilograms = 0.453592;
		double kilograms = pound * pounds2kilograms;
		return kilograms;
    	}
	public static double convertGallonsToLiters(double gallon)
	{	double gallons2liters = 3.78541;
		double liters = gallon * gallons2liters;
		return liters;
    	}
	public static double convertLitersToGallons(double liter)
	{	double liters2gallons = 0.264172;
		double gallons = liter * liters2gallons;
		return gallons;
    	}

   	public static void main(String [] args)
	{	Scanner input = new Scanner(System.in);
	    
		System.out.print("Enter the number in farhenheitTemp :");
		double farhenheitTemp = input.nextDouble();
		System.out.print("Enter the number in celsiusTemp :");
		double celsiusTemp = input.nextDouble();
		System.out.print("Enter the number in kilogram :");
		double kilogram = input.nextDouble();
		System.out.print("Enter the number in pound :");
		double pound = input.nextDouble();
		System.out.print("Enter the number in gallon :");
		double gallon = input.nextDouble();
		System.out.print("Enter the number in liter :");
		double liter = input.nextDouble();
		System.out.println();
		
		double celsius = UnitConvertorThird.convertFarhenheitToCelsius(farhenheitTemp);
		double farhenheit = UnitConvertorThird.convertCelsiusToFarhenheit(celsiusTemp);
		double pounds = UnitConvertorThird.convertKilogramsToPounds(kilogram);
		double kilograms = UnitConvertorThird.convertPoundsToKilograms(pound);
		double liters = UnitConvertorThird.convertGallonsToLiters(gallon);
		double gallons = UnitConvertorThird.convertLitersToGallons(liter);

		System.out.println( "Distance in from Farhenheit to celsius: " + celsius );
		System.out.println( "Distance in from celsius to farhenheit: " + farhenheit );
		System.out.println( "Distance in from kilograms to pounds: " + pounds );
		System.out.println( "Distance in from pounds to  kilograms: " + kilograms );
		System.out.println( "Distance in from gallon to  liters: " + liters );
		System.out.println( "Distance in from liters to  gallons: " + gallons );
		input.close();  
    	}
}