package com.artifyapplication;

public class DigitalArt extends Artwork 
{	protected int walletBalance;
	protected int paymentDetails;
	
	public DigitalArt( String title, String artist, int price  ) 
	{	super( title, artist, price  );
	}
	
	/*
	public DigitalArt( int paymentDetials )
	{	super( paymentDetials );
	}
	*/
	
	@Override 
	public void purchase()
	{	System.out.println("  Title  : The Merge ");
		System.out.println("  Artist : Pak " );
		System.out.println("  Price  : 15000000 ");
		System.out.println();
		System.out.println("-----------------------------------------");
		if ( getPaymentDetails() == price )
		{	System.out.println("  Please wait... ");
			System.out.println("  Successfully purchased... ");
			System.out.println();
			System.out.println("-----------------------------------------");
			
		}
		else 
		{	System.out.println("  Please wait... ");
			System.out.println("  Not purchased... ");
			System.out.println();
			System.out.println("-----------------------------------------");
			System.out.println();
		}
	}

	@Override
	public void license() 
	{	System.out.println(" Terms and Conditions ");
		System.out.println(" NFT Ownership: Usually certifies that \n  you own the original digital identifier, but \n  the artist generally retains the copyright \n  and intellectual property rights unless \n  explicitly stated.");
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println();
		System.out.println("  Thankyou for visiting Artify  ");
		System.out.println();
		System.out.println("=========================================");
	}

}
