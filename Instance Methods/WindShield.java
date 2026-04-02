class WindShield {

    String brand;
    String material;
    double size;
    double price;
    String vehicleType;
    boolean isTinted;
    String color;
    double thickness;
    String type;
    String durability;

    WindShield(String brand, String material, double size, double price,
               String vehicleType, boolean isTinted, String color,
               double thickness, String type, String durability) {

        this.brand = brand;
        this.material = material;
        this.size = size;
        this.price = price;
        this.vehicleType = vehicleType;
        this.isTinted = isTinted;
        this.color = color;
        this.thickness = thickness;
        this.type = type;
        this.durability = durability;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Material: " + material);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Vehicle Type: " + vehicleType);
        System.out.println("Is Tinted: " + isTinted);
        System.out.println("Color: " + color);
        System.out.println("Thickness: " + thickness);
        System.out.println("Type: " + type);
        System.out.println("Durability: " + durability);
        System.out.println("\n");
    }
}