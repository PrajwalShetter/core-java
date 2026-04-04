class LocketRunner {

	public static void main(String... args) {

		Locket locket1 = new Locket("Gold", "yellow", 120.0, 20000, "Star", "modern", true, "vastu", 3.0, "malabar");
		locket1.show();

		Locket locket2 = new Locket("platinum", "light gray", 18.0, 2000000, "rectangle", "old", false, "dhana", 6.0,
				"KPG");
		locket2.show();

		Locket locket3 = new Locket("silver", "gray", 10.0, 200090, "Rhombus", "latest", true, "marriage", 4.0,
				"kalyan");
		locket3.show();

		Locket locket5 = new Locket("Diamond", "White");
		locket5.show();

		Locket locket6 = new Locket(50000, "Tanishq");
		locket6.show();

		Locket locket7 = new Locket("Oval");
		locket7.show();

	}

}