class StampRunner {

    public static void main(String... args) {

        Stamp s1 = new Stamp("Rubber", "Plastic", "Round", "Blue",
                2.5, 200, "Blue", true, "Office", "Camlin");
        s1.show();

        Stamp s2 = new Stamp("Self-Inking", "Metal", "Rectangle", "Black",
                3.0, 500, "Black", true, "Official", "Kores");
        s2.show();

        Stamp s3 = new Stamp("Wooden", "Wood", "Square", "Brown",
                2.0, 150, "Red", false, "Personal", "Local");
        s3.show();
    }
}