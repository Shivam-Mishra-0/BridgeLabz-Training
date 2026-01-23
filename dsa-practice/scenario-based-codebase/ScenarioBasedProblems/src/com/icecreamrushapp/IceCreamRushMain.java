package com.icecreamrushapp;

public class IceCreamRushMain {
	public static void main(String[] args) {
        System.out.println("================ IceCreamRush ====================\n");

        // Added example ice creams
        // 8 flavors with unsorted weekly sales data
        IceCreamFlavor[] flavors = {
            new IceCreamFlavor("Strawberry",    100),
            new IceCreamFlavor("Paan",          45),
            new IceCreamFlavor("Vanilla",       150),
            new IceCreamFlavor("Kulfi",         90),
            new IceCreamFlavor("Chocolate",     140),
            new IceCreamFlavor("Butterscotch",  80),
            new IceCreamFlavor("Mango",         120),
            new IceCreamFlavor("Pistachio",     60)
        };

        // Print initial unsorted data
        BubbleSort.printPopularity(flavors, "Unsorted Weekly Sales");

        // Bubble Sort (DESC by sales)
        BubbleSort.bubbleSort(flavors);

        // Print final ranked popularity
        BubbleSort.printPopularity(flavors, "Popularity Ranking (Most Popular First)");
        System.out.println("============== Thanks for using ==============\n");
    }

}
