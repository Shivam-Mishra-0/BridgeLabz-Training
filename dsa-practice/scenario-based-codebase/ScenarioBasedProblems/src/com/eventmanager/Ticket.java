
package com.eventmanager;

public class Ticket {
    private int price;

    public Ticket(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "₹" + price;
    }
}
