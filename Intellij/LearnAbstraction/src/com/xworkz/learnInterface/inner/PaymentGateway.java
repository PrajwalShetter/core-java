package com.xworkz.learnInterface.inner;

public interface PaymentGateway {

    String currency="INR";
    double transaction_fee=2.5;

    void initiatePayment();

    void validatePayment();

    void processPayment();

    default void paymentStatus(){
        System.out.println("as per the developer");
    }

    static void gateWayInfo(){
        System.out.println("IPV6 address");
    }
}
