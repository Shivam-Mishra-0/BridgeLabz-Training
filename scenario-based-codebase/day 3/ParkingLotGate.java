/*	Parking Lot Gate System 🚗
	Develop a smart parking system.
	● Options: Park, Exit, Show Occupancy
	● Use switch-case for the menu.
	● while loop to continue until the parking lot is full or the user exits.   */

import java.util.*;

public class ParkingLotGate
{   static int park = 0;
	static int total = 5;
		
	public static int availableParkingLot( String options )
    {	
		switch ( options )
		{	
			case "Park" :
				if ( total > 0 )
				{	park++;
					total--;
					System.out.println( "The number of parked lot : " + park );
					
					if (total == 0) 
					{   System.out.println("\n!!! PARKING FULL !!!");
						System.out.println("The system will now close automatically.");
						System.exit(0); 
                    }
				}
				break;
			case "Quit" :
				if ( park > 0 )
				{	park--;
					total++;
					System.out.println( "You are exited...." );
				}
				else
				{	System.out.println( "No vehicle is parked..." );
				}
				break;
			case "Show Occupancy" :	
				System.out.println( "The number of available lots : " + total );
				System.out.println( "The number of parked lots : " + park );
			
				break;
			default :
				System.out.println( "Enter the valid option... " );
				break;
			
		}
        return total;

    }
    public static void main( String args[] )
    {	Scanner input = new Scanner( System.in );
		System.out.println( "---# Welcome to Shivam's Parking Lot #---");
		while ( true )
		{	System.out.println( "Enter the options ( Park, Quit, Show Occupancy ) : ");
			String options = input.nextLine();
			
			availableParkingLot(options);
			
			if ( options.equals("Exit") )
			{	System.out.println ("Lots are not Available...");
				break;
			}
		}

    }

}