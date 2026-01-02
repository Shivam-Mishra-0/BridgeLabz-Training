//Creating a class name with EmployeesBonus indicating to purpose is to find the factorial of an integer using for loop.
import java.util.Scanner;
public class EmployeesBonus
{	public static void main(String args[])
	{	//Create a int vairable name with salary, year and double with  bonus.
		int salary, year;
		double bonus = 0.0;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as salary and year.
		System.out.println("Enter the salary :");
		salary = input.nextInt();
		System.out.println("Enter the year :");
		year = input.nextInt();
		//Find bonus of an employee using salary and year
		if ( year > 5 )
		{	bonus = salary * 0.05;
		}		
					
		//print Bonus.
		System.out.println("The bonus of an employee is " + bonus);
		input.close();
	}
}
				

