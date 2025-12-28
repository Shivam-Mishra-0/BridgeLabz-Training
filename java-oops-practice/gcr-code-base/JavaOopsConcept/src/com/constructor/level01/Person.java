package com.constructor.level01;

public class Person 
{	String name;
	int age;

	public Person() 
	{	name = "Shivam";
		age = 22;		
	}
	public Person(String name, int age)
	{	this.name = name;
		this.age = age;
	}
	public Person(Person previousPerson )
	{	this.name = previousPerson.name;
		this.age = previousPerson.age;
	}
	public void displayPersonDetails()
	{	System.out.println("The name of the person is " + name
						+  "\nAge is " + age);
	}

public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person person1 = new Person();
		System.out.println("The details of person1 : ");
		person1.displayPersonDetails();
		
		System.out.println();
		Person person2 = new Person("Ashish", 20);
		System.out.println("The details of person2 : ");
		person2.displayPersonDetails();
		
		System.out.println();
		Person person3 = new Person(person2);
		System.out.println("The details of person3 : ");
		person3.displayPersonDetails();
	}

}
