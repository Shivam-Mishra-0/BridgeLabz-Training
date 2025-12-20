//Creating a class name with StudentVoteChecker indicating to purpose is .
import java.util.Scanner;
public class StudentVoteChecker  
{	 public static boolean canStudentVote(int age)
	{	boolean aboveAge = true;
		boolean lessAge = false;
		if ( age < 0 )
		{	return lessAge;
		}
		else
		{	if ( age >= 18 )	return aboveAge;
			else
			return lessAge;
		}
    	}
	
   	public static void main(String [] args)
	{	Scanner input = new Scanner(System.in);
	    
		System.out.print("Enter your age  :");
		int age = input.nextInt();
		System.out.println();
		
		boolean aboveAge = StudentVoteChecker.canStudentVote(age);
		boolean lessAge = StudentVoteChecker.canStudentVote(age);

		System.out.println(aboveAge );
		//System.out.println( lessAge );
		input.close();  
    	}
}