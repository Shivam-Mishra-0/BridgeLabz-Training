package com.artifyapplication;

import java.util.*;

public class ArtifyMain 
{
	public static void main(String[] args) 
	{	Scanner input = new Scanner ( System.in );
		
		System.out.println("=========================================");
		System.out.println();
		System.out.println("            Welcome to Artify            ");
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println();
		System.out.println("  Different Artwork : ");
		System.out.println("  1) Digital Art");
		System.out.println("  2) Print Art");
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println();		
		System.out.print("  Artwork : " );
		String types = input.nextLine();
		System.out.println();
		System.out.println("-----------------------------------------");
		System.out.println();
		System.out.println("  USER DETAILS ");		
		System.out.print("  Name : " );		
		String name = input.nextLine();
		System.out.println();			
		System.out.print("  Wallet Balance : " );
		int walletBalance = input.nextInt();
		System.out.println();
		input.nextLine();
		User user = new User( name, walletBalance );
		
		Artwork artwork ;
		
		if ( types.equalsIgnoreCase("Digital"))	artwork = new DigitalArt( "The Merge", "Pak", 15000000 );							
		else
		{	artwork = new PrintArt( "The Great Wave off Kanagawa", "Katsushika Hokusai", 16000000 );
			artwork.setUser(user);
		}
		artwork.setUser(user);
		//artwork.setUser(user, user);
		
		
		System.out.print(" Enter the amount: ");
		int payment = input.nextInt();
		
		artwork.setPaymentDetails( payment );
		artwork.purchase();
		//user.setWalletBalance(paymentDetails); 
		/*
		if ( types.equalsIgnoreCase("Digital"))	artwork = new DigitalArt( paymentDetails );
		else
		{	artwork = new PrintArt( paymentDetails );
		}
		*/
		
		artwork.license();
		input.close();	
	}
}
