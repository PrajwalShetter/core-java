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

    ArtMaterial(String name, double price, boolean isNonToxic) {
        this.name = name;
        this.price = price;
        this.isNonToxic = isNonToxic;
    }

    ArtMaterial(double weight, int quantity) {
        this.weight = weight;
        this.quantity = quantity;
    }

    ArtMaterial(String material) {
        this.material = material;
    }

    ArtMaterial(String type, String color) {
        this.type = type;
        this.color = color;
    }

    ArtMaterial(String brand, boolean isNonToxic) {
        this.brand = brand;
        this.isNonToxic = isNonToxic;
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