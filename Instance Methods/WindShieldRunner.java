class WindShieldRunner {
    public static void main(String... args) {

        WindShield w1 = new WindShield("Bosch", "Glass", 40.0, 7000,
                "Car", true, "Black", 5.0, "Front", "High");
        w1.show();

        WindShield w2 = new WindShield("Asahi", "Fiber", 35.0, 5000,
                "Bike", false, "Transparent", 3.0, "Front", "Medium");
        w2.show();

        WindShield w3 = new WindShield("SaintGobain", "Glass", 50.0, 9000,
                "Truck", true, "Dark", 6.0, "Front", "Very High");
        w3.show();
    }
}