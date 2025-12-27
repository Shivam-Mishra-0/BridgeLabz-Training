package com.constructor.level01;
import java.util.*;
public class Circle 
{	double radius;

	public Circle() 
	{	this(1.0);
	}
	public Circle(double radius)
	{	this.radius = radius;
	}
	public void displayRadiusOfCircle()
	{	System.out.println("The radius of a circle is " + radius);
	}

	public static void main(String[] args) 
	{	Circle circle1 = new Circle();
		circle1.displayRadiusOfCircle();
		Scanner input = new Scanner(System.in);
		double radius = input.nextDouble();
		Circle circle2 = new Circle(radius);
		circle2.displayRadiusOfCircle();
		
	}

}
