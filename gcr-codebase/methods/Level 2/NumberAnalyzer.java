//Creating a class name with NumberAnalyzer indicating to purpose is to find the age of three friends with their ages and heights.
import java.util.Scanner;
public class NumberAnalyzer  
{	public static boolean isPositive(int num)
	{	return num >= 0;
	}
	public static void checkEvenOdd(int num)
	{	if (num % 2 == 0) 
            	{	System.out.println(" (Number is Even)");
        	} else 
                {	System.out.println(" (Number is Odd)");
		}
	}
	public static int compare(int num1, int num2) 
        {	if (num1 > num2) 
           	{	return 1;
        	}
		else if (num1 == num2) 
                {	return 0;
        	} 
		else 
		{	return -1;
        	}
    	}
   	public static void main(String [] args)
	{	int[] numbers = new int[5];
		Scanner input = new Scanner(System.in);
	    
		System.out.println("Enter 5 numbers:");
        	for (int i = 0; i < numbers.length; i++) 
            	{	System.out.print("Element " + (i + 1) + ": ");
            		numbers[i] = input.nextInt();
        	}
		System.out.println();
		
		for (int i = 0; i < numbers.length; i++) 
            	{	System.out.print("Number " + numbers[i] + " is ");
            		if (isPositive(numbers[i])) 
                	{	System.out.print("Positive");
                		checkEvenOdd(numbers[i]);
            		} 
			else 
                	{	System.out.println("Negative");
            		}
        	}

		int first = numbers[0];
        	int last = numbers[numbers.length - 1];
        
        	int result = compare(first, last);

        	if (result == 1) 
            	{	System.out.println("First element (" + first + ") is Greater than last element (" + last + ")");
        	} 
		else if (result == 0) 
            	{	System.out.println("First element (" + first + ") and last element (" + last + ") are Equal");
        	} 
		else 
		{	System.out.println("First element (" + first + ") is Less than last element (" + last + ")");
        	}
		input.close();  
    	}
}