package com.kostaroot.product;

import com.kostaroot.customerinfo.AgeRestriction;

import java.util.Date;

public class Computer extends ElectonicsProduct {

    public Computer (String name, int quantity, double price, AgeRestriction ageRestriction){
        super(name,quantity,price,ageRestriction,
                new Date(System.currentTimeMillis()+ 365 * Product.DAILYMILSEC));
    }

    @Override
    public double getPrice() {
        if ( this.getQuantity() < 1000 )
            return super.getPrice();
        return super.getPrice() * 0.95;
    }
}
