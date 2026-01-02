//Creating a class name with TwoStrings.
import java.util.*;
public class TwoStrings 
{	public static boolean comparisonStrings( String variable1, String variable2 )
	{	boolean isBothEqual = false;
		if ( variable1.equals(variable2))
		{	isBothEqual = true;
		}
		else
		{	isBothEqual = false;
		}
		return isBothEqual ;
	}
	public static void main(String[] args) 
       	{	Scanner input = new Scanner(System.in);
		System.out.println("Enter two variables : ");
		System.out.println("Enter variable1 : ");
		String variable1 = input.next();
		System.out.println("Enter variable2 : ");
		String variable2 = input.next();
		
		boolean isStringEqual = false;
		if ( variable1.length() == variable2.length() )
		{	for ( int i = 0; i < variable1.length(); i++ )
			{	if ( variable1.charAt(i) == variable2.charAt(i) )
				{	isStringEqual = true;					
				}
				else 
				{	isStringEqual = false;					
				}
			}
		}
		else
		{	isStringEqual = false;
		}
		boolean isBothEqual = TwoStrings.comparisonStrings( variable1, variable2 );
		if ( isBothEqual )
		{	System.out.println("The two strings are equal or not ?" + "\n Answer : " + isBothEqual );
		}
		else
		{	System.out.println("The two strings are equal or not ?" + "\n Answer : " + isBothEqual );
		}
        
		input.close();
    	}
}