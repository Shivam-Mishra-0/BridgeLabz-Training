package com.inheritance.hierarchical.animalhierarchy;

public class Dog extends Animal {

    // Constructor to initialize dog
    public Dog(String name, int age) {
        super(name, age);
    }

    // Overridden method with dog-specific behavior
    @Override
    public void makeSound() {
    	System.out.println("+============================+");
    	System.out.print("| ");
        System.out.print(name + " says: Woof Woof      ");
        System.out.println("\033[A\033[5C|");
    }
}
