package com.kostaroot;

import com.kostaroot.customerinfo.AgeRestriction;
import com.kostaroot.manager.ShopExeptions;
import com.kostaroot.product.Product;
import com.kostaroot.product.FoodProduct;
import com.kostaroot.manager.PurchaseManager;

import java.util.Date;

public class Main {
    public static void main(String [] args){
        System.out.println("Hi");
        Product product = new Product("Vodka",11,100.5, AgeRestriction.Adult);
        System.out.println(product.toString());
        FoodProduct foodProduct = new FoodProduct("Vodka",11,100.5, AgeRestriction.Adult,
                new Date((long)(System.currentTimeMillis()+16*24*3600000)) );
        System.out.println("Expired date: ");
        long delta = foodProduct.getExpirationDate().getTime() - new Date().getTime();

        System.out.println("Delta: "+delta / (3600*1000*24));

        try{
            PurchaseManager.processPurchase();
        }catch ( ShopExeptions e ){
            System.out.println(e.getMessage());
        }

        Product banana = new FoodProduct("Banana",10,100, AgeRestriction.None,
                new Date((long)(System.currentTimeMillis() + 10 * PurchaseManager.DAILYMSEC)));
        System.out.println("New price:" + banana.getPrice());
    }
}
