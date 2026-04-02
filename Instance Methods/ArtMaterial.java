class ArtMaterial {

    String name;
    String type;
    String brand;
    String color;
    double price;
    double weight;
    String usage;
    boolean isNonToxic;
    String material;
    int quantity;

    ArtMaterial(String name, String type, String brand, String color,
                double price, double weight, String usage,
                boolean isNonToxic, String material, int quantity) {

        this.name = name;
        this.type = type;
        this.brand = brand;
        this.color = color;
        this.price = price;
        this.weight = weight;
        this.usage = usage;
        this.isNonToxic = isNonToxic;
        this.material = material;
        this.quantity = quantity;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Type: " + type);
        System.out.println("Brand: " + brand);
        System.out.println("Color: " + color);
        System.out.println("Price: " + price);
        System.out.println("Weight: " + weight);
        System.out.println("Usage: " + usage);
        System.out.println("Is Non-Toxic: " + isNonToxic);
        System.out.println("Material: " + material);
        System.out.println("Quantity: " + quantity);
        System.out.println("\n");
    }
}