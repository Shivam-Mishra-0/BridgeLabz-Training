//Creating a class name with SpringSeason indicating to purpose is to check whether the month is spring or not.
//import java.util.Scanner;
public class SpringSeason 
{	public static boolean checkSpringSeason( int month, int day )
	{	boolean isSpringSeason = 
		(month == 3 && day >= 20 && day <= 31 ) ||
		(month == 4 && day >= 1 && day <= 31 ) ||
		(month == 5 && day >= 1 && day <= 31 ) ||
		(month == 6 && day >= 1 && day <= 20 );
		
		return isSpringSeason;
	}

	public static void main(String args[]) 
	{	//Create a int vairable name with month and day.
		int month, day;
		

		/* //Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as number.
		System.out.println("Enter the month :");
		month = input.nextInt();
		System.out.println("Enter the day :");
		day = input.nextInt(); */
		//Using command line arguments find the month and day
		month = Integer.parseInt(args[0]);
		day = Integer.parseInt(args[1]);
		
		//calling a method checkSpringSeason.
		boolean isSpringSeason = SpringSeason.checkSpringSeason( month, day );
		//Checking the Spring Season using (if-else) loop.
		if ( isSpringSeason )
		{	System.out.println("Its a Spring Season");	
		}
		else
		{	System.out.println("Not a Spring Season");
		}
		
	
		//input.close();
	}
}
 







				

