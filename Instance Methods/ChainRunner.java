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
		
		Chain c4 = new Chain("Iron", 3000, true);
c4.show();

Chain c5 = new Chain("Rope", "Black");
c5.show();

Chain c6 = new Chain(25.0, 12.0);
c6.show();

Chain c7 = new Chain(true, "Classic");
c7.show();

Chain c8 = new Chain("Magnetic");
c8.show();
    }
}