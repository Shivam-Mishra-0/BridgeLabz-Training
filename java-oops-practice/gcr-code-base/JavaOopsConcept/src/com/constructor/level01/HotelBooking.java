package com.constructor.level01;

public class HotelBooking 
{	String guestName;
	String roomType;
	int nights;

	public HotelBooking() 
	{	guestName = "Divyansh Pandey";
		roomType = "Air Conditionar";
		nights = 2;
	}
	public HotelBooking(String guestName, String roomType, int nights)
	{	this.guestName = guestName;
		this.roomType = roomType;
		this.nights = nights;
	}
	public HotelBooking(HotelBooking previousHotelBooking)
	{	this.guestName = previousHotelBooking.guestName;
		this.roomType = previousHotelBooking.roomType;
		this.nights = previousHotelBooking.nights;
	}
	public void displayHotelBookingSystem()
	{	System.out.println("The name of a person who wants to stay : " + guestName
						+ "\nWhich room type do you prefer ? " + roomType
						+ "\nNights to stay : " + nights);	
	}
	
	public static void main(String[] args) 
	{	HotelBooking order1 = new HotelBooking();
		System.out.println("The details of guest1 : ");
		order1.displayHotelBookingSystem();
		
		System.out.println();
		HotelBooking order2 = new HotelBooking("Abhishake", "Non-Air Conditionar", 4);
		System.out.println("The details of guest2 : ");
		order2.displayHotelBookingSystem();
		
		System.out.println();
		HotelBooking order3 = new HotelBooking(order2);
		System.out.println("The details of guest3 : ");
		order3.displayHotelBookingSystem();
	}

}
