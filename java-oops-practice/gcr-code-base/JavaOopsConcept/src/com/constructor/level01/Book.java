package com.constructor.level01;

public class Book 
{	String title;
	String author;
	int price;

	public Book()
	{	title = "Leadership Wisdom";
		author = "Robin Sharma";
		price = 499;
	}
	public Book(String title, String author, int price)
	{	this.title = title ;
		this.author = author;
		this.price = price;
	}
	public void displayBookDetails()
	{	System.out.println("The title of the Book is " + title);
		System.out.println("The author of the Book is " + author);
		System.out.println("The price of the Book is " + price);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book book1 = new Book();
		System.out.println("The details of book 1 : ");
		book1.displayBookDetails();
		
		System.out.println();
		
		System.out.println("The details of book 2 : ");
		Book book2 = new Book("Family Wisdom", "Robin Sharma", 699);
		book2.displayBookDetails();
	}

}
