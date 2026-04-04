class ThinkPadRunner {
        public static void main(String... args) {

                ThinkPad p1 = new ThinkPad("X1 Carbon", "Lenovo", "i7",
                                16, 512, 150000, "Black", 1.2, "Windows", 14.0);
                p1.show();

                ThinkPad p2 = new ThinkPad("E14", "Lenovo", "i5",
                                8, 256, 70000, "Black", 1.5, "Windows", 14.0);
                p2.show();

                ThinkPad p3 = new ThinkPad("T14", "Lenovo", "Ryzen 7",
                                16, 1024, 120000, "Black", 1.4, "Linux", 14.0);
                p3.show();

                ThinkPad thinkPad4 = new ThinkPad("X1 Carbon", 150000, 16);
                thinkPad4.show();

                ThinkPad thinkPad5 = new ThinkPad("Lenovo", "i7");
                thinkPad5.show();

                ThinkPad thinkPad6 = new ThinkPad(512, 1.3);
                thinkPad6.show();

                ThinkPad thinkPad7 = new ThinkPad("Windows", 14.0);
                thinkPad7.show();

                ThinkPad thinkPad8 = new ThinkPad("Black");
                thinkPad8.show();
        }
}