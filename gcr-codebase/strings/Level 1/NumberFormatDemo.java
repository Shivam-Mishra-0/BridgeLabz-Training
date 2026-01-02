//Creating a class name with NumberFormatDemo.
import java.util.Scanner;
public class NumberFormatDemo 
{	public static void generateAbruptException(String text) 
        {	System.out.println("Attempting to parse: " + text);
        	int number = Integer.parseInt(text); 
        	System.out.println("Extracted Number: " + number);
    	}
    	public static void demonstrateHandling(String text) 
        {	try 
            	{	System.out.println("Attempting to parse inside try-catch block...");
            		int number = Integer.parseInt(text);
            		System.out.println("Extracted Number: " + number);
        	} 
        	catch (NumberFormatException e) 
            	{	System.out.println("Caught NumberFormatException: The text provided is not a valid integer.");
            		System.out.println("Error details: " + e.getMessage());
        	} 
        	catch (RuntimeException e) 
            	{	System.out.println("Caught a generic RuntimeException: " + e);
       	 	}
    	}
	public static void main(String[] args) 
        {	Scanner input = new Scanner(System.in);
        
        	System.out.println("Enter a exception:");
        	String userInput = input.nextLine();
        	try 
            	{	generateAbruptException(userInput);
        	} 
		catch (Exception e) 
            	{	System.out.println("Exception caught in main to allow program to continue: " + e);
        	}
        	demonstrateHandling(userInput);
        	input.close();
    	}
}