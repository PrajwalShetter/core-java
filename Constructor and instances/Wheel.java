class Wheel {

    String brand;
    String color;
    int price;
    String type;
    boolean tubeless;
    long id;
    String material;
    double weight;
    double diameter;
    boolean alloy;

    
    Wheel(String brand, String color, int price, String type, boolean tubeless,
          long id, String material, double weight, double diameter, boolean alloy) {

        this.brand = brand;
        this.color = color;
        this.price = price;
        this.type = type;
        this.tubeless = tubeless;
        this.id = id;
        this.material = material;
        this.weight = weight;
        this.diameter = diameter;
        this.alloy = alloy;
    }
}