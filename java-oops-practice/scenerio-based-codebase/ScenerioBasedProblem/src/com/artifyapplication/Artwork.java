package com.artifyapplication;

public abstract class Artwork implements IPurchasable 
{	private String title;
	private String artist;
	protected int price;
	protected int paymentDetails;
	protected int payment;
	protected String licenseType;
	
	
	protected User buyer;
	
	public Artwork( String title, String artisit, int price ) 
	{	this.title = title;
		this.artist = artist;
		this.price = price;
	}
	public Artwork( int payment )
	{	this.paymentDetails = payment;
	}
	
	public void setUser(User user) {
        this.buyer = user;
    }
	
	public int getPaymentDetails()
	{	return payment;
	} 
	
	public int calculateNewBalance() {
        if (buyer != null) {
            return buyer.getWalletBalance() - price;
        }
        return 0;
    }
	
	/* public String getTitle()
	{	return title;
	}
	public String getArtist()
	{	return artist;
	}
	*/ 
	
	public void purchase()
	{
		
	}
	
	public void license()
	{
		
	}
	public void setPaymentDetails(int payment) 
	{	this.paymentDetails = payment;
	}
	
	
	
	protected int walletBalance;
	public int getWalletBalance()
	{	return walletBalance;
	}
	
	protected User userName;
	protected User userWalletBalance;
	protected int balance;
	
	public void setUser( User userName, User userWalletBalance )
	{	this.userName = userName;
		this.userWalletBalance = userWalletBalance;
	}
	
	public void userBalance()
	{	balance = 0;
		balance = getWalletBalance() - getPaymentDetails();
	}
	
}
