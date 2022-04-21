package com.kostaroot.product;

import com.kostaroot.customerinfo.AgeRestriction;

public class Product implements Buyable {
    private final String name;
    private int quantity;
    private double price;
    private AgeRestriction ageRestriction;
    protected static final long DAILYMILSEC = 84600 * 1000;

    public Product( String name, int quantity, double price, AgeRestriction ageRestriction){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.ageRestriction = ageRestriction;
    }

    public AgeRestriction getAgeRestriction() {
        return ageRestriction;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Product: " + name + "\n" +
                "quantity: " + quantity +
                "\nprice per one: " + price +
                "\nageRestriction: " + ageRestriction;
    }
}
