package com.tourmate;

public abstract class Trip implements IBookable 
{	private String destination;
	private int duration;
	private String source;
	private int payment;
	private String status;
	private int paymentA;
	
	protected Transport transportSource;
	protected Transport transportDestination;
	protected Hotel hotel;
	protected Activity activity;
	
	public Trip( String source, String destination, int duration, int payment ) 
	{	this.source = source;
		this.destination = destination;
		this.duration = duration;
		this.payment = payment;
	}
	public Trip( int paymentA)
	{	this.paymentA = paymentA;
	}
	
	public String getSource()
	{	return source;	
	}
	public String getDestination()
	{	return destination;	
	}
	public int getDuration()
	{	return duration;	
	}
	public int  getPaymentDetails()
	{	return paymentA;
	}
	public void setPayment(int payment) 
	{    this.paymentA = payment;
	}
	
	public void setSource( String source)
	{	this.source = source;
	}
	
	public String getStatus()
	{	return status;
	}
	public void setStatus(String status) 
	{    this.status = status;
	}
		
	public void book()
	{	
		
	}
	
	public void cancel()
	{	
	}
	
	public void setTransort( Transport sourceT, Transport destinationT )
	{	this.transportSource = sourceT;
		this.transportDestination = destinationT;
	}
	
	
	public void setHotel( Hotel touristH)
	{	this.hotel = touristH;	
	}
	
	
	public void setActivity( Activity touristA )
	{	this.activity = touristA;
	}
	
	public int calculateTotalBudget()
	{	int total = 0;
    	if (transportSource != null) total += transportSource.getTransportPrice();
    	if (transportDestination != null) total += transportDestination.getTransportPrice();
    	if (hotel != null) total += hotel.getHotelPrice();
    	if (activity != null) total += activity.getActivityPrice();
    	return total;
		
	}
	
}
