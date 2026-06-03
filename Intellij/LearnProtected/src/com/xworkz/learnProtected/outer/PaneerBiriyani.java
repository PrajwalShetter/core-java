package com.xworkz.learnProtected.outer;

public class PaneerBiriyani extends Food {

    public void test(){
        System.out.println(spices);
        process(); // here invoking protected method in different package through inheritence
    }

    public void test1() {
        Food f = new Food();
        f.process();
        System.out.println(f.spices);
        //PaneerBiriyani is a subclass, it cannot access protected members through a parent-class reference (Food f).
    }

    public static void main(String[] args) {
        PaneerBiriyani paneerBiriyani = new PaneerBiriyani();
        paneerBiriyani.process();
        paneerBiriyani.test();
    }

}