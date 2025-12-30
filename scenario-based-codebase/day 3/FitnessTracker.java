/*
Sandeep’s Fitness Challenge Tracker 🏋️
♂Each day Sandeep completes a number of push-ups.
● Store counts for a week.
● Use for-each to calculate total and average.
● Use continue to skip rest days.
*/

import java.util.*;

public class FitnessTracker{
	
	public static int totalPushUpCount(int pushUp[]){
		int total = 0;
		for(int i: pushUp)
			total+=i;
		return total;
	}
	
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		
		int pushUp[] = new int[6];
		System.out.println("Enter Sandeep 6 days push-ups ");
		
		for(int i=1;i<=7;i++){
			if(i==7)
				continue;
			System.out.print("Enter Day "+ i +" Number of Push-ups: ");
			pushUp[i-1] = sc.nextInt();
		}
		int total = totalPushUpCount(pushUp);
		
		System.out.println("\n\t=================================");
		System.out.println("\tTotal number of push-ups: "+total);
		System.out.println("\tAverage push-ups: "+ (total/pushUp.length));
	    System.out.println("\t===================================");
	}
}