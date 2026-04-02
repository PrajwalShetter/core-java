class Rocket {

    String name;
    String fuelType;
    double weight;
    double height;
    double payloadCapacity;
    double cost;
    String country;
    boolean isReusable;
    int stages;
    String missionType;

    Rocket(String name, String fuelType, double weight, double height,
           double payloadCapacity, double cost, String country,
           boolean isReusable, int stages, String missionType) {

        this.name = name;
        this.fuelType = fuelType;
        this.weight = weight;
        this.height = height;
        this.payloadCapacity = payloadCapacity;
        this.cost = cost;
        this.country = country;
        this.isReusable = isReusable;
        this.stages = stages;
        this.missionType = missionType;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Fuel Type: " + fuelType);
        System.out.println("Weight: " + weight);
        System.out.println("Height: " + height);
        System.out.println("Payload Capacity: " + payloadCapacity);
        System.out.println("Cost: " + cost);
        System.out.println("Country: " + country);
        System.out.println("Is Reusable: " + isReusable);
        System.out.println("Stages: " + stages);
        System.out.println("Mission Type: " + missionType);
        System.out.println("\n");
    }
}