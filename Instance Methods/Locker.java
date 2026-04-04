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

    Locker(String material, double price, boolean isDigital) {
        this.material = material;
        this.price = price;
        this.isDigital = isDigital;
    }

    Locker(String type, String color) {
        this.type = type;
        this.color = color;
    }

    Locker(double capacity, double weight) {
        this.capacity = capacity;
        this.weight = weight;
    }

    Locker(int numberOfCompartments, String brand) {
        this.numberOfCompartments = numberOfCompartments;
        this.brand = brand;
    }

    Locker(String lockType) {
        this.lockType = lockType;
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