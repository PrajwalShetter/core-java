class PlayStationRunner {

	public static void main(String[] args){

		PlayStation psOne = new PlayStation();

		System.out.println("Default Values: ");
		System.out.println("Model = "+ psOne.model + " \n Color = " + psOne.color + " \n Price = " + psOne.price + " \n VRSupport = " + psOne.hasVRSupport + " \n Storage = " + psOne.storage+"\n");

		psOne.model="PS4";
		psOne.color="Black";
		psOne.price=30000;
		psOne.hasVRSupport=true;
		psOne.storage=500;

		System.out.println("Updated Values:");
		System.out.println("Model = "+psOne.model + " \n Color = " + psOne.color + " \n Price =" + psOne.price + "\n VRSupport= " + psOne.hasVRSupport + "\n Storage = " + psOne.storage+"\n");


		PlayStation psTwo = new PlayStation();

		System.out.println("Default Values: ");
		System.out.println("Model = "+ psTwo.model + " \n Color = " + psTwo.color + " \n Price = " + psTwo.price + " \n VRSupport = " + psTwo.hasVRSupport + " \n Storage = " + psTwo.storage+"\n");

		psTwo.model="PS5";
		psTwo.color="White";
		psTwo.price=55000;
		psTwo.hasVRSupport=true;
		psTwo.storage=825;

		System.out.println("Updated Values:");
		System.out.println("Model = "+psTwo.model + " \n Color = " + psTwo.color + " \n Price =" + psTwo.price + "\n VRSupport= " + psTwo.hasVRSupport + "\n Storage = " + psTwo.storage+"\n");


		PlayStation psThree = new PlayStation();

		System.out.println("Default Values: ");
		System.out.println("Model = "+ psThree.model + " \n Color = " + psThree.color + " \n Price = " + psThree.price + " \n VRSupport = " + psThree.hasVRSupport + " \n Storage = " + psThree.storage+"\n");

		psThree.model="PS4 Slim";
		psThree.color="Black";
		psThree.price=28000;
		psThree.hasVRSupport=false;
		psThree.storage=500;

		System.out.println("Updated Values:");
		System.out.println("Model = "+psThree.model + " \n Color = " + psThree.color + " \n Price =" + psThree.price + "\n VRSupport= " + psThree.hasVRSupport + "\n Storage = " + psThree.storage+"\n");


		PlayStation psFour = new PlayStation();

		System.out.println("Default Values: ");
		System.out.println("Model = "+ psFour.model + " \n Color = " + psFour.color + " \n Price = " + psFour.price + " \n VRSupport = " + psFour.hasVRSupport + " \n Storage = " + psFour.storage+"\n");

		psFour.model="PS4 Pro";
		psFour.color="Black";
		psFour.price=35000;
		psFour.hasVRSupport=true;
		psFour.storage=1000;

		System.out.println("Updated Values:");
		System.out.println("Model = "+psFour.model + " \n Color = " + psFour.color + " \n Price =" + psFour.price + "\n VRSupport= " + psFour.hasVRSupport + "\n Storage = " + psFour.storage+"\n");


		PlayStation psFive = new PlayStation();

		System.out.println("Default Values: ");
		System.out.println("Model = "+ psFive.model + " \n Color = " + psFive.color + " \n Price = " + psFive.price + " \n VRSupport = " + psFive.hasVRSupport + " \n Storage = " + psFive.storage+"\n");

		psFive.model="PS5 Digital";
		psFive.color="White";
		psFive.price=45000;
		psFive.hasVRSupport=true;
		psFive.storage=825;

		System.out.println("Updated Values:");
		System.out.println("Model = "+psFive.model + " \n Color = " + psFive.color + " \n Price =" + psFive.price + "\n VRSupport= " + psFive.hasVRSupport + "\n Storage = " + psFive.storage+"\n");

	}
}