/*	11. Temperature Logger 🌡️
	Record temperatures over 7 days.
	● Use array and for-loop.
	● Find average and max temperature.
	● Use if for comparisons. Maintain readable naming and modular code blocks.  */
	
import java.util.*;
	
public class TemperatureLogger11
{	public static double calculateAverageTemperature( double[] temperatureRecord )
	{	double average = 0;
		for ( int i = 0; i < 7; i++ )
		{	average += temperatureRecord[i];
		}
		return average / 7.0;		
	}
	public static double calculateMaximumTemperature ( double[] temperatureRecord )
	{	double maximum = temperatureRecord[0];
		for ( int i = 0; i < 7; i++ )
		{	if ( temperatureRecord[i] > maximum )
			{	maximum = temperatureRecord[i];
			}		
		}
		return maximum;
	}
	
	public static void main( String args[] )
	{	Scanner input = new Scanner( System.in );
		double[] temperatureRecord = new double[7];
		System.out.println( "+=================================+" );
		System.out.println( "| The Temperature of 7 days       |" );
		System.out.println( "+=================================+" );
		for ( int i = 0; i < 7; i++ )
		{	System.out.println( "| Enter the Temperature of day | " + (i + 1) + "|" );
			System.out.print( "|  " );
			temperatureRecord[i] = input.nextDouble();  
			System.out.println("\033[A\033[34C|");
			System.out.println( "+=================================+" );
		}
		float average = ( float ) calculateAverageTemperature( temperatureRecord );
		double maximum = calculateMaximumTemperature( temperatureRecord );
		
		System.out.println( "+============================================+" );
		System.out.printf( "|The average temperature of 7 days : %.2f   |", average );
		System.out.println();
		System.out.printf( "|The maximum temperature of 7 days : %.2f   |", maximum );
		System.out.println();
		System.out.println( "+============================================+" );
		
		input.close();
	}
}	