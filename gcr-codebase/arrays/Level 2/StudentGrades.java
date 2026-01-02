//Creating a class name with StudentGrades indicating to purpose is to find the grade of a student using multidimensional array.
import java.util.Scanner;
public class StudentGrades
{	public static void main(String args[])
	{					
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : "); 
		int number = input.nextInt();
        	double[][] marks = new double[number][3]; 
        	double[] percentages = new double[number];
        	String[] grades = new String[number];
		for (int i = 0; i < number; i++) 
            	{	System.out.println("\nEnter marks for Student " + (i + 1) + " (out of 100):");    
            		System.out.print("  Physics: ");
            		double physics = input.nextDouble();
            		System.out.print("  Chemistry: ");
            		double chemistry = input.nextDouble();
            		System.out.print("  Maths: ");
            		double maths = input.nextDouble();
			if (physics < 0 || chemistry < 0 || maths < 0) 
                	{	System.out.println("  Invalid marks! Please enter positive values.");
                		i--; 
                		continue;
            		}
			marks[i][0] = physics;
            		marks[i][1] = chemistry;
            		marks[i][2] = maths;
			double total = marks[i][0] + marks[i][1] + marks[i][2];
            		percentages[i] = (total / 300.0) * 100;
			double percentage = percentages[i];
            		if (percentage >= 80) 
                	{	grades[i] = "A";
            		}
			else if (percentage >= 70) 
                	{	grades[i] = "B";
            		} 
			else if (percentage >= 60) 
                	{	grades[i] = "C";
            		} 
			else if (percentage >= 50) 
                	{	grades[i] = "D";
            		} 
			else if (percentage >= 40) 
                	{	grades[i] = "E";
            		} 
			else 	
                	{	grades[i] = "R";
           		}
        	}		
		for (int i = 0; i < number; i++) 
            	{	System.out.printf(" Marks of " +  (i + 1) + " in physics " + marks[i][0] + " in chemistry " + marks[i][1] + " and in maths " + marks[i][2] + " with percentage of " +  percentages[i] + "\nGrade: " + grades[i] + "\n");
        }
		input.close();
	}
}

 







				

