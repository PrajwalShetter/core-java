class Locker {

    String material;
    String type;
    double capacity;
    double weight;
    double price;
    String color;
    boolean isDigital;
    String lockType;
    int numberOfCompartments;
    String brand;

    Locker(String material, String type, double capacity, double weight,
           double price, String color, boolean isDigital, String lockType,
           int numberOfCompartments, String brand) {

        this.material = material;
        this.type = type;
        this.capacity = capacity;
        this.weight = weight;
        this.price = price;
        this.color = color;
        this.isDigital = isDigital;
        this.lockType = lockType;
        this.numberOfCompartments = numberOfCompartments;
        this.brand = brand;
    }

    void show() {
        System.out.println("Material: " + material);
        System.out.println("Type: " + type);
        System.out.println("Capacity: " + capacity);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Is Digital: " + isDigital);
        System.out.println("Lock Type: " + lockType);
        System.out.println("Compartments: " + numberOfCompartments);
        System.out.println("Brand: " + brand);
        System.out.println("\n");
    }
}