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

                Tyre tyre4 = new Tyre("MRF", 5000, true);
                tyre4.show();

                Tyre tyre5 = new Tyre("Radial", "Car");
                tyre5.show();

                Tyre tyre6 = new Tyre(16.0, 8.0);
                tyre6.show();

                Tyre tyre7 = new Tyre("Rubber", 5);
                tyre7.show();

                Tyre tyre8 = new Tyre("All-Terrain");
                tyre8.show();
        }
}