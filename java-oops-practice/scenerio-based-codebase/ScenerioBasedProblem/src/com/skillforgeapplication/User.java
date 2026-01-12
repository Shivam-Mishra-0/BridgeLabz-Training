
package com.skillforgeapplication;

// Base class for all users
public abstract class User {

	protected String name;

	public User(String name) {
		this.name = name;
	}

	public abstract void printDetails();
}
