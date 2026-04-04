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

                WindShield windShield4 = new WindShield("Bosch", 7000, true);
                windShield4.show();

                WindShield windShield5 = new WindShield("Glass", "Car");
                windShield5.show();

                WindShield windShield6 = new WindShield(40.0, 5.0);
                windShield6.show();

                WindShield windShield7 = new WindShield("Front", true);
                windShield7.show();

                WindShield windShield8 = new WindShield("Black");
                windShield8.show();
        }
}