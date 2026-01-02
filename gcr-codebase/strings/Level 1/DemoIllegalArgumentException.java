//Creating a class name with DemoIllegalArgumentException.
import java.util.Scanner;
public class DemoIllegalArgumentException 
{   	public static void generateAbruptException(String str) 
        {	System.out.println("Attempting invalid substring (5, 2)...");
        	String result = str.substring(5, 2); 
        	System.out.println("This line will never print: " + result);
    	}
    	public static void demonstrateHandling(String str) 
        {	try 
            	{	System.out.println("Attempting invalid substring (5, 2) inside try block...");
            		String result = str.substring(5, 2);
            		System.out.println("Result: " + result);
        	} 
        	catch (StringIndexOutOfBoundsException e) 
            	{	System.out.println("Caught Specific Exception: Start index cannot be greater than end index.");
            		System.out.println("Error Message: " + e.getMessage());
        	}
        	catch (RuntimeException e) 
            	{	System.out.println("Caught Generic RuntimeException: " + e);
        	}
    	}
	public static void main(String[] args) 
        {	Scanner input = new Scanner(System.in);
        
        	System.out.print("Enter a string for processing: ");
        	String userInput = input.nextLine();
        	System.out.println("\n--- Step 1: Generating Unhandled Exception ---");
        	try 
            	{	generateAbruptException(userInput);
        	} 
		catch (Exception e)	
		{	System.out.println("Abrupt stop prevented in main for demonstration: " + e);
        	}
        	System.out.println("\n--- Step 2: Handling Exception via Try-Catch ---");
        	demonstrateHandling(userInput);

        	System.out.println("\nProgram execution completed successfully.");
        	input.close();
    	}
}