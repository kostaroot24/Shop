package com.kostaroot.product;

import com.kostaroot.customerinfo.AgeRestriction;

import java.util.Date;

public class Appliance extends ElectonicsProduct{
    public Appliance (String name, int quantity, double price, AgeRestriction ageRestriction){
        super(name,quantity,price,ageRestriction,
                new Date(System.currentTimeMillis()+ 182 * Product.DAILYMILSEC));
    }

    @Override
    public double getPrice() {
        if(this.getQuantity()> 50)
            return super.getPrice();
        return super.getPrice() * 1.05;
    }
}
