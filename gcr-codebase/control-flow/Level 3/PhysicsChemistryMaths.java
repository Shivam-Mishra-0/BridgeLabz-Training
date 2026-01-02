//Creating a class name with PhysicsChemistryMaths indicating to purpose is to find the grade and remarks while finding the percentage.
import java.util.Scanner;
public class PhysicsChemistryMaths
{	public static void main(String args[])
	{	//Create a int vairable name with percentage, physics, chemistry, maths and string variable name with grade.
		double percentage, physics, chemistry, maths;
		String grade;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as salary and year.
		System.out.println("Enter the physics :");
		physics = input.nextDouble();
		System.out.println("Enter the chemistry :");
		chemistry = input.nextDouble();
		System.out.println("Enter the maths :");
		maths = input.nextDouble();
		//Find the percentage.	
		percentage = ( ( physics + chemistry + maths ) / 300 ) * 100;
		//Find the grade according to the percentage using if-else loop.
		if ( percentage >= 80 )
		{	grade = "A";
			System.out.println("Grade is " + grade + 
					    " \nRemarks : Level 4, above agency-normalized standards" +
					    " \nPercentage is " + percentage );
		}
		else if ( percentage >= 70 && percentage <= 79 )
		{	grade = "B";
			System.out.println("Grade is " + grade + 
					    " \nRemarks : Level 3, at agency-normalized standards" +
					    " \nPercentage is " + percentage );
		}
		else if ( percentage >= 60 && percentage <= 69 )
		{	grade = "c";
			System.out.println("Grade is " + grade + 
					    " \nRemarks : Level 2, below, but approaching agency-normalized standards" +
					    " \nPercentage is " + percentage );
		}
		else if ( percentage >= 50 && percentage <= 59 )
		{	grade = "D";
			System.out.println("Grade is " + grade + 
					    " \nRemarks : Level 1, well below agency-normalized standards" +
					    " \nPercentage is " + percentage );
		}
		else if ( percentage >= 40 && percentage <= 49 )
		{	grade = "E";
			System.out.println("Grade is " + grade + 
					    " \nRemarks : Level 1-, too below agency-normalized standards" +
					    " \nPercentage is " + percentage );
		}
		else if ( percentage <= 39 )
		{	grade = "R";
			System.out.println("Grade is " + grade + 
					    " \nRemarks : Remedial standards" +
					    " \nPercentage is " + percentage );
		}


		input.close();
	}
}
				

