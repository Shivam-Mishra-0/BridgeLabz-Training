//Creating a class name with YoungestTallestFriend indicating to purpose is to find the age of three friends with their ages and heights.
import java.util.Scanner;
public class YoungestTallestFriend  
{	public static int findYoungestFriend(int[] age )
	{	int youngestIndex = 0;
		for (int i = 1; i < age.length; i++) 
                {	if (age[i] < age[youngestIndex]) 
                	{	youngestIndex = i;
            		}
        	}
		return youngestIndex;
	}
	public static int findTallestFriend(double[] height )
	{	int tallestIndex = 0;
		for (int i = 1; i < height.length; i++) 
                {	if (height[i] > height[tallestIndex]) 
                	{	tallestIndex = i;
			}
        	}
		return tallestIndex;
	}
	
   	public static void main(String [] args)
	{	String[] names = {"Amar", "Akbar", "Anthony"};
	
		int[] age = new int[3];
		double[] height = new double[3];
		Scanner input = new Scanner(System.in);
	    
		System.out.println("Enter your age and height ");
		for (int i = 0; i < 3; i++) 
            	{	System.out.println("Enter data for " + names[i] + ":");
            		System.out.print("Age: ");
            		age[i] = input.nextInt();
            		System.out.print("Height : ");
            		height[i] = input.nextDouble();
        	}
		System.out.println();
		
		int youngestIndex = findYoungestFriend(age);
		int tallestIndex = findTallestFriend(height);

		System.out.println("The youngest friend is " + names[youngestIndex] + " (Age: " + age[youngestIndex] + ")");
        	System.out.println("The tallest friend is " + names[tallestIndex] + " (Height: " + height[tallestIndex] + ")");
		input.close();  
    	}
}