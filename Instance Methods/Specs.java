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

    Specs(String brand, String usageType, boolean isPolarized) {

        this.brand = brand;
        this.usageType = usageType;
        this.isPolarized = isPolarized;

    }

    Specs(String usageType, String frameType) {
        this.usageType = usageType;
        this.frameType = frameType;

    }

    Specs(String color, double price) {
        this.color = color;
        this.price = price;

    }

    Specs(String brand, double weight, boolean isPolarized) {
        this.brand = brand;
        this.weight = weight;
        this.isPolarized = isPolarized;
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