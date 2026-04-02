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
    }
}