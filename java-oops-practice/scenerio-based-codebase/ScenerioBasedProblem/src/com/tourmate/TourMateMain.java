package com.tourmate;

import java.util.*;

public class TourMateMain 
{
	public static void main(String[] args) 
	{	Scanner input = new Scanner( System.in );

		System.out.print(" International Ticket/Domestic Ticket ");
		String type = input.nextLine();
		System.out.println();
		System.out.print(" Enter Source : ");
		String source = input.nextLine();
		System.out.println();
		System.out.print(" Enter Destination : ");
		String destination = input.nextLine();
		System.out.println();
		System.out.print(" Enter the Duration : ");
		int duration = input.nextInt();
		System.out.println();
		
		System.out.print(" Enter Transport Cost : ");
		int transportCost = input.nextInt();
		System.out.println();
		Transport transport = new Transport(source, destination, transportCost);
		
		System.out.print(" Enter Hotel Name : ");
		String hotelName = input.nextLine();
		System.out.println();
		input.nextLine();
		System.out.print(" Enter Hotel Cost : ");
		int hotelCost = input.nextInt();
		System.out.println();
		Hotel hotel = new Hotel( hotelName, hotelCost );
		
		System.out.print(" Enter Activity Name : ");
		String activityName = input.nextLine();
		System.out.println();
		input.nextLine();
		System.out.print(" Enter Activity Cost : ");
		int activityCost = input.nextInt();
		System.out.println();
		Activity activity = new Activity ( activityName, activityCost );
		input.nextLine();
		System.out.print(" Enter the Book/Cancel : ");
		String status = input.nextLine();
		System.out.println();
		
		Trip trip = null;
		
		if ( type.equalsIgnoreCase("International")) 
		{	trip = new InternationalTrip( source, destination, duration, 0 );
		}
		else
		{	trip = new DomesticTrip( source, destination, duration, 0 );
		}
		
		trip.setTransort(transport, transport);
		trip.setHotel(hotel);
		trip.setActivity(activity);
		
		int totalRequired = trip.calculateTotalBudget();
		System.out.println("\nTotal Package Cost: " + totalRequired);
		
		System.out.print("Enter Payment Amount: ");
        int paymentA = input.nextInt();
        
        if ( type.equalsIgnoreCase("International")) 
		{	trip = new InternationalTrip( source, destination, duration, paymentA );
		}
		else
		{	trip = new DomesticTrip( source, destination, duration, paymentA );
		}
        
        trip.setStatus(status);
        
        if (status.equalsIgnoreCase("Book")) {
            trip.book();
        } else {
            trip.cancel();
        }

	}

}
