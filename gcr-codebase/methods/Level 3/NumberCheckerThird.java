//Creating a class name with NumberCheckerThird.
import java.util.Scanner;
import java.util.Arrays;
public class NumberCheckerThird 
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
    	public static int[] reverseArray(int[] digits) 
        {	int[] reversed = new int[digits.length];
        	for (int i = 0; i < digits.length; i++) 
            	{	reversed[i] = digits[digits.length - 1 - i];
        	}
        	return reversed;
    	}
    	public static boolean areArraysEqual(int[] array1, int[] array2) 
        {	if (array1.length != array2.length) return false;
        	for (int i = 0; i < array1.length; i++) 
            	{	if (array1[i] != array2[i]) return false;
        	}
        	return true;
    	}
    	public static boolean isPalindrome(int[] digits) 
        {	int[] reversed = reverseArray(digits);
        	return areArraysEqual(digits, reversed);
    	}
    	public static boolean isDuckNumber(int[] digits) 
        {	for (int d : digits) 
            	{	if (d == 0) return true;
        	}
        	return false;
    	}
    	public static void main(String[] args) 
        {	Scanner input = new Scanner(System.in);
        	System.out.print("Enter a number to check: ");
        	int number = input.nextInt();
	        int[] originalDigits = getDigitsArray(number);
	        int[] reversedDigits = reverseArray(originalDigits);
       
      		boolean palindrome = isPalindrome(originalDigits);
        	boolean duck = isDuckNumber(originalDigits);

	        System.out.println("\n--- Results for " + number + " ---");
	        System.out.println("Original Array: " + Arrays.toString(originalDigits));
	        System.out.println("Reversed Array: " + Arrays.toString(reversedDigits));
	        System.out.println("Is Palindrome: " + palindrome);
	        System.out.println("Is Duck Number: " + duck);
	        input.close();
    	}
}