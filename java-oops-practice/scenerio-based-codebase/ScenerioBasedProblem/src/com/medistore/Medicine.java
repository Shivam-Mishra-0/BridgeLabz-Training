package com.medistore;

public class Medicine 
{	private String name;
	private double price;
	private int expiryDate;
	private int quantity;
	
	public Medicine( String name, double price, int expiryDate ) 
	{	this.name = name;
		this.price = price;
		this.expiryDate = expiryDate;
		this.quantity = 10;
	}
	
	public String getName()
	{	return name;		
	}
	public double getPrice()
	{	return price;		
	}
	public void setQuantity( int quantity)
	{	this.quantity = quantity;
	}
	public int getExpiryDate()
	{	return expiryDate;		
	}
	
	public void sell()
	{	
		
	}
	public void checkExpiry()
	{
		
	}
}
