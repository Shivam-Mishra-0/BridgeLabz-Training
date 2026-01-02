//Creating a class name with StringReverse .
import java.util.Scanner;
public class StringReverse
{       public static String reverseTheString( String text )
	{	String reverse = " ";
		for ( int i = text.length() - 1; i >= 0; i-- )
		{	reverse += text.charAt(i);
		}
		return reverse;	
	}
	public static void main(String[] args)
	{	Scanner input=new Scanner(System.in);
        	System.out.println("Enter the text:");
        	String text=input.nextLine();
		
		String reverse = reverseTheString(text);
		System.out.println("The reverse of  " + text + " is " + reverse );

                input.close();
    	}
}