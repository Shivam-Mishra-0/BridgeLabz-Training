//Creating a class name with YoungestTallestFriend indicating to purpose is to find the age of three friends with their ages and heights.
import java.util.Scanner;
public class YoungestTallestFriend
{	public static void main(String args[])
	{	//Create a int vairable name with amarAge, amarHeight, akbarAge, akbarHeight, anthonyAge, anthonyHeight.
		int amarAge, amarHeight, akbarAge, akbarHeight, anthonyAge, anthonyHeight;

		//Create Scanner object to take user input.
		Scanner input = new Scanner(System.in);
		//Take user input as salary and year.
		System.out.println("Enter the amarAge :");
		amarAge = input.nextInt();
		System.out.println("Enter the amarHeight :");
		amarHeight = input.nextInt();
		System.out.println("Enter the akbarAge :");
		akbarAge = input.nextInt();
		System.out.println("Enter the akbarHeight :");
		akbarHeight = input.nextInt();
		System.out.println("Enter the anthonyAge :");
		anthonyAge = input.nextInt();
		System.out.println("Enter the anthonyHeight :");
		anthonyHeight = input.nextInt();
		//Find the smallest of the 3 ages
		if ( amarAge < akbarAge && amarAge < anthonyAge )
		{	//print amarAge.
			System.out.println("Amar is youngest");
		}
		else if ( akbarAge < amarAge && akbarAge < anthonyAge )
		{	//print akbarAge.
			System.out.println("Akbar is youngest");
		}
		else 
		{ 	//print anthonyAge.
			System.out.println("Anthony is youngest");		
		}
		//Find the largest of the 3 heights
		if ( amarHeight > akbarHeight && amarHeight > anthonyHeight )
		{	//print amarHeight.
			System.out.println("Amar is tallest");
		}
		else if ( akbarHeight > amarHeight && akbarHeight > anthonyHeight )
		{	//print akbarHeight.
			System.out.println("Akbar is tallest");
		}
		else 
		{ 	//print anthonyHeight.
			System.out.println("Anthony is tallest");		
		}

		input.close();
	}
}
				

