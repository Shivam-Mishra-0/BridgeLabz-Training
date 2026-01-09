package com.tourmate;

public class Activity 
{	private String activity;
	protected int activityPrice;

	public Activity( String activity, int activityPrice ) 
	{	this.activity = activity;
		this.activityPrice = activityPrice;
	}
	
	public int getActivityPrice()
	{	return activityPrice;	
	}
}

