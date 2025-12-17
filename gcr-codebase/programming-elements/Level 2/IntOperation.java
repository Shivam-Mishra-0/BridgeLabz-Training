//Creating a class name with IntOperation indicating to purpose is to understand the precedence of the operators.
import java.util.Scanner;
public class IntOperation
{	public static void main(String args[])
	{	
		//Create a int vairable name with a, b, c, operation1, operation2, operation3 and operation4.
		int a, b, c, operation1, operation2, operation3, operation4;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as a, b and c.
		System.out.println("Enter the a :");
		a = input.nextInt();
		System.out.println("Enter the b :");
		b = input.nextInt();
		System.out.println("Enter the c :");
		c = input.nextInt();
		//Solving the operations using addition operator ( + ), subtraction operator ( - ), multiplication operator ( * ), division operator ( / ) and modulus operator ( % ).
		operation1 = a + b * c ;
		operation2 = a * b + c ;
		operation3 = c + a / b ;
		operation4 = a % b + c ;
		
		//Print operation1, operation2, operation3 and operation4.
		System.out.println("The results of Int Operations are " + operation1 + " , " + operation2 + " , " + operation3 + " and " + operation4 );
		input.close();
	}
}
	
