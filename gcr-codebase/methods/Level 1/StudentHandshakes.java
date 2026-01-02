//Creating a class name with StudentHandshakes indicating to purpose is to find the maximum number of hadshakes among students.
import java.util.Scanner;
public class StudentHandshakes
{	//Created a method with name maximumNumberOfHandshakes.
	public static int maximumNumberOfHandshakes( int numberOfStudents )
	{	int possibleHandshakes = ( numberOfStudents * ( numberOfStudents - 1 ) ) / 2;
		return possibleHandshakes;
	}
		
	public static void main(String args[])
	{	int numberOfStudents;	
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Number of  Students: "); 
        	numberOfStudents  = input.nextInt();
		//Calling the maximumNumberOfHandshakes method in the StudentHandshakes class.
        	int possibleHandshakes = StudentHandshakes.maximumNumberOfHandshakes( numberOfStudents );
	
		//Print possibleHandshakes.
		System.out.println( "The number of possible handshakes is " + possibleHandshakes  + ", If the students are " + numberOfStudents );
		input.close();
	}
}

 







				

