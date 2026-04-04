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
	
	Chain(String material, double price, boolean isAdjustable){
    this.material = material;
    this.price = price;
    this.isAdjustable = isAdjustable;
}

Chain(String type, String color){
    this.type = type;
    this.color = color;
}

Chain(double length, double weight){
    this.length = length;
    this.weight = weight;
}

Chain(boolean isAdjustable, String design){
    this.isAdjustable = isAdjustable;
    this.design = design;
}

Chain(String claspType){
    this.claspType = claspType;
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