//Creating a class name with CharacterString.
import java.util.*;
public class CharacterString 
{	//Created a method name with getCharacterArray with char[].
	public static char[] getCharacterArray( String variable )
	{	char[] characterArray = new char[variable.length()];
		for ( int i = 0; i < variable.length(); i++ )
		{	characterArray[i] = variable.charAt(i);
		}
		return characterArray;
	}
	//Created a method name with getCharacterArrayInBuilt
	public static char[] getCharacterArrayInBuilt( String variable )
	{	char[] charArray = new char[variable.length()];
		charArray = variable.toCharArray();
		return charArray;
	}
	//Created a method name with checkEquality for comparing two charArray.
	public static boolean checkEquality( char[] characterArray, char[] charArray )
	{	boolean isBothEqual = false;
		if ( characterArray.length == charArray.length)
		{	for ( int i = 0; i <characterArray.length; i++ )
			{	if ( characterArray[i] == charArray[i] )
				{	isBothEqual = true;
				}
				else
				{	break;
				}
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
		
		char[] characterArray = CharacterString.getCharacterArray( variable );
		char[] charArray = CharacterString.getCharacterArrayInBuilt( variable );
		
		boolean isBothEqual = CharacterString.checkEquality( characterArray, charArray );
		if ( isBothEqual )
		{	System.out.println("The strings are equal." + isBothEqual );
		}
		else
		{	System.out.println("The strings are not equal." + isBothEqual );
		}
		input.close();
    	}
}