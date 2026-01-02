//Creating a class name with DigitNumbersExpand indicating to purpose is to find the largest and second largest element of the array.
import java.util.Scanner;
public class DigitNumbersExpand
{	public static void main(String args[])
	{	int maximumDigit = 10;
		int index = 0;
		int lastDigit;
		int largest = -1;
        	int secondLargest = -1;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : "); 
		String numInput = input.next();
		int[] digits = new int[maximumDigit];
		for (int i = 0; i < numInput.length(); i++) 
            	{	char c = numInput.charAt(i);
                        if (!Character.isDigit(c)) continue;
            		if (index == maximumDigit) 
                	{	maximumDigit += 10; 
                		int[] tempArray = new int[maximumDigit];                
           			for (int j = 0; j < digits.length; j++) 
                    		{	tempArray[j] = digits[j];
                		}
                                digits = tempArray;
           		}
			digits[index] = Character.getNumericValue(c);
            		index++;
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
		System.out.println("Final Array Capacity: " + maximumDigit);
        	System.out.println("Largest digit: " + largest);
        	System.out.println("Second largest digit: " + secondLargest);

		input.close();
	}
}

 







				

