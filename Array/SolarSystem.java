/*
Declare Classes to Store below data as String, Store least 5 elements in each class. Declare method to save and search Declare
 main methods to test each Store Class, store 5 info and do a search with positive and negative search Library, 
 SolarSystem,Cup,Tablet,Biometric,Juice,Aeroplane, Dynamo,Lift,SparkPlug,Alloy,
 */
 
 class SolarSystem {

    String[] systems = new String[5];
    int index = 0;

    public void save(String name) {
        if(index < systems.length) {
            systems[index] = name;
            index++;
            System.out.println(name + " saved");
        } else {
            System.out.println("Storage full");
        }
    }

    public void search(String name) {
        boolean found = false;

        for(int i = 0; i < systems.length; i++) {
            if(systems[i] != null && systems[i].equals(name)) {
                System.out.println(name + " found");
                found = true;
                break;
            }
        }

        if(!found) {
            System.out.println(name + " not found");
        }
    }
}