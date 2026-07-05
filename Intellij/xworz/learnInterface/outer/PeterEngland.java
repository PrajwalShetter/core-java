package com.xworz.learnInterface.outer;

import com.xworz.learnInterface.inner.Cloth;

public class PeterEngland implements Cloth {

    @Override
    public void wash() {
        System.out.println("wash from peter england");
    }

    @Override
    public void fold() {
        System.out.println("fold from peter england");
    }

    @Override
    public void wear() {
        System.out.println("wear from peter england");
    }
}
