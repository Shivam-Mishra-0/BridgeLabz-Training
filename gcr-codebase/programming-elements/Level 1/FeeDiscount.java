//Creating a class name with StudentFee indicating to purpose is to find the discount and discountPrice.
public class FeeDiscount
{
	public static void main(String args[])
	{	
		//Create a integer vairable name with fee, discountPercent and assign the value 125000, 10.
		int fee = 125000, discountPercent = 10;

		//Create a double variable name with discount and discountPrice . Multiplication operator ( * ).
		//First : We will calculate discount by dividing 10/100 and multiply with 125000.
		//Second : We will calculate discountPrice by subtracting the discount from the fee .
		double discount = ( discountPercent / 100.0 ) * fee;

		double discountPrice = 125000 - discount ;

		//Print the discount and discountPrice.
		System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + discountPrice);
	}
}
	
