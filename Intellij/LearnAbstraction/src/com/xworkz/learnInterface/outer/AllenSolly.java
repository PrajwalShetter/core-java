package com.xworkz.learnInterface.outer;

import com.xworkz.learnInterface.inner.Cloth;

public class AllenSolly implements Cloth {
    @Override
    public void wear() {
        System.out.println("wear from AllenSolly");
    }

    @Override
    public void fold() {
        System.out.println("fold from Allensolly");
    }

    @Override
    public void wash() {
        System.out.println("wash from AllenSolly");
    }
}
