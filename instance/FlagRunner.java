class FlagRunner {

	public static void main(String[] args) {

		
		Flag indiaFlag = new Flag();

		System.out.println("Default Values (India Object): ");
		System.out.println("Country = " + indiaFlag.country + " \n Color = " + indiaFlag.color + " \n Stripes = " + indiaFlag.stripes
				+ " \n Symbol = " + indiaFlag.hasSymbol + " \n Size = " + indiaFlag.size + "\n");

		indiaFlag.country = "India";
		indiaFlag.color = "Tricolor";
		indiaFlag.stripes = 3;
		indiaFlag.hasSymbol = true;
		indiaFlag.size = 1.5;

		System.out.println("Updated Values:");
		System.out.println("Country = " + indiaFlag.country + " \n Color = " + indiaFlag.color + " \n stripes =" + indiaFlag.stripes
				+ "\n Symbol= " + indiaFlag.hasSymbol + "\n Size = " + indiaFlag.size + "\n");

		
		Flag usaFlag = new Flag();

		System.out.println("Default Values (USA Object): ");
		System.out.println("Country = " + usaFlag.country + " \n Color = " + usaFlag.color + " \n Stripes = " + usaFlag.stripes
				+ " \n Symbol = " + usaFlag.hasSymbol + " \n Size = " + usaFlag.size + "\n");

		usaFlag.country = "USA";
		usaFlag.color = "Red White Blue";
		usaFlag.stripes = 13;
		usaFlag.hasSymbol = true;
		usaFlag.size = 2.0;

		System.out.println("Updated Values:");
		System.out.println("Country = " + usaFlag.country + " \n Color = " + usaFlag.color + " \n stripes =" + usaFlag.stripes
				+ "\n Symbol= " + usaFlag.hasSymbol + "\n Size = " + usaFlag.size + "\n");

		
		Flag japanFlag = new Flag();

		System.out.println("Default Values (Japan Object): ");
		System.out.println("Country = " + japanFlag.country + " \n Color = " + japanFlag.color + " \n Stripes = " + japanFlag.stripes
				+ " \n Symbol = " + japanFlag.hasSymbol + " \n Size = " + japanFlag.size + "\n");

		japanFlag.country = "Japan";
		japanFlag.color = "White Red";
		japanFlag.stripes = 0;
		japanFlag.hasSymbol = true;
		japanFlag.size = 1.2;

		System.out.println("Updated Values:");
		System.out.println("Country = " + japanFlag.country + " \n Color = " + japanFlag.color + " \n stripes =" + japanFlag.stripes
				+ "\n Symbol= " + japanFlag.hasSymbol + "\n Size = " + japanFlag.size + "\n");

		
		Flag germanyFlag = new Flag();

		System.out.println("Default Values (Germany Object): ");
		System.out.println("Country = " + germanyFlag.country + " \n Color = " + germanyFlag.color + " \n Stripes = " + germanyFlag.stripes
				+ " \n Symbol = " + germanyFlag.hasSymbol + " \n Size = " + germanyFlag.size + "\n");

		germanyFlag.country = "Germany";
		germanyFlag.color = "Black Red Yellow";
		germanyFlag.stripes = 3;
		germanyFlag.hasSymbol = false;
		germanyFlag.size = 1.8;

		System.out.println("Updated Values:");
		System.out.println("Country = " + germanyFlag.country + " \n Color = " + germanyFlag.color + " \n stripes =" + germanyFlag.stripes
				+ "\n Symbol= " + germanyFlag.hasSymbol + "\n Size = " + germanyFlag.size + "\n");

		
		Flag franceFlag = new Flag();

		System.out.println("Default Values (France Object): ");
		System.out.println("Country = " + franceFlag.country + " \n Color = " + franceFlag.color + " \n Stripes = " + franceFlag.stripes
				+ " \n Symbol = " + franceFlag.hasSymbol + " \n Size = " + franceFlag.size + "\n");

		franceFlag.country = "France";
		franceFlag.color = "Blue White Red";
		franceFlag.stripes = 3;
		franceFlag.hasSymbol = false;
		franceFlag.size = 1.7;

		System.out.println("Updated Values:");
		System.out.println("Country = " + franceFlag.country + " \n Color = " + franceFlag.color + " \n stripes =" + franceFlag.stripes
				+ "\n Symbol= " + franceFlag.hasSymbol + "\n Size = " + franceFlag.size + "\n");
	}
}