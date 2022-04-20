package com.kostaroot.product;

import com.kostaroot.customerinfo.AgeRestriction;

import java.util.Date;

public class ElectonicsProduct extends Product{
    private Date guaranteePeriod;

    public ElectonicsProduct (String name, int quantity, double price, AgeRestriction ageRestriction,
                              Date guaranteePeriod){
        super(name, quantity, price, ageRestriction);
        this.guaranteePeriod = guaranteePeriod;
    }

    public Date getGuaranteePeriod(){
        return guaranteePeriod;
    }

    @Override
    public String toString() {
        return super.toString()+"\nGuaranted period:"+
                guaranteePeriod;
    }
}
