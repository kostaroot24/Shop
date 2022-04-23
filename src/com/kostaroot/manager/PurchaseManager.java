package com.kostaroot.manager;

import com.kostaroot.customerinfo.AgeRestriction;
import com.kostaroot.customerinfo.Customer;
import com.kostaroot.product.Product;

public class PurchaseManager {
    public final static long DAILYMSEC = 84600000;

    public static void processPurchase(Product product, Customer customer) throws ShopExeptions{
        if (ageCheck(product,customer)){
            if(haveProduct(product))
                System.out.println("Success");
            else
                throw new ShopExeptions(product.getName()+" is end");
        }else
            throw new ShopExeptions("You are to young for buy this product");

    }

    private static boolean ageCheck (Product product,Customer customer){
        if( product.getAgeRestriction() == AgeRestriction.None)
            return true;
        else if(product.getAgeRestriction() == AgeRestriction.Teenager){
            if(customer.getAge() > 13)
                return true;
            else
                return false;
        }else {
            if(customer.getAge() > 17)
                return true;
            else
                return false;
        }
    }

    private static boolean moneyCheck ( Product product, Customer customer){
        if(product.getPrice() > customer.getBalance())
            return false;
        return true;
    }

    private static boolean haveProduct (Product product){
        if(product.getQuantity()>0)
            return true;
        return false;
    }

}
