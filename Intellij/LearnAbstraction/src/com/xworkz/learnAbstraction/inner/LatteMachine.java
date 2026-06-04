package com.xworkz.learnAbstraction.inner;

 public class LatteMachine extends BeverageMachine {

     public LatteMachine(String coffee, String milk){

         super(coffee, milk);

     }

     @Override
     public void powerOn(){
         System.out.println("LatteMachine's power On ");
     }
}
