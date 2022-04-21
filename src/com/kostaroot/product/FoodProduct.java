package com.kostaroot.product;

import com.kostaroot.customerinfo.AgeRestriction;

import java.util.Date;

public class FoodProduct extends Product implements Expirable{
    private Date expiredDate;


    public FoodProduct(String name, int quatity, double price, AgeRestriction ageRestriction,
                       Date expiredDate){
        super(name,quatity,price,ageRestriction);
        this.expiredDate = expiredDate;
    }

    @Override
    public Date getExpirationDate() {
        return expiredDate;
    }

    @Override
    public String toString() {
        return super.toString()+
                "ExpiredDate:" + expiredDate;
    }

    @Override
    public double getPrice() {
        if(expiredDate.getTime()-System.currentTimeMillis() < 15 * DAILYMILSEC) {
            return super.getPrice() * 0.75;
        }else {
            return super.getPrice();
        }
    }
}
