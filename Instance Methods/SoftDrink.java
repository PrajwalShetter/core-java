class SoftDrink {

    String name;
    String brand;
    String flavor;
    double quantity;
    double price;
    String color;
    boolean isCarbonated;
    String packagingType;
    double sugarContent;
    String expiryDate;

    SoftDrink(String name, String brand, String flavor, double quantity,
            double price, String color, boolean isCarbonated,
            String packagingType, double sugarContent, String expiryDate) {

        this.name = name;
        this.brand = brand;
        this.flavor = flavor;
        this.quantity = quantity;
        this.price = price;
        this.color = color;
        this.isCarbonated = isCarbonated;
        this.packagingType = packagingType;
        this.sugarContent = sugarContent;
        this.expiryDate = expiryDate;
    }

    SoftDrink(String name, double price, boolean isCarbonated) {
        this.name = name;
        this.price = price;
        this.isCarbonated = isCarbonated;
    }

    SoftDrink(String brand, String flavor) {
        this.brand = brand;
        this.flavor = flavor;
    }

    SoftDrink(double quantity, double sugarContent) {
        this.quantity = quantity;
        this.sugarContent = sugarContent;
    }

    SoftDrink(String packagingType, boolean isCarbonated) {
    this.packagingType = packagingType;
    this.isCarbonated = isCarbonated;
}

    SoftDrink(String color) {
        this.color = color;
    }

    void show() {
        System.out.println("Name: " + name);
        System.out.println("Brand: " + brand);
        System.out.println("Flavor: " + flavor);
        System.out.println("Quantity: " + quantity + " ml");
        System.out.println("Price: " + price);
        System.out.println("Color: " + color);
        System.out.println("Is Carbonated: " + isCarbonated);
        System.out.println("Packaging Type: " + packagingType);
        System.out.println("Sugar Content: " + sugarContent + " g");
        System.out.println("Expiry Date: " + expiryDate);
        System.out.println("\n");
    }
}