class Stamp {

    String type;
    String material;
    String shape;
    String color;
    double size;
    double price;
    String inkColor;
    boolean isReusable;
    String usageType;
    String brand;

    Stamp(String type, String material, String shape, String color,
            double size, double price, String inkColor, boolean isReusable,
            String usageType, String brand) {

        this.type = type;
        this.material = material;
        this.shape = shape;
        this.color = color;
        this.size = size;
        this.price = price;
        this.inkColor = inkColor;
        this.isReusable = isReusable;
        this.usageType = usageType;
        this.brand = brand;
    }

    Stamp(String type, double price, boolean isReusable) {
        this.type = type;
        this.price = price;
        this.isReusable = isReusable;
    }

    Stamp(String material, String color) {
        this.material = material;
        this.color = color;
    }

    Stamp(double size, double price) {
        this.size = size;
        this.price = price;
    }

    Stamp(String brand, boolean isReusable) {
        this.brand = brand;
        this.isReusable = isReusable;
    }

    Stamp(String shape) {
        this.shape = shape;
    }

    void show() {
        System.out.println("Type: " + type);
        System.out.println("Material: " + material);
        System.out.println("Shape: " + shape);
        System.out.println("Color: " + color);
        System.out.println("Size: " + size);
        System.out.println("Price: " + price);
        System.out.println("Ink Color: " + inkColor);
        System.out.println("Is Reusable: " + isReusable);
        System.out.println("Usage Type: " + usageType);
        System.out.println("Brand: " + brand);
        System.out.println("\n");
    }
}