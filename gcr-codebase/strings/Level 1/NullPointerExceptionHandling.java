//Creating a class name with DemoNullPointerExceptionHandling.
public class NullPointerExceptionHandling 
{	//Created a method name with generateException.
	public void generateException()
	{	String text = null;
		text.length();
	}
	//Created a method name with demonstrateException
	public void demonstrateException( )
	{	try
		{	String text = null;
			text.length();
		}
		catch(NullPointerException e)
		{	System.out.println("NullPointerException is : " + e.getMessage());
		}
	}
	public static void main(String[] args) 
       	{	NullPointerExceptionHandling obj = new NullPointerExceptionHandling();
		try 
		{	obj.generateException();
		}
		catch(java.lang.NullPointerException e)
		{	obj.demonstrateException();
			System.out.println("NullPointerException is : " + e.getMessage());
		}
    	}
}