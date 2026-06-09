package com.xworkz.learnInterface.Runner;

import com.xworkz.learnInterface.inner.ECommerce;
import com.xworkz.learnInterface.outer.MixedShopping;
import com.xworkz.learnInterface.outer.OfflineShopping;
import com.xworkz.learnInterface.outer.OnlineShopping;

public class ECommerceRunner {

    public static void main(String[] args) {

        OnlineShopping ecom1= new OnlineShopping();
        ecom1.addToCart();
        ecom1.placeOrder();
        ecom1.cancelOrder();
        ecom1.OfferDetails();
        System.out.println(ECommerce.maxOrders);

        OfflineShopping ecom2= new OfflineShopping();
        ecom2.addToCart();
        ecom2.placeOrder();
        ecom2.cancelOrder();

        MixedShopping ecom3 = new MixedShopping();
        ecom3.addToCart();
        ecom3.placeOrder();
        ecom3.cancelOrder();
    }
}
