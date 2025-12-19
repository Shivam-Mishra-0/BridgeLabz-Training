//Creating a class name with EmployeesBonus indicating to purpose is to print Fizz, Buzz and FizzBuzz.
import java.util.Scanner;
public class EmployeesBonus
{	public static void main(String args[])
	{	double[] oldSalaries = new double[10];
		double[] yearOfService = new double[10];
		double[] bonusAmounts = new double[10];
		double[] newSalaries = new double[10];	
		double totalOldSalary = 0.0;
		double totalNewSalary = 0.0;
		double totalBonusPayout = 0.0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Employee Data : "); 
		for ( int i = 0; i < 10; i++ )
			{	System.out.print("Employee " + ( i + 1 ) + ":");
				System.out.print("Salary :");
				double tempSalary = input.nextDouble();
				System.out.print("Year of Service :");
				double tempYears = input.nextDouble();
				if (tempSalary <= 0 || tempYears < 0) 
              			{	  System.out.println("  Invalid input! Please enter positive values.");
               				   i--;
				} 
				else 
               			{	oldSalaries[i] = tempSalary;
              				yearOfService[i] = tempYears;
        			}
			}
		double bonusRate;
		for ( int i = 0; i < 10; i++ )
		{	if ( yearOfService[i] > 5 ) 
			{	bonusRate =  0.05;	
			}
			else 
			{	bonusRate = 0.02;
			}
			bonusAmounts[i] = oldSalaries[i] * bonusRate;
          		newSalaries[i] = oldSalaries[i] + bonusAmounts[i];
			totalOldSalary += oldSalaries[i];
            		totalBonusPayout += bonusAmounts[i];
            		totalNewSalary += newSalaries[i];
		}	
		System.out.println( "Total Old Salary:  " + totalOldSalary );
       		System.out.println( "Total Bonus Payout: " + totalBonusPayout );
       		System.out.println( "Total New Salary:  " + totalNewSalary );
		for (int i = 0; i < 10; i++) 
            	{	System.out.println( "Employee Bonus: " + 
                               			       	     ( i + 1 ) + bonusAmounts[i] + "\nNew Salary : "  + 								     newSalaries[i] );
   		 }

		input.close();
	}
}

 







				

