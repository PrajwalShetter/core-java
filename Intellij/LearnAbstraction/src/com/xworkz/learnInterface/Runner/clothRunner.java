package com.xworkz.learnInterface.Runner;

import com.xworkz.learnInterface.inner.Cloth;
import com.xworkz.learnInterface.outer.AllenSolly;
import com.xworkz.learnInterface.outer.PeterEngland;
import com.xworkz.learnInterface.outer.Polo;

public class clothRunner {

    public static void main(String[] args) {

        Cloth cloth1 = new Polo();
        cloth1.wear();
        cloth1.wash();
        cloth1.fold();
        cloth1.display();
        Cloth.info(); // static method in cloth interface
        System.out.println(Cloth.material);

        PeterEngland cloth2 = new PeterEngland();
        cloth2.fold();
        cloth2.wash();
        cloth2.wear();
        cloth2.display();

        AllenSolly cloth3 = new AllenSolly();
        cloth3.fold();
        cloth3.wash();
        cloth3.wear();

    }
}
