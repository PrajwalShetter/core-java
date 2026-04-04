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

    WindShield(String brand, double price, boolean isTinted) {
        this.brand = brand;
        this.price = price;
        this.isTinted = isTinted;
    }

    WindShield(String material, String vehicleType) {
        this.material = material;
        this.vehicleType = vehicleType;
    }

    WindShield(double size, double thickness) {
        this.size = size;
        this.thickness = thickness;
    }

    WindShield(String type, boolean isTinted) {
    this.type = type;
    this.isTinted = isTinted;
}

    WindShield(String color) {
        this.color = color;
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