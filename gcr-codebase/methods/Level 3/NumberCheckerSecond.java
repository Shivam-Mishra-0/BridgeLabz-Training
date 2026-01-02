//Creating a class name with NumberCheckerSecond.
import java.util.Scanner;
public class NumberCheckerSecond 
{	public static int getDigitCount(int number) 
        {	if (number == 0) return 1;
        	return (int) Math.log10(Math.abs(number)) + 1;
    	}
    	public static int[] getDigitsArray(int number) 
        {	int size = getDigitCount(number);
	        int[] digits = new int[size];
        	int temp = Math.abs(number);
	        for (int i = size - 1; i >= 0; i--) 
            	{	digits[i] = temp % 10;
	            temp /= 10;
        	}
        	return digits;
    	}
    	public static int findSumOfDigits(int[] digits) 
        {	int sum = 0;
	        for (int d : digits) 
        	{	sum += d;
	        }
        	return sum;
    	}
    	public static int findSumOfSquares(int[] digits) 
        {	int sumSquares = 0;
        	for (int d : digits) 
            	{	sumSquares += (int) Math.pow(d, 2);
        	}
        	return sumSquares;
    	}
    	public static boolean isHarshadNumber(int originalNumber, int[] digits) 
        {	int sum = findSumOfDigits(digits);
        	if (sum == 0) return false;
        	return originalNumber % sum == 0;
    	}
    	public static int[][] findDigitFrequency(int[] digits) 
        {	int[][] freqMap = new int[10][2];
        	for (int i = 0; i < 10; i++) 
            	{	freqMap[i][0] = i;
            		freqMap[i][1] = 0;
        	}
        	for (int d : digits) 
            	{	freqMap[d][1]++;
        	}
        	return freqMap;
    	}
    	public static void main(String[] args) 
        {	Scanner input = new Scanner(System.in);
        	System.out.print("Enter a number: ");
        	int number = input.nextInt();
       		int[] digits = getDigitsArray(number);
        	int sum = findSumOfDigits(digits);
        	int sumSquares = findSumOfSquares(digits);
        	boolean harshad = isHarshadNumber(number, digits);
        	int[][] frequencies = findDigitFrequency(digits);

	        System.out.println("Digit Count: " + digits.length);
	        System.out.println("Sum of Digits: " + sum);
        	System.out.println("Sum of Squares of Digits: " + sumSquares);
        	System.out.println("Is Harshad Number: " + harshad);
	        System.out.println("Digit | Frequency");
        	for (int i = 0; i < 10; i++) 
        	{	if (frequencies[i][1] > 0) 
                	{	System.out.println("  " + frequencies[i][0] + "   |    " + frequencies[i][1]);
            		}
        	}
        	input.close();
    	}
}