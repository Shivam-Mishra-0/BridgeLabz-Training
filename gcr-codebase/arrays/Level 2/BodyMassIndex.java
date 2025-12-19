//Creating a class name with BodyMassIndex indicating to purpose is to find the BMI and display the height, weight, BMI and status of each individual
import java.util.Scanner;
public class BodyMassIndex
{	public static void main(String args[])
	{	int count;
		int next = 0;
				
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : "); 
		int numPersons = input.nextInt();
        	double[] weights = new double[numPersons];
        	double[] heights = new double[numPersons];
        	double[] bmis = new double[numPersons];
        	String[] statuses = new String[numPersons];
		for (int i = 0; i < numPersons; i++) 
            	{	System.out.println("Data for Person " + (i + 1) + ":");
            		System.out.print("  Weight (kg): ");
            		weights[i] = input.nextDouble();
       		     	System.out.print("  Height (meters): ");
            		heights[i] = input.nextDouble();
			bmis[i] = weights[i] / (heights[i] * heights[i]);
			if (bmis[i] <= 18.4) 
                	{	statuses[i] = "Underweight";
            		}
			else if (bmis[i] >= 18.5 && bmis[i] <= 24.9) 
                	{	statuses[i] = "Normal";
            		}
			else if (bmis[i] >= 25.0 && bmis[i] <= 39.9) 
                	{	statuses[i] = "Overweight";
            		}
			else 
                	{	statuses[i] = "Obese";
            		}
        	}
		for (int i = 0; i < numPersons; i++) 	
            	{	System.out.println( "Person " + (i + 1) + " with height " + heights[i] + " ,weight " + weights[i] + " has BMI " + bmis[i] + " which is " + statuses[i] + " ." ) ;
        	}

		input.close();
	}
}

 







				

