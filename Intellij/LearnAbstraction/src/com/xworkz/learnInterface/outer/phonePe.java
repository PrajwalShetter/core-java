package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.PaymentGateway;

public class phonePe implements PaymentGateway {

    @Override
    public void initiatePayment() {
        System.out.println("Payment is initiated");
    }

    @Override
    public void validatePayment() {
        System.out.println("wait payment is validating");
    }

    @Override
    public void processPayment() {
        System.out.println("its take few minutes and returns your page");
    }

    @Override
    public void paymentStatus() {
        System.out.println("success");
    }
}
