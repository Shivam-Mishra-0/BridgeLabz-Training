//Creating a class name with ProfitAndLoss indicating to purpose is to calculate the profit and loss based on cost price.
public class ProfitAndLoss
{
	public static void main(String args[])
	{	
		//Create a integer vairable name with costPrice, sellingPrice and assign the value 129, 191.
		int costPrice = 129, sellingPrice = 191;

		//Create a float variable name with profit and profitPercentage. Subtraction operator ( - ) , Multiplication operator ( * ) , Division Operator ( / ).
		//First : We will calculate Profit using subtration operator.
		//Second : We will calculate ProfitPercentage by dividing profit by costPrice and then multiply by 100 .
		float profit = sellingPrice - costPrice;

		float profitPercentage = ( profit / costPrice ) * 100;

		//Print the profit and profitPercentage.
		System.out.println("The Cost Price is INR " + costPrice + "  and Selling Price is INR " + sellingPrice +
				   " \nThe Profit is INR " + profit + " and the Profit Percentage is " + profitPercentage);
	}
}
	
