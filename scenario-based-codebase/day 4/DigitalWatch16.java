/*
16. Digital Watch Simulation ⏱️
Simulate a 24-hour watch:
● Print hours and minutes in a nested for-loop.
● Use a break to stop at 13:00 manually (simulate power cut).
Core Java Scenario Based Problem Statements.
*/

import java.util.*;

public class DigitalWatch16
{	public static void main( String args[] )
	{	System.out.println( "+==================================+" );
		System.out.println( "|          DIGITAL  WATCH          |" );
		System.out.println( "+==================================+" );
	
		for ( int i = 0; i < 24; i++ )
		{	if ( i == 13 )
				{	System.out.println( "+==================================+" );
					System.out.println( "|                                  |" );
					System.out.println( "|     ** =****PowerCut****= **     |" );
					System.out.println( "|                                  |" );
					System.out.println( "+==================================+" );
					break;
				}
			for ( int j = 0; j < 60; j++ )
			{	System.out.println( "|  " + i + " Hours : " + j + " minutes" );
				System.out.println("\033[A\033[35C|");
			}
		}
	}
} 
