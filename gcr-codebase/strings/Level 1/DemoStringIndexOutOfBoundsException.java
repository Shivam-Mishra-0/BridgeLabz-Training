//Creating a class name with DemoStringIndexOutOfBoundsException.
import java.util.*;
public class DemoStringIndexOutOfBoundsException 
{	//Created a method name with generateException.
	public void generateException(String variable)
	{	variable.charAt(variable.length() + 1);
	}
	//Created a method name with demonstrateException
	public void demonstrateException(String variable )
	{	try
		{	variable.charAt(variable.length() + 1);
		}
		catch(StringIndexOutOfBoundsException e)
		{	System.out.println("StringIndexOutOfBoundsException is : " + e.getMessage());
		}
	}
	public static void main(String[] args) 
       	{	Scanner input = new Scanner(System.in);
		System.out.println("Enter a variable: ");
		String variable = input.next();

		DemoStringIndexOutOfBoundsException obj = new DemoStringIndexOutOfBoundsException();
		try 
		{	obj.generateException(variable);
		}
		catch(java.lang.StringIndexOutOfBoundsException e)
		{	obj.demonstrateException(variable);
			System.out.println("StringIndexOutOfBoundsException is : " + e.getMessage());
		}
    	}
}