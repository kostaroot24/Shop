package com.kostaroot;

import com.kostaroot.customerinfo.AgeRestriction;
import com.kostaroot.customerinfo.Customer;
import com.kostaroot.manager.ShopExeptions;
import com.kostaroot.product.Appliance;
import com.kostaroot.product.Computer;
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

        Product banana = new FoodProduct("Banana",10,100, AgeRestriction.None,
                new Date((long)(System.currentTimeMillis() + 10 * PurchaseManager.DAILYMSEC)));
        System.out.println("New price:" + banana.getPrice());
        Product asus = new Computer("Notebook",0,1000, AgeRestriction.Teenager);
        System.out.println("Asus price: "+asus.getPrice());
        Product  windows = new Appliance("Windows",51,100, AgeRestriction.None);
        System.out.println("Wind price: "+windows.getPrice());
        Customer child = new Customer("Vasia",10,100);
        Customer teenager = new Customer("Anton",17,1500);
        Customer adult = new Customer("Dimas",25,2400);

        try{
            PurchaseManager.processPurchase(asus,adult);
        }catch ( ShopExeptions e ){
            System.out.println(e.getMessage());
        }

    }

}