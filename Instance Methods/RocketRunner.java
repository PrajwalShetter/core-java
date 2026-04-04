class RocketRunner {

        public static void main(String... args) {

                Rocket r1 = new Rocket("Falcon 9", "Liquid", 549000, 70.0,
                                22800, 50000000, "USA", true, 2, "Satellite Launch");
                r1.show();

                Rocket r2 = new Rocket("GSLV Mk III", "Cryogenic", 640000, 43.0,
                                10000, 60000000, "India", false, 3, "Space Mission");
                r2.show();

                Rocket r3 = new Rocket("Starship", "Methane", 1335000, 120.0,
                                100000, 200000000, "USA", true, 2, "Mars Mission");
                r3.show();

                Rocket rocket4 = new Rocket("Falcon Heavy", 90000000, true);
                rocket4.show();

                Rocket rocket5 = new Rocket("Liquid", "USA");
                rocket5.show();

                Rocket rocket6 = new Rocket(500000, 60.0);
                rocket6.show();

                Rocket rocket7 = new Rocket(3, "Satellite");
                rocket7.show();

                Rocket rocket8 = new Rocket("Starship");
                rocket8.show();

        }
}