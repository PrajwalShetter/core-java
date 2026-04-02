class InkPad {

    String brand;
    String color;
    String inkType;
    double size;
    double price;
    boolean isRefillable;
    String shape;
    String material;
    double weight;
    String usageType;

    InkPad(String brand, String color, String inkType, double size,
           double price, boolean isRefillable, String shape,
           String material, double weight, String usageType) {

        this.brand = brand;
        this.color = color;
        this.inkType = inkType;
        this.size = size;
        this.price = price;
        this.isRefillable = isRefillable;
        this.shape = shape;
        this.material = material;
        this.weight = weight;
        this.usageType = usageType;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Ink Type: " + inkType);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Is Refillable: " + isRefillable);
        System.out.println("Shape: " + shape);
        System.out.println("Material: " + material);
        System.out.println("Weight: " + weight);
        System.out.println("Usage Type: " + usageType);
        System.out.println("\n");
    }
}