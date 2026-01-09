package com.medistore;

public class Injection extends Medicine 
{	public Injection( String name, double price, int expiryDate) 
	{	/*this.name = name;
		this.price = price;
		this.expiryDate = expiryDate;*/
		super( name, price, expiryDate);
	}
	
	@Override
	public void sell()
	{	System.out.println("+=====================================+");
		System.out.println("              INVOICE                  ");
		System.out.println("---------------------------------------");
		
		System.out.println("   Injection Name : " + getName());	
		System.out.println("   Price of Injection : " + getPrice());
		
		System.out.println("---------------------------------------");
	}
	
	@Override
	public void checkExpiry()
	{	System.out.println(" Checking the Injection Expiring Date.....");
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
