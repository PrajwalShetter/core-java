package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.PaymentGateway;

public class Paytm implements PaymentGateway {

    @Override
    public void initiatePayment() {
        System.out.println("Initiated payment fro  paytm");
    }

    @Override
    public void validatePayment() {
        System.out.println("validating payment from paytm");
    }

    @Override
    public void processPayment() {
        System.out.println("success");
    }
}
