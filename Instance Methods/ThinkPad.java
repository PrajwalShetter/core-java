class ThinkPad {

    String model;
    String brand;
    String processor;
    int ram;
    int storage;
    double price;
    String color;
    double weight;
    String operatingSystem;
    double screenSize;

    ThinkPad(String model, String brand, String processor, int ram,
            int storage, double price, String color,
            double weight, String operatingSystem, double screenSize) {

        this.model = model;
        this.brand = brand;
        this.processor = processor;
        this.ram = ram;
        this.storage = storage;
        this.price = price;
        this.color = color;
        this.weight = weight;
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
    }

    ThinkPad(String model, double price, int ram) {
        this.model = model;
        this.price = price;
        this.ram = ram;
    }

    ThinkPad(String brand, String processor) {
        this.brand = brand;
        this.processor = processor;
    }

    ThinkPad(int storage, double weight) {
        this.storage = storage;
        this.weight = weight;
    }

    ThinkPad(String operatingSystem, double screenSize) {
        this.operatingSystem = operatingSystem;
        this.screenSize = screenSize;
    }

    ThinkPad(String color) {
        this.color = color;
    }

    void show() {
        System.out.println("Model: " + model);
        System.out.println("Brand: " + brand);
        System.out.println("Processor: " + processor);
        System.out.println("RAM: " + ram + " GB");
        System.out.println("Storage: " + storage + " GB");
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Weight: " + weight);
        System.out.println("OS: " + operatingSystem);
        System.out.println("Screen Size: " + screenSize);
        System.out.println("\n");
    }
}