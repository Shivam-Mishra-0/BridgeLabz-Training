//Creating a class name with WindChillTemperature indicating to purpose is to find the number of chocolates each child gets and number of remaining chocolates.
import java.util.Scanner;
public class WindChillTemperature
{	public static double calculateWindChill(double temperature, double windSpeed)
	{	double windChillTemperature = 35.74 + ( 0.6215 * temperature ) + ( 0.4275 * temperature - 35.75 ) * Math.pow ( windSpeed, 0.16 );
		return windChillTemperature;
	}
	public static void main(String args[])
	{	double temperature, windSpeed;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the temperature :");
		temperature = input.nextDouble();
		System.out.println("Enter the windSpeed  :");
		windSpeed  = input.nextDouble();
			
		double windChillTemperature = WindChillTemperature.calculateWindChill( temperature, windSpeed);
		System.out.println( "The wind chill temperature is " + windChillTemperature );
		input.close();
	}
}
	
