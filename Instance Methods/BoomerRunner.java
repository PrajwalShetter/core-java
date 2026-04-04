class BoomerRunner {

        public static void main(String... args) {

                Boomer b1 = new Boomer("Wood", "Brown", 0.5, 500,
                                "V-Shape", "Sport", 30.0, true, "Classic", "AeroFly");
                b1.show();

                Boomer b2 = new Boomer("Plastic", "Red", 0.3, 300,
                                "Curved", "Toy", 20.0, false, "Simple", "FunPlay");
                b2.show();

                Boomer b3 = new Boomer("Fiber", "Blue", 0.4, 800,
                                "Tri-blade", "Professional", 50.0, true, "Advanced", "ProSpin");
                b3.show();

                Boomer b4 = new Boomer("Wood", 500, true);
                b4.show();

                Boomer b5 = new Boomer("Red", "Sport");
                b5.show();

                Boomer b6 = new Boomer(0.6, 40.0);
                b6.show();

                Boomer b7 = new Boomer("ProSpin", true);
                b7.show();

                Boomer b8 = new Boomer("V-Shape");
                b8.show();
        }
}