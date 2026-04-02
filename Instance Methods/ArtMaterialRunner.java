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
    }
}