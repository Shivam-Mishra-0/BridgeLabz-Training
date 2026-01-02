//Creating a class name with StudentsAndChocolates indicating to purpose is to find the number of chocolates each child gets and number of remaining chocolates.
import java.util.Scanner;
public class StudentsAndChocolates
{	public static int[] findStudentsAndChocolates(int numberOfchocolates , int numberOfChildren )
	{	int[] studentsAndChocolates= new int[2];
 		int quotient = numberOfchocolates / numberOfChildren ;
		studentsAndChocolates[0] = quotient;
		int remainder = numberOfchocolates % numberOfChildren  ;
		studentsAndChocolates[1] = remainder;
		return studentsAndChocolates;
	}
	public static void main(String args[])
	{	int numberOfchocolates, numberOfChildren;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numberOfchocolates :");
		numberOfchocolates = input.nextInt();
		System.out.println("Enter the numberOfChildren  :");
		numberOfChildren  = input.nextInt();
			
		int[] studentsAndChocolates = StudentsAndChocolates.findStudentsAndChocolates( numberOfchocolates, numberOfChildren);
		System.out.println( "The number of chocolates each child gets is " + studentsAndChocolates[0] + " and the  number of remaining chocolates is " + studentsAndChocolates[1] );
		input.close();
	}
}
	
