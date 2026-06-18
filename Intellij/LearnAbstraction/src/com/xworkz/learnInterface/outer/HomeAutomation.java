package com.xworkz.learnInterface.outer;


import com.xworkz.learnInterface.inner.SmartDevice1;

public class HomeAutomation extends SmartTv{

    private SmartDevice1 smartDevice1;

    public HomeAutomation(SmartDevice1 smartDevice1){
        this.smartDevice1 = smartDevice1;
    }

    public void operate(){
        if(smartDevice1 != null){
            switchOn();
            connectInternet();
            disConnectInternet();
            switchOff();
        }
        else{
            System.out.println("smartDevice cannot be null");
        }
    }

}
