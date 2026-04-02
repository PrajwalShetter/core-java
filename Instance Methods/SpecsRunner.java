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
    }
}