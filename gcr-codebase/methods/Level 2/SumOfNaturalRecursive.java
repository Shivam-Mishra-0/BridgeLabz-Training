//Creating a class name with SumOfNaturalRecursive indicating to purpose is to find the sum of n natural numbers using recursive method.
import java.util.Scanner;
class SumOfNaturalRecursive 
{	public static int sumOfNatural ( int number, int sum)
	{	if( number ==0 ) return sum;
		sum+=number;
		return sumOfNatural(number -1, sum);
    	}
   	public static void main(String [] args)
	{	Scanner input = new Scanner(System.in);
	    
		System.out.print("Enter number :");
		int number = input.nextInt();
		int sum = sumOfNatural(number,0);
	
		//printing sum.	
		System.out.println("The sum using recusive function :" + sum);
		System.out.println("The sum using recusive function :" + number*(number + 1)/2);
		input.close();  
    	}
}