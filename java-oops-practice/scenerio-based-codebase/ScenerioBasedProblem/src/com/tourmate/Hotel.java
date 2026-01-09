package com.tourmate;

public class Hotel 
{	private String hotel;
	protected int hotelPrice;

	public Hotel( String hotel, int hotelPrice ) 
	{	this.hotel = hotel;
		this.hotelPrice = hotelPrice;
	}
	
	public int getHotelPrice()
	{	return hotelPrice;
	}
}
