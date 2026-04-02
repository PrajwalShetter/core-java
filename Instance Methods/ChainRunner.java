class ChainRunner {

    public static void main(String... args) {

        Chain c1 = new Chain("Gold", "Cable", 18.0, 15.0, 25000,
                "Yellow", "Simple", true, "Hook", "Malabar");
        c1.show();

        Chain c2 = new Chain("Silver", "Rope", 20.0, 10.0, 5000,
                "Gray", "Twisted", false, "Spring Ring", "Kalyan");
        c2.show();

        Chain c3 = new Chain("Platinum", "Box", 22.0, 18.0, 40000,
                "White", "Modern", true, "Lobster Clasp", "Tanishq");
        c3.show();
    }
}