package com.kostaroot.manager;

public class PurchaseManager {

    public static void processPurchase() throws ShopExeptions{
        int a = 1;
        if( a == 1 )
            throw new ShopExeptions("Money lost!");
        else
            System.out.println("Success!");
        System.out.println("Ended");
    }
}
