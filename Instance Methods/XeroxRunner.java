class XeroxRunner {

        public static void main(String... args) {

                Xerox x1 = new Xerox("HP", "LaserJet 1020", "Laser", 12000,
                                20, "Black & White", false, 5.5, "A4", "Office");
                x1.show();

                Xerox x2 = new Xerox("Canon", "Pixma G3000", "Inkjet", 15000,
                                12, "Color", true, 6.0, "A4", "Home");
                x2.show();

                Xerox x3 = new Xerox("Epson", "EcoTank L3150", "Inkjet", 18000,
                                15, "Color", true, 5.8, "A4", "Business");
                x3.show();

                Xerox xerox4 = new Xerox("HP", 12000, true);
                xerox4.show();

                Xerox xerox5 = new Xerox("LaserJet", "Laser");
                xerox5.show();

                Xerox xerox6 = new Xerox(20, 5.5);
                xerox6.show();

                Xerox xerox7 = new Xerox("A4", true);
                xerox7.show();

                Xerox xerox8 = new Xerox("Color");
                xerox8.show();
        }
}