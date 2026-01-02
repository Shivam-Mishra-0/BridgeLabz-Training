//Creating a class name with ReverseTheNumber indicating to purpose is to store the digits of the number in an array and display the array in reverse order.
import java.util.Scanner;
public class ReverseTheNumber
{	public static void main(String args[])
	{	int count;
		int next = 0;
				
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : "); 
		long originalNumber = input.nextLong();
        	long tempNumber = Math.abs(originalNumber);
		count = String.valueOf(tempNumber).length();
		int[] digitsArray = new int[count];
		for (int i = count - 1; i >= 0; i--) 
            	{	digitsArray[i] = (int) (tempNumber % 10);
            		tempNumber /= 10;
        	}
		int[] reversedArray = new int[count];
		for (int i = count - 1; i >= 0; i--) 
            	{	reversedArray[next] = digitsArray[i];
            		next++;
        	}
		for (int i = 0; i < reversedArray.length; i++) 
            	{	System.out.print(reversedArray[i]);
        	}

        	System.out.println();
		input.close();
	}
}

 







				

