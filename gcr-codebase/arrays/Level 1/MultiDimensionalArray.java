//Creating a class name with MultiDimensionalArray indicating to purpose is to copy the 2D Array into a single dimension array.
import java.util.Scanner;
public class MultiDimensionalArray
{	public static void main(String args[])
	{	int rows, columns, index = 0;

		Scanner input = new Scanner(System.in);
		System.out.println("Enter the rows :");
		rows = input.nextInt();
		System.out.println("Enter the columns :");
		columns = input.nextInt();
		int[] array = new int[ rows * columns ];                  
		for ( int i = 0; i < rows; i++ )
		{	for ( int j = 0; j < columns; j++ )
			{	System.out.println("Enter : ");
				array[index] = input.nextInt();
				index++;
			}
		}
		System.out.print( "The 1D array is : " );
		for ( int i = 0; i < array.length; i++ )
		{	System.out.print( array[i] + " " );
		}

		
		input.close();
	}
}

 







				

