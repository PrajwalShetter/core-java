class Specs {

    String brand;
    String frameType;
    String lensType;
    String color;
    double price;
    double weight;
    String size;
    boolean isPolarized;
    String usageType;
    String material;

    Specs(String brand, String frameType, String lensType, String color,
          double price, double weight, String size, boolean isPolarized,
          String usageType, String material) {

        this.brand = brand;
        this.frameType = frameType;
        this.lensType = lensType;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.size = size;
        this.isPolarized = isPolarized;
        this.usageType = usageType;
        this.material = material;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Frame Type: " + frameType);
        System.out.println("Lens Type: " + lensType);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Size: " + size);
        System.out.println("Is Polarized: " + isPolarized);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Material: " + material);
        System.out.println("\n");
    }
}