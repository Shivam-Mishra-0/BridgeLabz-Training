//Creating a class name with DistanceInYardsAndMiles indicating to purpose is to find the distancce in yards and feets.
import java.util.Scanner;
public class DistanceInYardsAndMiles
{	public static void main(String args[])
	{	
		//Create a double vairable name with distanceInFeet, distanceYard and distanceMiles.
		double distanceInFeet, distanceYard, distanceMiles;
		

		//Create Scanner object to take a user input.
		Scanner input = new Scanner(System.in);


		//Take a input from user.
		System.out.println("Enter the value in distanceInFeet :");
		distanceInFeet = input.nextDouble();
		//find the distance in yards.
		distanceYard = distanceInFeet * 3;
		//find the distance in Miles.
		distanceMiles = distanceYard * 1760;

		//Print the distance in yard and miles
		System.out.println("The distance in yard is " + distanceYard + " and in miles is " + distanceMiles);
		input.close();
	}
}
	
