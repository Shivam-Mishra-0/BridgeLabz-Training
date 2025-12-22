//Creating a class name with Substring.
import java.util.*;
public class Substring 
{	public static String getSubstring( String variable , int startIndex, int endIndex)
	{	String tempString = " ";
		for ( int i = startIndex; i <= endIndex; i++ )
		{	tempString += variable.charAt(i);
		}
		return tempString;
	}
	public static String getSubstringUsingBuiltIn( String variable , int startIndex, int endIndex)
	{	String temporaryString = " ";
		temporaryString = variable.substring( startIndex, endIndex );
		return temporaryString;
	}
	public static boolean comparisonStrings( String tempString, String temporaryString )
	{	boolean isBothEqual = false;
		if ( tempString.length() == temporaryString.length())
		{	for ( int i = 0; i < tempString.length(); i++ )
			{	if ( tempString.charAt(i) == temporaryString.charAt(i) )
				{	isBothEqual = true;
				}
				return isBothEqual;
			}
		}
		else
		{	isBothEqual = false;
		}
		return isBothEqual ;
	}
	public static void main(String[] args) 
       	{	Scanner input = new Scanner(System.in);
		System.out.println("Enter a variable of string : ");
		String variable = input.next();
		System.out.println("Enter the number from starting : ");
		int startIndex = input.nextInt();
		System.out.println("Enter the number from ending : ");
		int endIndex = input.nextInt();
		
		String tempString = Substring.getSubstring( variable, startIndex, endIndex );
		String temporaryString = Substring.getSubstringUsingBuiltIn( variable, startIndex, endIndex );
		System.out.println( "The substring by manually is " + tempString );    
		System.out.println( "The substring by inbuild is " + temporaryString );
		boolean isBothEqual = Substring.comparisonStrings( tempString, temporaryString );
		if ( isBothEqual )
		{	System.out.println("The two substrings are equal." + isBothEqual );
		}
		else
		{	System.out.println("The two substrings are not equal." + isBothEqual );
		}
		input.close();
    	}
}