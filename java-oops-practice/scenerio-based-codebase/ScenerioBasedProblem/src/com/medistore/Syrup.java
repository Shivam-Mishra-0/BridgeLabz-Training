package com.medistore;

public class Syrup extends Medicine
{	public Syrup ( String name, double price, int expiryDate ) 
	{	super( name, price, expiryDate);
	}
	
	@Override
	public void sell()
	{	System.out.println("+=====================================+");
		System.out.println("              INVOICE                  ");
		System.out.println("---------------------------------------");
		
		System.out.println("   Syrup Name : " + getName());
		System.out.println("   Price of Syrup : " + getPrice());
		
		System.out.println("---------------------------------------");
	}
	
	@Override
	public void checkExpiry()
	{	System.out.println(" Checking the Syrup Expiring Date.....");
		if ( getExpiryDate() < 2025 )
		{	System.out.println( "  " + getName() + " is Expired...");			
		}
		else
		{	System.out.println( "  " + getName() + " is not Expired...");
		}
		
		System.out.println("+=====================================+");
		System.out.println("            Thanking You               ");
		System.out.println("=======================================");
	}
}
