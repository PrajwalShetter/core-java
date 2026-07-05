package com.xworz.learnInterface.Runner;

import com.xworz.learnInterface.inner.PaymentGateway;
import com.xworz.learnInterface.outer.GooglePay;
import com.xworz.learnInterface.outer.Paytm;
import com.xworz.learnInterface.outer.phonePe;

public class PaymentGatewayRunner {

    public static void main(String[] args) {

        PaymentGateway payment1= new phonePe();
        payment1.initiatePayment();
        payment1.validatePayment();
        payment1.processPayment();
        payment1.paymentStatus();
        System.out.println(PaymentGateway.currency);

        GooglePay payment2=new GooglePay();
        payment2.initiatePayment();
        payment2.validatePayment();
        payment2.processPayment();

        Paytm payment3= new Paytm();
        payment3.initiatePayment();
        payment3.validatePayment();
        payment3.processPayment();
    }
}
