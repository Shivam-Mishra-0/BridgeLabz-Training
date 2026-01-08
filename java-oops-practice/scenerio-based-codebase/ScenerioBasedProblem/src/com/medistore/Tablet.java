package com.medistore;

public class Tablet extends Medicine 
{	public Tablet( String name, double price, int expiryDate) {
		super( name, price, expiryDate );
	}
	
	@Override
	public void sell()
	{	System.out.println("+=====================================+");
		System.out.println("              INVOICE                  ");
		System.out.println("---------------------------------------");
		
		System.out.println("   Tablet Name : " + getName());
		System.out.println("   Price of Tablet : " + getPrice());
		
		System.out.println("---------------------------------------");
	}
	
	@Override
	public void checkExpiry()
	{	System.out.println(" Checking the Tablet Expiring Date.....");
		if ( getExpiryDate() > 2025 )
		{	System.out.println( "  " + getName() + " is Expired...");			
		}
		else
		{	System.out.println( "  " + getName() + "is safe to consume...");
		}
		System.out.println("+=====================================+");
		System.out.println("            Thanking You               ");
		System.out.println("=======================================");
	}

}
