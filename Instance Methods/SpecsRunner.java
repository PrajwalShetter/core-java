class SpecsRunner {

        public static void main(String... args) {

                Specs s1 = new Specs("RayBan", "Full Rim", "UV", "Black",
                                5000, 30.5, "Medium", true, "Sunglasses", "Plastic");
                s1.show();

                Specs s2 = new Specs("Titan", "Half Rim", "Power", "Brown",
                                3000, 25.0, "Large", false, "Reading", "Metal");
                s2.show();

                Specs s3 = new Specs("Oakley", "Rimless", "Anti-glare", "Blue",
                                7000, 20.0, "Small", true, "Sports", "Fiber");
                s3.show();

                Specs s4 = new Specs("prisma", "IT", false);
                s4.show();

                Specs s5 = new Specs("Sports", "glass");
                s5.show();

                Specs s6 = new Specs("green", 10000);
                s6.show();

                Specs s7 = new Specs("lenscart", 8.0, true);
                s7.show();

        }
}