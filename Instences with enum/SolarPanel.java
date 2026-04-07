class SolarPanel {

    String brand;
    double capacity;

    SolarPanel(String brand, double capacity) {
        this.brand = brand;
        this.capacity = capacity;
    }

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Capacity: " + capacity + "W");
    }
}