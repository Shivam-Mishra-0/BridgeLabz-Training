//Creating a class name with StringDuplicateCharacter .
import java.util.*;
public class StringDuplicateCharacter
{       public static String removeDuplicateCharacter(String text)
	{	if ( text == null || text.length() < 2 )     
		{	return text;
		}
		boolean[] result = new boolean[256];
		String word = "";
		for ( int i = 0; i < text.length(); i++ )
		{	char currentChar = text.charAt(i);
			if ( !result[currentChar] )
			{	result[currentChar] = true;
				word  += currentChar;
			}
		}
		return word;
	}
	public static void main(String[] args)
	{	Scanner input=new Scanner(System.in);
        	System.out.println("Enter the text:");
        	String text=input.nextLine();
		
		String word = StringDuplicateCharacter.removeDuplicateCharacter( text );
		System.out.println("Word String is: " + word );

                input.close();
    	}
}