package com.xworkz.learningException;

import com.xworkz.learningException.uncheckedexception.UnCheckedException;

public class UnCheckedExeRunner {
    public static void main(String[] args) {


        UnCheckedException unCheckedException= new UnCheckedException();
//    try{
//        unCheckedException.createBrand("BMW");
//    }catch (ArrayIndexOutOfBoundsException e){
//        e.printStackTrace();
//    }
//        try{
//            unCheckedException.createBrand("Audi");
//        }catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//        }
//        try{
//            unCheckedException.createBrand("Toyato");
//        }catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//        }
//        try{
//            unCheckedException.createBrand("Supra");
//        }catch (ArrayIndexOutOfBoundsException e){
//            e.printStackTrace();
//        }

        unCheckedException.createBrand("BMW");
        unCheckedException.createBrand("Audi");
        unCheckedException.createBrand("Toyota");
        unCheckedException.createBrand("supra");

        unCheckedException.displayBrands();
    }


}
