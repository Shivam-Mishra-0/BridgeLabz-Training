//Creating a class name with CalculateTotalPrice indicating to purpose is to calculate the total price.
import java.util.Scanner;
public class CalculateTotalPrice
{	public static void main(String args[])
	{	
		//Create a double vairable name with unitPrice, quantity and totalPrice.
		double unitPrice, quantity, totalPrice;
		

		//Create Scanner object to take a user input.
		Scanner input = new Scanner(System.in);


		//Take a input from user.
		System.out.println("Enter the value in unitPrice :");
		unitPrice = input.nextDouble();
		System.out.println("Enter the value in quantity :");
		quantity = input.nextDouble();
		//find the totalPrice.
		totalPrice = unitPrice * quantity;
		
		//Print the totalPrice
		System.out.println("The total purchase price is INR " + totalPrice + " if the quantity " + quantity + " and unit price is INR " + unitPrice);
		input.close();
	}
}
	
