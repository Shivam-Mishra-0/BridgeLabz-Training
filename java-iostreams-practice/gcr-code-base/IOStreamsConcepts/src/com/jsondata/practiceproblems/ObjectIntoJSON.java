package com.jsondatahandling.practiceproblems;

import com.fasterxml.jackson.databind.ObjectMapper;

class Car{
	 
	public String brand;
	public int number;
	public double price;
	
	public Car(String brand, int number, double price) {
		this.brand = brand;
		this.number = number;
		this.price = price;
	}
}
public class ObjectIntoJSON {

	public static void main(String[] args) {
		try {
			
			Car c1 = new Car("BMW", 23456, 150000);
			ObjectMapper objectMapper = new ObjectMapper();
			
			String jsonString = objectMapper.writeValueAsString(c1);
			
		    System.out.println(jsonString);
		}catch(Exception e) {
			e.printStackTrace();
		}	
	}

}
