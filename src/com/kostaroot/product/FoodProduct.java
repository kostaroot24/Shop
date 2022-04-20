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
}
