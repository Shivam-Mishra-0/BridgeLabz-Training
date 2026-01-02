//Creating a class name with Factors indicating to purpose is to  find the factors of a number.
import java.util.Scanner;
public class Factors
{	public static void main(String args[])
	{	int number, maxFactor = 10, maxIndex = 10, index = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the numbers :");
		number = input.nextInt();
		int[] factorArr = new int[maxFactor];                  
		for ( int i = 1; i <= number; i++ )
		{	if ( number % i == 0 )
			{	if ( maxIndex == i )
				{	maxIndex *= 2;
					int[] tempArr = new int[maxIndex]; 
					for ( int j = 0; j < factorArr.length; j++ )
					{	tempArr[j] = factorArr[j];
					}
					factorArr = tempArr;
				}
				factorArr[index] = i;
				index++;
			}
		}
		System.out.println( "The factors are : " );
		for ( int i = 0; i < index; i++ )
		{	System.out.print( factorArr[i] + " " );
		}
		
		input.close();
	}
}

 







				

