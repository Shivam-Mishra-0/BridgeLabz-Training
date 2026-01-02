//Creating a class name with UniversityDiscountFee indicating to purpose is to find the discount and discountPrice.
import java.util.Scanner;

public class UniversityDiscountFee
{
	public static void main(String args[])
	{	
		//Create a double vairable name with fee, discountPercent.
		double fee , discountPercent;
		
		//Create Scanner object to take a user input.
		Scanner input = new Scanner(System.in);

		//Take a input from user.
		System.out.println("Enter the value in fee :");
		fee = input.nextDouble();

		//Take a input from user.
		System.out.println("Enter the value in discountPercent :");
		discountPercent = input.nextDouble();

		//Create a double variable name with discount and discountPrice . Multiplication operator ( * ).
		//First : We will calculate discount by dividing 10/100 and multiply with 125000.
		//Second : We will calculate discountPrice by subtracting the discount from the fee .
		double discount = ( discountPercent / 100.0 ) * fee;

		double discountPrice = 125000 - discount ;

		//Print the discount and discountPrice.
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountPrice);
	}
}
	
