//Creating a class name with StringPalindrome .
import java.util.Scanner;
public class StringPalindrome
{       public static void reverseTheString(String text)
	{	String reverse = "";
		for ( int i = text.length() - 1; i >= 0; i-- )
		{	reverse += text.charAt(i);
		}
		if ( reverse.equals(text) )
		{	System.out.println(" yes, it is a palindrome string. ");
		}
		else
		{	System.out.println(" no, it is not a palindrome string. ");
		}
	}
	public static void main(String[] args)
	{	Scanner input=new Scanner(System.in);
        	System.out.println("Enter the text:");
        	String text=input.nextLine();
		
		StringPalindrome.reverseTheString(text);

                input.close();
    	}
}