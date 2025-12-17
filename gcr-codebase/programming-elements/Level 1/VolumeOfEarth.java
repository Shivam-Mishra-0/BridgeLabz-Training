//Creating a class name with VolumeOfEarth indicating to purpose is to calculate the volume of Earth.
public class VolumeOfEarth
{
	public static void main(String args[])
	{	
		//Create a integer vairable name with radius and assign the value 6378 km.
		int radius = 6378;

		//Create a double variable name with volumeKilometer . Multiplication operator ( * ) , Division operator ( / ).
		//Taking the value of pi is 3.14.
		double volumeKilometer = ( 4.0 / 3.0 ) * 3.14 * radius * radius * radius;

		//Volume in cubic miles. 1km = 1.6 miles
		double radiusMiles = radius * 1.6;

		double volumeMiles = ( 4.0 / 3.0 ) * 3.14 * radiusMiles * radiusMiles * radiusMiles;

		//Print the volume of earth.
		System.out.println("The volume of earth in cubic kilometers is " + volumeKilometer + "  and cubic miles is " + volumeMiles);
	}
}
	
