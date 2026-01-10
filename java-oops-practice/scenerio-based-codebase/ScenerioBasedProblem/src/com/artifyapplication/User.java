package com.artifyapplication;

public class User 
{	protected String name;
	protected int walletBalance;
	
	public User( String name, int walletBalance ) 
	{	this.name = name;
		this.walletBalance = walletBalance;
	}
	
	public String getName()
	{	return name;
	}
	/*
	public void setWalletBalance( int walletBalance )
	{	this.walletBalance = walletBalance;
	}
	*/
	public int getWalletBalance()
	{	return walletBalance;
	}
	
	

}
