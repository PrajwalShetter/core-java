class TyreRunner {
    public static void main(String... args) {

        Tyre t1 = new Tyre("MRF", "Radial", 16.0, 5000,
                "Car", "Rubber", true, 8.0, "All-Terrain", 5);
        t1.show();

        Tyre t2 = new Tyre("CEAT", "Tubed", 18.0, 3000,
                "Bike", "Rubber", false, 5.0, "High Grip", 4);
        t2.show();

        Tyre t3 = new Tyre("Apollo", "Radial", 20.0, 8000,
                "Truck", "Rubber", true, 15.0, "Heavy Duty", 6);
        t3.show();
    }
}