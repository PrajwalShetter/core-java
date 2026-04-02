class InkPadRunner {

    public static void main(String... args) {

        InkPad i1 = new InkPad("Camlin", "Blue", "Dye", 5.0,
                100, true, "Rectangle", "Plastic", 0.2, "Office");
        i1.show();

        InkPad i2 = new InkPad("Faber-Castell", "Black", "Pigment", 6.0,
                150, false, "Square", "Metal", 0.3, "School");
        i2.show();

        InkPad i3 = new InkPad("Kores", "Red", "Oil-based", 4.5,
                120, true, "Round", "Plastic", 0.25, "Stamping");
        i3.show();
    }
}