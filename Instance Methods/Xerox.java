class Xerox {

    String brand;
    String model;
    String type;
    double price;
    double speed;
    String colorMode;
    boolean isWireless;
    double weight;
    String paperSize;
    String usageType;

    Xerox(String brand, String model, String type, double price,
          double speed, String colorMode, boolean isWireless,
          double weight, String paperSize, String usageType) {

        this.brand = brand;
        this.model = model;
        this.type = type;
        this.price = price;
        this.speed = speed;
        this.colorMode = colorMode;
        this.isWireless = isWireless;
        this.weight = weight;
        this.paperSize = paperSize;
        this.usageType = usageType;
    }

    void show() {
        System.out.println("Brand: " + brand);
        System.out.println("Model: " + model);
        System.out.println("Type: " + type);
        System.out.println("Price: " + price);
        System.out.println("Speed (ppm): " + speed);
        System.out.println("Color Mode: " + colorMode);
        System.out.println("Is Wireless: " + isWireless);
        System.out.println("Weight: " + weight);
        System.out.println("Paper Size: " + paperSize);
        System.out.println("Usage Type: " + usageType);
        System.out.println("\n");
    }
}