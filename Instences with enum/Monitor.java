/*
Monitor,SugarCane,SolarPanel Declare a class , add 2 instance variables, think of init it (own choice )
 EG : Soil:moisture,region Declare another class to use above class as instance variables, make sure you have four variables, 
 one is above class and three your choice , make sure one is enum BuildingConstrcutor: architectName,chiefEnginnerNAme,noOfWorkers, 
 soil Declare a method to use methods from another class i.e soil , do null check and invoke the method Runner Create 
 BuildingConstrcutor, init all the variables and invoke the method
 
 */
 
 
 class Monitor {

    String brand;
    double size;

    Monitor(String brand, double size) {
        this.brand = brand;
        this.size = size;
    }

    void display() {
        System.out.println("Monitor Brand: " + brand);
        System.out.println("Monitor Size: " + size);
    }
}

