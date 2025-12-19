//Creating a class name with OddAndEvenNumbers indicating to purpose is to  find the mean height of players present in a football team.
import java.util.Scanner;
public class OddAndEvenNumbers
{	public static void main(String args[])
	{	int[] number = new int[11];

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers :");
		int limit = input.nextInt();
		if (limit <= 1 )
			{	System.err.print("Invalid Number");
				System.exit(0);
			}
		int oddSize = ( limit + 1 ) /  2;
		int evenSize = limit / 2  ;
		int[] oddArr = new int[oddSize];
		int[] evenArr = new int[evenSize];	
		int oddIndex = 0, evenIndex =0;
		for ( int i = 1; i < limit; i++ )
		{	if ( i % 2 == 0 )
			{	evenArr[evenIndex] = i;
				evenIndex++;
			}
			else 
			{	oddArr[oddIndex] = i;
				oddIndex++;
			}
		}
		System.out.println( "Even numbers :");
		for ( int i = 0; i < evenIndex; i++ )
		{	System.out.print( evenArr[i] + " ");
		}
		System.out.println();
		System.out.println( "Odd numbers :");
		for ( int i = 0; i < oddIndex; i++ )
		{	System.out.print( oddArr[i] + " ");
		}
		
		input.close();
	}
}

 







				

