package com.inheritance.hierarchical.animalhierarchy;

public class Bird extends Animal {

    // Constructor to initialize bird
    public Bird(String name, int age) {
        super(name, age);
    }

    // Overridden method with bird-specific behavior
    public void makeSound() {
    	System.out.println("+============================+");
    	System.out.print("| ");
        System.out.print(name + " says: Chirp Chirp   ");
        System.out.println("\033[C\033[2C|");
        System.out.println("+============================+");
    }
}
