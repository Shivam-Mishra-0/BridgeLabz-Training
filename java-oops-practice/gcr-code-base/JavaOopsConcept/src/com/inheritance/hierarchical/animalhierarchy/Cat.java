package com.inheritance.hierarchical.animalhierarchy;

public class Cat extends Animal {

    // Constructor to initialize cat
    public Cat(String name, int age) {
        super(name, age);
    }

    // Overridden method with cat-specific behavior
    @Override
    public void makeSound() {
    	System.out.println("+============================+");
    	System.out.print("| ");
        System.out.print(name + " says: Meow Meow   ");
        System.out.println("\033[A\033[5C|");
    }
}
