class Tyre {

    String brand;
    String type;
    double size;
    double price;
    String vehicleType;
    String material;
    boolean isTubeless;
    double weight;
    String gripType;
    int durability;

    Tyre(String brand, String type, double size, double price,
         String vehicleType, String material, boolean isTubeless,
         double weight, String gripType, int durability) {

        this.brand = brand;
        this.type = type;
        this.size = size;
        this.price = price;
        this.vehicleType = vehicleType;
        this.material = material;
        this.isTubeless = isTubeless;
        this.weight = weight;
        this.gripType = gripType;
        this.durability = durability;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Type: " + type);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Material: " + material);
        System.out.println("Is Tubeless: " + isTubeless);
        System.out.println("Weight: " + weight);
        System.out.println("Grip Type: " + gripType);
        System.out.println("Durability: " + durability);
        System.out.println("\n");
    }
}