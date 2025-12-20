//Creating a class name with SmallestAndLargest indicating to purpose is to find the smallest and the largest of the 3 numbers.
import java.util.Scanner;
public class SmallestAndLargest
{	public static int[] findSmallestAndLargest(int number1, int number2, int number3)
	{	int[] smallestLargest = new int[2];
 		if ( (number1 < number2) && number1 < number3 )
		{	smallestLargest[0] = number1;
		}
		else if ( number2 < number1 && number2 < number3 )
		{	 smallestLargest[0] = number2;	
		}
		else 
		{	smallestLargest[0] = number3;
		}
		if ( number1 > number2 && number1 > number3 )
		{	smallestLargest[1] = number1;
		}
		else if ( number2 > number1 && number2 > number3 )
		{	 smallestLargest[1] = number2;			}
		else 
		{	smallestLargest[1] = number3;
		}	
		return smallestLargest;
	}
	public static void main(String args[])
	{	int number1, number2, number3, sum;
		Scanner input = new Scanner(System.in);
		System.out.println("Enter the number1 :");
		number1 = input.nextInt();
		System.out.println("Enter the number2 :");
		number2 = input.nextInt();
		System.out.println("Enter the number3 :");
		number3 = input.nextInt();
		
		int[] smallestLargest = SmallestAndLargest.findSmallestAndLargest( number1, number2, number3 );
		System.out.println( "the smallest number is " + smallestLargest[0] + " and largest number " + smallestLargest[1] );
		input.close();
	}
}
	
