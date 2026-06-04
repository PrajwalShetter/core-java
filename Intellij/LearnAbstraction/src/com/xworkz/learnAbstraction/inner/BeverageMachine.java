package com.xworkz.learnAbstraction.inner;

abstract class BeverageMachine {

    // we can't create instance on abstract classes
    protected String coffee;
    protected String milk;
    protected int ml;

   protected BeverageMachine(String coffee){
       this.coffee=coffee;
   }
   protected  BeverageMachine(String milk, int ml){
       this.milk=milk;
       this.ml=ml;
   }

   protected BeverageMachine(String coffee, String milk){
       this.coffee=coffee;
       this.milk=milk;
   }


//abstract void prepareDrink(); // abstract methods cannot have body

public void powerOn(){
    System.out.println("BeverageMachine Powered On");
}


}
