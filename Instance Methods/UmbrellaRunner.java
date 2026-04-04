class UmbrellaRunner {

        public static void main(String... args) {

                Umbrella u1 = new Umbrella("Popy", "Black", 40.0, 500,
                                "Folding", "Polyester", true, 3, 0.5, "Rain");
                u1.show();

                Umbrella u2 = new Umbrella("SunBrand", "Blue", 45.0, 700,
                                "Stick", "Nylon", false, 1, 0.7, "Sun");
                u2.show();

                Umbrella u3 = new Umbrella("SkyLine", "Red", 42.0, 600,
                                "Compact", "Plastic", true, 2, 0.6, "Travel");
                u3.show();

                Umbrella umbrella4 = new Umbrella("Popy", 500, true);
                umbrella4.show();

                Umbrella umbrella5 = new Umbrella("Black", "Folding");
                umbrella5.show();

                Umbrella umbrella6 = new Umbrella(40.0, 0.6);
                umbrella6.show();

                Umbrella umbrella7 = new Umbrella(3, "Rain");
                umbrella7.show();

                Umbrella umbrella8 = new Umbrella("Polyester");
                umbrella8.show();
        }
}