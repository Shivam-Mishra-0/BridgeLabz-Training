//Creating a class name with BodyMassIndex indicating to purpose is to find the BMI of a person.
import java.util.Scanner;
public class BodyMassIndex
{	public static void main(String args[])
	{	//Create a double vairable weight, height, heightCm result.
		double weight, heightCm, height, result;
		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as weight,height.
		System.out.println("Enter the weight :");
		weight = input.nextDouble();
		System.out.println("Enter the heightCm :");
		heightCm = input.nextDouble();
		//convert cm into meter as 1m = 100cm
		height = heightCm * 100;
		//Find the BMI of a person using the formula.
		result = weight / ( height * height ); // unit : kg/m^2. 
		if ( result <= 18.4 )
		{	//Print Underweight.
			System.out.println( "Underweight" );
		}
		else if ( result >= 18.5 && result <= 24.9 )
		{	//Print Normal.
			System.out.println( "Normal" );
		}
		else if ( result >= 25.0 && result <= 39.9 )
		{	//Print Overweight.
			System.out.println( "Overweight" );
		}
		else if ( result >= 40.0 )
		{	//Print Obese.
			System.out.println( "Obese" );
		}
		else 
		{	//Print wrong input.
			System.out.println( "Wrong Input" );
		}
		
		input.close();
	}
}







				

