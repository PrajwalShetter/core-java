package com.xworz.learnInterface.outer;

import com.xworz.learnInterface.inner.PaymentGateway;

public class GooglePay implements PaymentGateway {

    @Override
    public void initiatePayment() {
        System.out.println("initiated the payment from googlePay ");
    }

    @Override
    public void validatePayment() {
        System.out.println("validating payment from googlePay");
    }

    @Override
    public void processPayment() {
        System.out.println("processing payment from googlePay");
    }


}
