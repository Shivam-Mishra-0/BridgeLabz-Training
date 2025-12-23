//Creating a class name with VowelsAndConsonants .
import java.util.Scanner;
public class VowelsAndConsonants
{       public static int countVowelsAndConsonants( String text )
	{	int vowelsCount = 0;
		for ( int i = 0; i < text.length(); i++ )
		{	if ( text.charAt(i) == 'a' || text.charAt(i) == 'e' || text.charAt(i) == 'i' || text.charAt(i) == 'o' || text.charAt(i) == 'u' )
			{	vowelsCount++;
			}
		}
		return vowelsCount;	
	}
	public static void main(String[] args)
	{	Scanner input=new Scanner(System.in);
        	System.out.println("Enter the text:");
        	String text=input.nextLine();
		
		int vowelsAndConsonants = countVowelsAndConsonants(text);
		int consonants = text.length() - vowelsAndConsonants;
		System.out.println("The number of vowels in " + text + " is " + vowelsAndConsonants );
		System.out.println("The number of consonants in " + text + " is " + consonants );

                input.close();
    	}
}