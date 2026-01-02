//Creating a class name with BodyMassIndexExpand indicating to purpose is to find the BMI and display the height, weight, BMI and status of each individual using multi-dimensional array.
import java.util.Scanner;
public class BodyMassIndexExpand
{	public static void main(String args[])
	{	double w, h;
				
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : "); 
		int number = input.nextInt();
        	double[][] personData = new double[number][3];
        	String[] weightStatus = new String[number];
		for (int i = 0; i < number; i++) 
            	{	System.out.println("Data for Person " + (i + 1) + ":");
			while (true) 
                	{	System.out.print("Weight (kg): ");
                		w = input.nextDouble();
                		System.out.print("Height (meters): ");
                		h = input.nextDouble();
                		if (w > 0 && h > 0) 
                    		{	personData[i][0] = w; 
                    			personData[i][1] = h; 
                    			break;
                		}
				else 
                    		{	System.out.println("  Invalid input! Please enter positive values.");
                		}
            		}
			personData[i][2] = personData[i][0] / (personData[i][1] * personData[i][1]);
            		double bmi = personData[i][2];
			if (bmi <= 18.4) 
                	{	weightStatus[i] = "Underweight";
            		}
			else if (bmi <= 24.9) 
                	{	weightStatus[i] = "  Normal";
            		}
			else if (bmi <= 39.9) 
                	{	weightStatus[i] = "  Overweight";
            		}
			else 
                	{	weightStatus[i] = "  Obese";
            		}
        	}
		for (int i = 0; i < number; i++) 	
            	{	System.out.println( (i + 1) + "\n" + personData[i][0]  + "\n" + personData[i][1] + "\n" + personData[i][2] + "\n" + weightStatus[i]) ;
        	}

		input.close();
	}
}

 







				

