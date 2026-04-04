class ArtMaterialRunner {

    public static void main(String... args) {

        ArtMaterial a1 = new ArtMaterial("Paint", "Acrylic", "Camel",
                "Red", 200, 0.5, "Painting", true, "Liquid", 10);
        a1.show();

        ArtMaterial a2 = new ArtMaterial("Pencil", "Graphite", "Apsara",
                "Black", 50, 0.1, "Drawing", true, "Wood", 5);
        a2.show();

        ArtMaterial a3 = new ArtMaterial("Brush", "Round", "Faber",
                "Brown", 150, 0.2, "Painting", true, "Fiber", 3);
        a3.show();

        ArtMaterial a4 = new ArtMaterial("Paint", 300, true);
        a4.show();

        ArtMaterial a5 = new ArtMaterial("Sketch", "Blue");
        a5.show();

        ArtMaterial a6 = new ArtMaterial(0.7, 12);
        a6.show();

        ArtMaterial a7 = new ArtMaterial("Camel", true);
        a7.show();

        ArtMaterial a8 = new ArtMaterial("Plastic");
        a8.show();
    }
}