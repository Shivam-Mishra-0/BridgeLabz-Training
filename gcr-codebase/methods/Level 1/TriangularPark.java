//Creating a class name with TriangularPark indicating to purpose is to find how many rounds must the athlete complete in a Triangular Park.
import java.util.Scanner;
public class TriangularPark
{	//Created a method with name numberOfRounds.
	public static int numberOfRounds( int sideFirst, int sideSecond, int sideThird )
	{	int perimeter = ( sideFirst + sideSecond + sideThird );
		int distance = 5000; // 5 km = 5000 m
		int rounds = distance / perimeter ;
		return rounds;
	}
		
	public static void main(String args[])
	{	int sideFirst, sideSecond, sideThird;	
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the side 1 of a triangular Park : "); 
        	sideFirst  = input.nextInt();
		System.out.println("Enter the side 2 of a triangular Park : "); 
        	sideSecond  = input.nextInt();
		System.out.println("Enter the side 3 of a triangular Park : "); 
        	sideThird  = input.nextInt();
		//Calling the numberOfRounds method in the TriangularPark class.
        	int rounds = TriangularPark.numberOfRounds( sideFirst, sideSecond, sideThird );
	
		//Print rounds.
		System.out.println( "The number of rounds that completed is " + rounds );
		input.close();
	}
}

 







				

