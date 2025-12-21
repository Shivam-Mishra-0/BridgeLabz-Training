//Creating a class name with BMITracker.
import java.util.Scanner;
public class BMITracker  
{	public static void calculateBMI(double[][] data)
	{	for (int i = 0; i < data.length; i++) 
            	{	double weight = data[i][0];
                        double heightInMeters = data[i][1] / 100.0; 
            		data[i][2] = weight / (heightInMeters * heightInMeters);
		}
	}
	public static String[] determineBMIStatus(double[][] data)
	{	String[] statusArray = new String[data.length];	
		for (int i = 0; i < data.length; i++) 
                {	double bmi = data[i][2];
            		if (bmi <= 18.4) 
                	{	statusArray[i] = "Underweight";
            		} 
			else if (bmi >= 18.5 && bmi <= 24.9) 
                	{	statusArray[i] = "Normal";
            		} 
			else if (bmi >= 25.0 && bmi <= 39.9) 
                	{	statusArray[i] = "Overweight";
            		} 
			else if (bmi >= 40.0) 
                	{	statusArray[i] = "Obese";
            		}
		}
		return statusArray;
	}
   	public static void main(String [] args)
	{	double[][] teamData = new double[10][3];
		Scanner input = new Scanner(System.in);
	    
		for (int i = 0; i < 10; i++) 
            	{	System.out.println("Data for Person " + (i + 1) + ":");
            		System.out.print("  Enter weight (kg): ");
            		teamData[i][0] = input.nextDouble();
            		System.out.print("  Enter height (cm): ");
            		teamData[i][1] = input.nextDouble();
        	}
        	calculateBMI(teamData);
		String[] statuses = determineBMIStatus(teamData);
		System.out.println();

		System.out.println("The data show's the member, weight, height, BMI and status");
           	for (int i = 0; i < 10; i++) 
            	{	System.out.println( (i + 1) +" " +  teamData[i][0] +" " + teamData[i][1] + " " + teamData[i][2] + " " + statuses[i]);
        	}

		input.close();  
    	}
}