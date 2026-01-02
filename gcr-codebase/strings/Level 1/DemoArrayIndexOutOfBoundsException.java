//Creating a class name with DemoArrayIndexOutOfBoundsException.
import java.util.Scanner;
public class DemoArrayIndexOutOfBoundsException 
{   	public static void generateAbruptException(String[] arr) 
        {	System.out.println("Attempting to access index 10...");
        	String name = arr[10]; 
        	System.out.println("This line will not print: " + name);
    	}
    	public static void handleArrayException(String[] arr) 
        {	try 
            	{	String name = arr[10];
            		System.out.println("Name: " + name);
        	} 
        	catch (ArrayIndexOutOfBoundsException e) 
            	{	System.out.println("Caught Specific Exception: You tried to access an index that does not exist!");
            		System.out.println("Error Message: " + e.getMessage());
        	} 
        	catch (RuntimeException e) 
            	{	System.out.println("Caught a generic RuntimeException: " + e);
        	}
    	}
	public static void main(String[] args) 
        {	Scanner input = new Scanner(System.in);
        	String[] names = {"Alice", "Bob", "Charlie", "Diana"};
        
        	System.out.println("Array length is: " + names.length);
        	System.out.println("Valid indices are 0 to " + (names.length - 1));
        	try 
            	{	generateAbruptException(names);
        	} 
		catch (ArrayIndexOutOfBoundsException e) 
            	{	System.out.println("Abrupt termination would have occurred here. Exception: " + e);
        	}
        handleArrayException(names);
        input.close();
    	}
}