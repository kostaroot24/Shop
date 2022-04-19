package com.kostaroot.product;

import com.kostaroot.customerinfo.AgeRestriction;

public class Product implements Buyable {
    private final String name;
    private int quantity;
    private double price;
    private AgeRestriction ageRestriction;

    public Product( String name, int quantity, double price, AgeRestriction ageRestriction){
        this.name = name;
        this.quantity = quantity;
        this.price = price;
        this.ageRestriction = ageRestriction;
    }

    @Override
    public double getPrice() {
        return price;
    }
}
