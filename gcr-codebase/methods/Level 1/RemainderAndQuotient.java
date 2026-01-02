//Creating a class name with RemainderAndQuotient indicating to purpose is to find  the reminder and the quotient of a number.
import java.util.Scanner;
public class RemainderAndQuotient
{	public static int[] findRemainderAndQuotient(int number, int divisor)
	{	int[] remainderAndQuotient= new int[2];
 		int quotient = number / divisor;
		remainderAndQuotient[0] = quotient;
		int remainder = number % divisor ;
		remainderAndQuotient[1] = remainder;
		return remainderAndQuotient;
	}
	public static void main(String args[])
	{	int number, divisor;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number :");
		number = input.nextInt();
		System.out.println("Enter the divisor :");
		divisor = input.nextInt();
			
		int[] remainderAndQuotient = RemainderAndQuotient.findRemainderAndQuotient( number, divisor);
		System.out.println( "the quotient of a number is " + remainderAndQuotient[0] + " and the reamainder is " + remainderAndQuotient[1] );
		input.close();
	}
}
	
