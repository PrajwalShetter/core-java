class Umbrella {

    String brand;
    String color;
    double size;
    double price;
    String type;
    String material;
    boolean isAutomatic;
    int numberOfFolds;
    double weight;
    String usageType;

    Umbrella(String brand, String color, double size, double price,
            String type, String material, boolean isAutomatic,
            int numberOfFolds, double weight, String usageType) {

        this.brand = brand;
        this.color = color;
        this.size = size;
        this.price = price;
        this.type = type;
        this.material = material;
        this.isAutomatic = isAutomatic;
        this.numberOfFolds = numberOfFolds;
        this.weight = weight;
        this.usageType = usageType;
    }

    Umbrella(String brand, double price, boolean isAutomatic) {
        this.brand = brand;
        this.price = price;
        this.isAutomatic = isAutomatic;
    }

    Umbrella(String color, String type) {
        this.color = color;
        this.type = type;
    }

    Umbrella(double size, double weight) {
        this.size = size;
        this.weight = weight;
    }

    Umbrella(int numberOfFolds, String usageType) {
        this.numberOfFolds = numberOfFolds;
        this.usageType = usageType;
    }

    Umbrella(String material) {
        this.material = material;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Is Automatic: " + isAutomatic);
        System.out.println("Folds: " + numberOfFolds);
        System.out.println("Weight: " + weight);
        System.out.println("Usage Type: " + usageType);
        System.out.println("\n");
    }
}