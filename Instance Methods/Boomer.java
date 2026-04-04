class Boomer {

    String material;
    String color;
    double weight;
    double price;
    String shape;
    String type;
    double range;
    boolean isReturning;
    String design;
    String brand;

    Boomer(String material, String color, double weight, double price,
            String shape, String type, double range, boolean isReturning,
            String design, String brand) {

        this.material = material;
        this.color = color;
        this.weight = weight;
        this.price = price;
        this.shape = shape;
        this.type = type;
        this.range = range;
        this.isReturning = isReturning;
        this.design = design;
        this.brand = brand;
    }

    Boomer(String material, double price, boolean isReturning) {
        this.material = material;
        this.price = price;
        this.isReturning = isReturning;
    }

    Boomer(String color, String type) {
        this.color = color;
        this.type = type;
    }

    Boomer(double weight, double range) {
        this.weight = weight;
        this.range = range;
    }

    Boomer(String brand, boolean isReturning) {
        this.brand = brand;
        this.isReturning = isReturning;
    }

    Boomer(String shape) {
        this.shape = shape;
    }

    void show() {
        System.out.println("Material: " + material);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Shape: " + shape);
        System.out.println("Type: " + type);
        System.out.println("Range: " + range);
        System.out.println("Is Returning: " + isReturning);
        System.out.println("Design: " + design);
        System.out.println("Brand: " + brand);
        System.out.println("\n");
    }
}