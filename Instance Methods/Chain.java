class Chain {

    String material;
    String type;
    double length;
    double weight;
    double price;
    String color;
    String design;
    boolean isAdjustable;
    String claspType;
    String brand;

    Chain(String material, String type, double length, double weight,
          double price, String color, String design, boolean isAdjustable,
          String claspType, String brand) {

        this.material = material;
        this.type = type;
        this.length = length;
        this.weight = weight;
        this.price = price;
        this.color = color;
        this.design = design;
        this.isAdjustable = isAdjustable;
        this.claspType = claspType;
        this.brand = brand;
    }

    void show() {
        System.out.println("Material: " + material);
        System.out.println("Type: " + type);
        System.out.println("Length: " + length);
        System.out.println("Weight: " + weight);
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Design: " + design);
        System.out.println("Is Adjustable: " + isAdjustable);
        System.out.println("Clasp Type: " + claspType);
        System.out.println("Brand: " + brand);
        System.out.println("\n");
    }
}