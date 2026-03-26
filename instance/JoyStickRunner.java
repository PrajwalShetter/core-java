class JoyStickRunner {

	public static void main(String[] args){

		JoyStick jsOne = new JoyStick();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ jsOne.brand + " \n Type = " + jsOne.type + " \n Price = " + jsOne.price + " \n Wireless = " + jsOne.wireless + " \n Compatibility = " + jsOne.compatibility+"\n");

		jsOne.brand="Sony";
		jsOne.type="DualShock";
		jsOne.price=4999;
		jsOne.wireless=true;
		jsOne.compatibility="PS4";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+jsOne.brand + " \n Type = " + jsOne.type + " \n Price =" + jsOne.price + "\n Wireless= " + jsOne.wireless + "\n Compatibility = " + jsOne.compatibility+"\n");


		JoyStick jsTwo = new JoyStick();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ jsTwo.brand + " \n Type = " + jsTwo.type + " \n Price = " + jsTwo.price + " \n Wireless = " + jsTwo.wireless + " \n Compatibility = " + jsTwo.compatibility+"\n");

		jsTwo.brand="Microsoft";
		jsTwo.type="Xbox Controller";
		jsTwo.price=5499;
		jsTwo.wireless=true;
		jsTwo.compatibility="Xbox";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+jsTwo.brand + " \n Type = " + jsTwo.type + " \n Price =" + jsTwo.price + "\n Wireless= " + jsTwo.wireless + "\n Compatibility = " + jsTwo.compatibility+"\n");


		JoyStick jsThree = new JoyStick();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ jsThree.brand + " \n Type = " + jsThree.type + " \n Price = " + jsThree.price + " \n Wireless = " + jsThree.wireless + " \n Compatibility = " + jsThree.compatibility+"\n");

		jsThree.brand="Logitech";
		jsThree.type="Gamepad";
		jsThree.price=2999;
		jsThree.wireless=false;
		jsThree.compatibility="PC";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+jsThree.brand + " \n Type = " + jsThree.type + " \n Price =" + jsThree.price + "\n Wireless= " + jsThree.wireless + "\n Compatibility = " + jsThree.compatibility+"\n");


		JoyStick jsFour = new JoyStick();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ jsFour.brand + " \n Type = " + jsFour.type + " \n Price = " + jsFour.price + " \n Wireless = " + jsFour.wireless + " \n Compatibility = " + jsFour.compatibility+"\n");

		jsFour.brand="Razer";
		jsFour.type="Wolverine";
		jsFour.price=6999;
		jsFour.wireless=true;
		jsFour.compatibility="PC/Xbox";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+jsFour.brand + " \n Type = " + jsFour.type + " \n Price =" + jsFour.price + "\n Wireless= " + jsFour.wireless + "\n Compatibility = " + jsFour.compatibility+"\n");


		JoyStick jsFive = new JoyStick();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ jsFive.brand + " \n Type = " + jsFive.type + " \n Price = " + jsFive.price + " \n Wireless = " + jsFive.wireless + " \n Compatibility = " + jsFive.compatibility+"\n");

		jsFive.brand="Nintendo";
		jsFive.type="Switch Pro";
		jsFive.price=5999;
		jsFive.wireless=true;
		jsFive.compatibility="Switch";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+jsFive.brand + " \n Type = " + jsFive.type + " \n Price =" + jsFive.price + "\n Wireless= " + jsFive.wireless + "\n Compatibility = " + jsFive.compatibility+"\n");

	}
}