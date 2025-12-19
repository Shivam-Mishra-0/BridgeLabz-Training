//Creating a class name with DigitNumbers indicating to purpose is to find the largest and second largest element of the array.
import java.util.Scanner;
public class DigitNumbers
{	public static void main(String args[])
	{	int maxDigit = 10;
		int index = 0;
		int lastDigit;
		int largest = 0;
        	int secondLargest = 0;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : "); 
		long number = input.nextLong();
		int[] digits = new int[maxDigit];
		long tempNumber = Math.abs(number);
		while (tempNumber != 0)
		{	if (index == maxDigit) 
                	{	break;
            		}
			lastDigit = ( int ) ( tempNumber % 10 ) ;
            		digits[index] = lastDigit;
			index++;
            		tempNumber = tempNumber / 10;
       		}
		for (int i = 0; i < index; i++) 
            	{	if (digits[i] > largest) 	
			{	secondLargest = largest;
                		largest = digits[i];
            		}
			else if (digits[i] > secondLargest && digits[i] != largest) 
			{	secondLargest = digits[i];
            		}
        	}
		System.out.println("Digits extracted: " + index);
        	System.out.println("Largest digit: " + largest);
        	System.out.println("Second largest digit: " + secondLargest);

		input.close();
	}
}

 







				

