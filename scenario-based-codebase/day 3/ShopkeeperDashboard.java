/*  8. Shopkeeper’s Discount Dashboard 🛍️
	A shopkeeper gives discounts based on total bill:
	● Input item prices in a for-loop.
	● Use if-else for discount logic.
	● Use proper indentation, constants, and comments.  */


import java.util.*;


public class ShopkeeperDashboard 
{   
	
	public static void main(String[] args) 
	{   String shopName = "The Anime House";
		Scanner input = new Scanner( System.in );
		String[] manga = { "Attack on Titan", "Death Note", "Hell Paradise", "Naruto: Shippuden", "A Silent Voice", "One Piece", "My Hero Academia", "Jujutsu Kaisen" };
        double[] prices = { 4.99, 3.50, 4.25, 5.99, 3.98, 3.59, 4.09, 3.99};
		int[] quantities = new int[prices.length];
		// Header
        System.out.println("+------+----------------------+------------+");
        System.out.printf("|          %-31s |%n", shopName);
        System.out.println("+------+----------------------+------------+");

        // Column Headers
        // The pipe characters are placed exactly where you want the borders
        System.out.printf("| %-4s | %-20s | %-10s |%n", "S.N.", "ITEM NAME", "PRICE");
        System.out.println("+------+----------------------+------------+");

		for (int i = 0; i < prices.length; i++ )
		{	System.out.printf("| %-4d | %-20s | $%-9.2f |%n", i + 1, manga[i], prices[i]);
		}
		System.out.println("+------+----------------------+------------+");
		System.out.println("\n");
		double grandTotal = 0.0;
		
		while( true )	
		{	System.out.print("Enter number to pick quantity of that manga : ");
			int number = input.nextInt();
			if ( number == 0 )
			{	break;
			}
			
			switch ( number )
			{	case 1 -> 	{	System.out.print("Enter the quantity for " + manga[0]+ "-");
								int quantity = input.nextInt();
								quantities[0]+=quantity;
								grandTotal  += ( prices[0] * quantity);
								System.out.println("\n");
							}
				case 2 ->   {	System.out.print("Enter the quantity for " + manga[1]+ "-");
								int quantity = input.nextInt();
								quantities[1]+=quantity;
								grandTotal  += ( prices[1] * quantity);
								System.out.println("\n");
							}
				case 3 -> 	{	System.out.print("Enter the quantity for " + manga[2]+ "-");
								int quantity = input.nextInt();
								quantities[2]+=quantity;
								grandTotal  += ( prices[2] * quantity);
								System.out.println("\n");
							}
				case 4 ->   {	System.out.print("Enter the quantity for " + manga[3]+ "-");
								int quantity = input.nextInt();
								quantities[3]+=quantity;
								grandTotal  += ( prices[3] * quantity);
								System.out.println("\n");
							}
				case 5 -> 	{	System.out.print("Enter the quantity for " + manga[4]+ "-");
								int quantity = input.nextInt();
								quantities[4]+=quantity;
								grandTotal  += ( prices[4] * quantity);
								System.out.println("\n");
							}
				case 6 -> 	{	System.out.print("Enter the quantity for " + manga[5]+ "-");
								int quantity = input.nextInt();
								quantities[5]+=quantity;
								grandTotal  += ( prices[5] * quantity);
								System.out.println("\n");
							}
				case 7 ->   {	System.out.print("Enter the quantity for " + manga[6]+ "-");
								int quantity = input.nextInt();
								quantities[6]+=quantity;
								grandTotal  += ( prices[6] * quantity);
								System.out.println("\n");
							}
				case 8 -> 	{	System.out.print("Enter the quantity for " + manga[7]+ "-");
								int quantity = input.nextInt();
								quantities[7]+=quantity;
								grandTotal  += ( prices[7] * quantity);
								System.out.println("\n");
							}
							
				default ->  {	System.out.println( "Invalid Selection! " );
							break;
							}
			}	
		}
		
		System.out.println( "\n\n+------+----------------------+------------+------------+------------+" );
		System.out.printf("|       %-60s |%n", "FINAL BILLING");
        System.out.println("+------+----------------------+------------+------------+------------+");
		System.out.printf("| %-4s | %-20s | %-10s | %-10s | %-10s |%n", "S.N.", "ITEM", "PRICE", "QTY", "TOTAL");
		System.out.println("+------+----------------------+------------+------------+------------+");
		
		int billLine = 1;
		for ( int i = 0; i < prices.length; i++ )
		{	if ( quantities[i] > 0 )
			{	System.out.printf("| %-4d | %-20s | $%-9.2f | %-10d | $%-9.2f |%n", 
                                  billLine++, manga[i], prices[i], quantities[i], grandTotal);
			}
		}
		System.out.println( "+------+----------------------+------------+------------+------------+" );
		System.out.printf("Grand Total: $%.2f%n", grandTotal);
		if ( grandTotal >= 2000 ) 
			System.out.printf("Discounted Total (20%% off): $%.2f%n", grandTotal * 0.8);

		input.close();
		
    }
}