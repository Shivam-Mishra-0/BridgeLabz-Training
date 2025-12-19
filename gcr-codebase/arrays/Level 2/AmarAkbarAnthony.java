//Creating a class name with AmarAkbarAnthony indicating to purpose is to find the youngest  and tallest among three friends.
import java.util.Scanner;
public class AmarAkbarAnthony
{	public static void main(String args[])
	{	String[] names = {"Amar", "Akbar", "Anthony"};
        	int[] ages = new int[3];
        	double[] heights = new double[3];
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the Employee Data : "); 
		for (int i = 0; i < 3; i++) 
            	{	System.out.println("Enter data for " + names[i] + ":");
            		System.out.print("Age: ");
            		ages[i] = input.nextInt();
            		System.out.print("Height : ");
            		heights[i] = input.nextDouble();
        	}
		int youngestIndex = 0;
        	int tallestIndex = 0;
		for (int i = 1; i < 3; i++) 
                {	if (ages[i] < ages[youngestIndex]) 
                	{	youngestIndex = i;
            		}
			if (heights[i] > heights[tallestIndex]) 
                	{	tallestIndex = i;
            		}
        	}	
		System.out.println("The youngest friend is " + names[youngestIndex] + 
                           			   " with an age of " + ages[youngestIndex]);
        
        	System.out.println("The tallest friend is " + names[tallestIndex] + 
                          			   " with a height of " + heights[tallestIndex] + " cm");

		input.close();
	}
}

 







				

