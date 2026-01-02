//Creating a class name with NumberChecker.
import java.util.Scanner;
public class NumberChecker 
{	public static int getDigitCount(long number) 
        {	if (number == 0) return 1;
        	return (int) Math.log10(Math.abs(number)) + 1;
    	}
	public static int[] getDigitsArray(long number) 
        {	long temp = Math.abs(number);
        	int size = getDigitCount(temp);
        	int[] digits = new int[size];

        	for (int i = size - 1; i >= 0; i--) 
            	{	digits[i] = (int) (temp % 10);
            		temp /= 10;
        	}
        	return digits;
    	}
	public static boolean isDuckNumber(int[] digits) 
        {	for (int d : digits) 
            	{	if (d == 0) return true;
        	}
        	return false;
    	}
	public static boolean isArmstrong(int[] digits) 
        {	int n = digits.length;
        	double sum = 0;
        	long originalNumber = 0;
       		for (int d : digits) 
            	{	sum += Math.pow(d, n);
        	}
        	for (int d : digits) 
            	{	originalNumber = originalNumber * 10 + d;
        	}	
        	return (int) sum == originalNumber;
    	}
	public static void displayLargest(int[] digits) 
        {	int largest = Integer.MIN_VALUE;
        	int secondLargest = Integer.MIN_VALUE;
        	for (int d : digits) 
            	{	if (d > largest) 
                	{	secondLargest = largest;
                		largest = d;
            		} 
			else if (d > secondLargest && d != largest) 
                	{	secondLargest = d;
            		}
        	}
        	System.out.println("Largest digit: " + largest);
        	System.out.println("Second largest digit: " + (secondLargest == Integer.MIN_VALUE ? "None" : secondLargest));
    	}
	public static void displaySmallest(int[] digits) 
        {	int smallest = Integer.MAX_VALUE;
        	int secondSmallest = Integer.MAX_VALUE;
        	for (int d : digits) 
            	{	if (d < smallest) 
                	{	secondSmallest = smallest;
                		smallest = d;
            		} 
			else if (d < secondSmallest && d != smallest) 
                	{	secondSmallest = d;
            		}
        	}
        	System.out.println("Smallest digit: " + smallest);
        	System.out.println("Second smallest digit: " + (secondSmallest == Integer.MAX_VALUE ? "None" : secondSmallest));
    	}

    	public static void main(String[] args) 
        {	Scanner input = new Scanner(System.in);
        	 System.out.print("Enter a number to analyze: ");
        	long num = input.nextLong();
	        int[] digits = getDigitsArray(num);
        	System.out.println();

        	System.out.println("Digit Count: " + getDigitCount(num));
        	System.out.println("Is Duck Number: " + isDuckNumber(digits));
        	System.out.println("Is Armstrong Number: " + isArmstrong(digits));
        	displayLargest(digits);
        	displaySmallest(digits);
		input.close();
    	}
}