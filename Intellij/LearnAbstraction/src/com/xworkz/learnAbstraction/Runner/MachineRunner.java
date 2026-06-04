package com.xworkz.learnAbstraction.Runner;


import com.sun.org.apache.xml.internal.utils.BoolStack;
import com.xworkz.learnAbstraction.inner.LatteMachine;

public class MachineRunner {
    public static void main(String[] args) {

        LatteMachine machine = new LatteMachine("Cappuccino", "Boost");
        machine.powerOn();

    }
}
