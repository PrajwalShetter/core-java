class VRBox {

    String brand;
    String color;
    int price;
    String compatibility;
    boolean hasController;
    long id;
    String material;
    double weight;
    double lensQuality;
    boolean hasHeadphones;

   
    VRBox(String brand, String color, int price, String compatibility, boolean hasController,
          long id, String material, double weight, double lensQuality, boolean hasHeadphones) {

        this.brand = brand;
        this.color = color;
        this.price = price;
        this.compatibility = compatibility;
        this.hasController = hasController;
        this.id = id;
        this.material = material;
        this.weight = weight;
        this.lensQuality = lensQuality;
        this.hasHeadphones = hasHeadphones;
    }
}