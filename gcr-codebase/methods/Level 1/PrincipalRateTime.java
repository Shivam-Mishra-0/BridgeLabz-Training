//Creating a class name with PrincipalRateTime indicating to purpose is to calculate Simple  Interest.
import java.util.Scanner;
public class PrincipalRateTime
{	public static double calculateSimpleInterest(double principal, double rate, double time)
	{	double simpleInterest = ( principal * rate * time ) / 100;
		return simpleInterest;
	}
		
	public static void main(String args[])
	{	double principal, rate, time, simpleInterest;	
		
		Scanner input = new Scanner(System.in);
		System.out.println("Enter a Principal : "); 
        	principal = input.nextDouble();
		System.out.println("Enter a Rate : "); 
        	rate = input.nextDouble();
		System.out.println("Enter a Time : "); 
        	time = input.nextDouble();
        	simpleInterest = PrincipalRateTime.calculateSimpleInterest(principal, rate, time);
		
		System.out.println( "The Simple Interest is " + simpleInterest + " for Principal " + principal + ", Rate of Interest " + rate + " and Time " + time + "." );
		input.close();
	}
}

 







				

