//Creating a class name with DigitFrequency indicating to purpose is to find the frequency of each digit in the number using an array.
import java.util.Scanner;
public class DigitFrequency
{	public static void main(String args[])
	{	int count;				
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a number : "); 
        	long number = input.nextLong();
        	long tempNumber = Math.abs(number);
		if (number == 0) 
            	{	System.out.println("Digit: 0, Frequency: 1");
            		return;
        	}
		count = String.valueOf(tempNumber).length();
		int[] digitsArray = new int[count];
        	long processingNumber = tempNumber;
       	 	for (int i = count - 1; i >= 0; i--) 
            	{	digitsArray[i] = (int) (processingNumber % 10);
            		processingNumber /= 10;
        	}	
		int[] frequencyArray = new int[10];	
		for (int i = 0; i < digitsArray.length; i++) 
            	{	int digitValue = digitsArray[i];
            		frequencyArray[digitValue]++;
        	}
		for (int i = 0; i < frequencyArray.length; i++) 
         	{	if (frequencyArray[i] > 0) 
                	{	System.out.println("Digit " + i + ": appeared " + frequencyArray[i] + " time(s)");
            		}
        	}

		input.close();
	}
}

 







				

