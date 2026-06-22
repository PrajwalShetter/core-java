package com.xworkz.learningException.uncheckedexception;

public class UnCheckedException {

    String[] brands =new String[2];
    int index=0;


    public void createBrand(String brand){
        try {
            addBrand(brand);
        }catch (ArrayIndexOutOfBoundsException e){
            e.getMessage();
        }
//        addBrand(brand);

    }

    public void addBrand(String brand)  throws ArrayIndexOutOfBoundsException {

//        try {
            if (brand != null && !brand.isEmpty()) {
                brands[index++] = brand;
            }
//            if(brand == null || brand.isEmpty()){
//                throw new ArrayIndexOutOfBoundsException("Array is exceded");
//            }
//        }
//        catch (ArrayIndexOutOfBoundsException e){
//            e.getMessage();
//        }
    }
    public void displayBrands(){

        for (String brand : brands){
            System.out.println(brand);
        }
    }
}
