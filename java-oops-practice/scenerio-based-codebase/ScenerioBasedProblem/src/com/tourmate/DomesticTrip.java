package com.tourmate;

public class DomesticTrip extends Trip
{
	public DomesticTrip( String source, String destination, int duration, int payment )
	{	super ( source, destination, duration, payment );
	}
	
	
	
	@Override
	public void book()
	{	System.out.println("+===========================================+");
		System.out.println("        Welcome to Domestic Airline          ");
		System.out.println("|-------------------------------------------|");
		System.out.println();
		System.out.println("    Source      : "  + getSource());
		System.out.println("    Destination : "  + getDestination());
		System.out.println();
		System.out.println("|-------------------------------------------|");
		System.out.println();
		
		if ( calculateTotalBudget() == getPaymentDetails())
		{	System.out.println("    Your ticket is Booked.....");		
		}
		else
		{	System.out.println("    Sorry, Your ticket is not Booked.  ");		
		}
		System.out.println();
		System.out.println("|-------------------------------------------|");
		System.out.println();
		System.out.println("  Thankyou for visiting Domestic Airline ");
		System.out.println();
		System.out.println("+===========================================+");
	}

	@Override
	public void cancel()
	{	System.out.println("+===========================================+");
		System.out.println("        Welcome to Domestic Airline          ");
		System.out.println("|-------------------------------------------|");
		System.out.println();
		System.out.println("    Source      : "  + getSource());
		System.out.println("    Destination : "  + getDestination());
		System.out.println();
		System.out.println("|-------------------------------------------|");
		System.out.println();
		if ( getStatus().equalsIgnoreCase("cancel") )
		{	System.out.println("  Your Ticket is successfully cancelled  ");
		}
		else
		{	System.out.println("  Your Ticket is not cancelled  ");	
		}
		System.out.println();
		System.out.println("|-------------------------------------------|");
		System.out.println();
		System.out.println("  Thankyou for visiting Domestic Airline ");
		System.out.println();
		System.out.println("+===========================================+");
	}
	
	
	
}
