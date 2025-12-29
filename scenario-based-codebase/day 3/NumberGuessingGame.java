/*  The Number Guessing Game 🎲
    A game asks the player to guess a number between 1 and 100.
    Core Java Scenario Based Problem Statements
    ● Use do-while loop.
    ● Give hints like "Too high" or "Too low".
    ● Count attempts and exit after 5 wrong tries.  */


import java.util.*;
import java.util.Random;

public class NumberGuessingGame
{  	public static void main( String args[] )
	{	Scanner input = new Scanner( System.in );
		System.out.println("Hey Guys, Wants to play this game.....");
		System.out.println("You just have to guess the correct number in limited steps.");
		System.out.println("\n");
		int randomNumber = (int) (Math.random()*100)+1;
		int maxTurn = 5;
		int turn = 0;
		int number;
		
		do 
		{	System.out.println("Enter the number to guess : ");
			number = input.nextInt();
			turn++ ;
			if ( randomNumber < number )
			{	System.out.println("The number you guessed is too high....");
				System.out.println("   ----# Try Again #----   ");
			}
			else if ( randomNumber > number )
			{	System.out.println("The number you guessed is too low....");
				System.out.println("   ----# Try Again #----   ");
			}
			else 
			{	System.out.println("Great....");
				System.out.println("Yeaaaah, You guessed the right number.");
				break;
			}
		}
		while( maxTurn > turn );
		if ( number != randomNumber )
		{	System.out.println( "Ooohh, you guessed the wrong number. The number was " + number );	
			System.out.println( "---------GAME   OVER----------" );
			System.out.println( "--------# Better Luck Next Time #---------" );
		}
		input.close();
		
	}
}