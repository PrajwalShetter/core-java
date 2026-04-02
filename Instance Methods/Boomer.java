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