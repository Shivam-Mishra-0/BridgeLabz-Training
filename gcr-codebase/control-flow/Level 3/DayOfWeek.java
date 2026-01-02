//Creating a class name with DayOfWeek indicating to purpose is to prints the day of the week that the date falls on.
//import java.util.Scanner;
public class DayOfWeek
{	public static void main(String args[])
	{	//Create a int vairable name with month, day and year.
		int month, day, year;
		String op;
		/* //Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as month, day, year .
		System.out.println("Enter the month :");
		month = input.nextInt();
		System.out.println("Enter the day :");
		day = input.nextInt();
		System.out.println("Enter the year :");
		year = input.nextInt(); */

		//With the help of command line arguments.
		month = Integer.parseInt(args[0]);
		day = Integer.parseInt(args[1]);
		year = Integer.parseInt(args[2]);
		//USing formula to find the day of the week it falls on.
		int yearZ = year - ( 14 - month ) / 12;      			
		int x = yearZ + ( yearZ / 4 ) - ( yearZ / 100 ) + ( yearZ / 400 );
		int monthZ = month + 12 * ( ( 14 - month ) / 12 ) - 2;
		int dayZ = ( day + x + 31 * monthZ / 12 ) % 7;

		//Print Date.
		System.out.println("The day of the week is: " + dayZ);
		//input.close();
	}
}


 







				

