class CupRunner {

	public static void main(String[] args){

		Cup cupOne = new Cup();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ cupOne.brand + " \n Material = " + cupOne.material + " \n Price = " + cupOne.price + " \n Reusable = " + cupOne.isReusable + " \n Color = " + cupOne.color+"\n");

		cupOne.brand="Cello";
		cupOne.material="Plastic";
		cupOne.price=99;
		cupOne.isReusable=true;
		cupOne.color="Red";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+cupOne.brand + " \n Material = " + cupOne.material + " \n Price =" + cupOne.price + "\n Reusable= " + cupOne.isReusable + "\n Color = " + cupOne.color+"\n");


		Cup cupTwo = new Cup();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ cupTwo.brand + " \n Material = " + cupTwo.material + " \n Price = " + cupTwo.price + " \n Reusable = " + cupTwo.isReusable + " \n Color = " + cupTwo.color+"\n");

		cupTwo.brand="Milton";
		cupTwo.material="Steel";
		cupTwo.price=199;
		cupTwo.isReusable=true;
		cupTwo.color="Silver";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+cupTwo.brand + " \n Material = " + cupTwo.material + " \n Price =" + cupTwo.price + "\n Reusable= " + cupTwo.isReusable + "\n Color = " + cupTwo.color+"\n");


		Cup cupThree = new Cup();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ cupThree.brand + " \n Material = " + cupThree.material + " \n Price = " + cupThree.price + " \n Reusable = " + cupThree.isReusable + " \n Color = " + cupThree.color+"\n");

		cupThree.brand="Tupperware";
		cupThree.material="Plastic";
		cupThree.price=299;
		cupThree.isReusable=true;
		cupThree.color="Blue";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+cupThree.brand + " \n Material = " + cupThree.material + " \n Price =" + cupThree.price + "\n Reusable= " + cupThree.isReusable + "\n Color = " + cupThree.color+"\n");


		Cup cupFour = new Cup();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ cupFour.brand + " \n Material = " + cupFour.material + " \n Price = " + cupFour.price + " \n Reusable = " + cupFour.isReusable + " \n Color = " + cupFour.color+"\n");

		cupFour.brand="Prestige";
		cupFour.material="Glass";
		cupFour.price=149;
		cupFour.isReusable=true;
		cupFour.color="Transparent";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+cupFour.brand + " \n Material = " + cupFour.material + " \n Price =" + cupFour.price + "\n Reusable= " + cupFour.isReusable + "\n Color = " + cupFour.color+"\n");


		Cup cupFive = new Cup();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ cupFive.brand + " \n Material = " + cupFive.material + " \n Price = " + cupFive.price + " \n Reusable = " + cupFive.isReusable + " \n Color = " + cupFive.color+"\n");

		cupFive.brand="Borossil";
		cupFive.material="Glass";
		cupFive.price=249;
		cupFive.isReusable=true;
		cupFive.color="White";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+cupFive.brand + " \n Material = " + cupFive.material + " \n Price =" + cupFive.price + "\n Reusable= " + cupFive.isReusable + "\n Color = " + cupFive.color+"\n");

	}
}