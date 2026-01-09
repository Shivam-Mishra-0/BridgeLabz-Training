package com.medistore;

import java.util.*;

public class MediStoreMain {

	public static void main(String[] args) 
	{	String name;
		Scanner input = new Scanner( System.in );
		
		System.out.println("Enter the type of the medicine : ");
		String type = input.nextLine();
		if ( type.equals("Tablet") || type.equals("tablet") ) 
		{	System.out.println("Enter the name of the Tablet : ");
			name = input.nextLine();
		}
		else if ( type.equals("Syrup") || type.equals("syrup") )
		{	System.out.println("Enter the name of the Syrup : ");
			name = input.nextLine();			
		}
		else
		{	System.out.println("Enter the name of the Injection : ");
			name = input.nextLine();	
		}
		
		System.out.println("Enter the name of the price : ");
		double price = input.nextDouble();
		System.out.println("Enter the name of the Expiration Date : ");
		int expiryDate = input.nextInt();
		
		Medicine medicine = null;
		
		if( type.equals("Tablet") )  medicine = new Tablet( name, price, expiryDate );
		else if ( type.equals("Syrup") || type.equals("syrup") )  medicine = new Syrup( name, price, expiryDate );
		else medicine = new Injection( name, price, expiryDate );
		
		medicine.sell();
		medicine.checkExpiry();
		
		input.close();
	}

}
