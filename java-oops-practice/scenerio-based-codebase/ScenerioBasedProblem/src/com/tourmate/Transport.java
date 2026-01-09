package com.tourmate;

public class Transport 
{	private String transportSource;
	private String transportDestination;
	protected int transportPrice;
	
	public Transport( String transportDestination, String transportSource, int transportPrice ) 
	{	this.transportSource = transportSource;
		this.transportDestination = transportDestination;
		this.transportPrice = transportPrice;
	}	
	
	public int getTransportPrice()
	{	return transportPrice;
	}
	
}
