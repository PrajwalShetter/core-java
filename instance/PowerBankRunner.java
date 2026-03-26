class PowerBankRunner {

	public static void main(String[] args){

		PowerBank pbOne = new PowerBank();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ pbOne.brand + " \n Capacity = " + pbOne.capacity + " \n Price = " + pbOne.price + " \n FastCharging = " + pbOne.fastCharging + " \n Color = " + pbOne.color+"\n");

		pbOne.brand="Mi";
		pbOne.capacity=10000;
		pbOne.price=999;
		pbOne.fastCharging=true;
		pbOne.color="Black";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+pbOne.brand + " \n Capacity = " + pbOne.capacity + " \n Price =" + pbOne.price + "\n FastCharging= " + pbOne.fastCharging + "\n Color = " + pbOne.color+"\n");


		PowerBank pbTwo = new PowerBank();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ pbTwo.brand + " \n Capacity = " + pbTwo.capacity + " \n Price = " + pbTwo.price + " \n FastCharging = " + pbTwo.fastCharging + " \n Color = " + pbTwo.color+"\n");

		pbTwo.brand="Realme";
		pbTwo.capacity=20000;
		pbTwo.price=1499;
		pbTwo.fastCharging=true;
		pbTwo.color="Blue";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+pbTwo.brand + " \n Capacity = " + pbTwo.capacity + " \n Price =" + pbTwo.price + "\n FastCharging= " + pbTwo.fastCharging + "\n Color = " + pbTwo.color+"\n");


		PowerBank pbThree = new PowerBank();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ pbThree.brand + " \n Capacity = " + pbThree.capacity + " \n Price = " + pbThree.price + " \n FastCharging = " + pbThree.fastCharging + " \n Color = " + pbThree.color+"\n");

		pbThree.brand="Ambrane";
		pbThree.capacity=15000;
		pbThree.price=1299;
		pbThree.fastCharging=false;
		pbThree.color="White";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+pbThree.brand + " \n Capacity = " + pbThree.capacity + " \n Price =" + pbThree.price + "\n FastCharging= " + pbThree.fastCharging + "\n Color = " + pbThree.color+"\n");


		PowerBank pbFour = new PowerBank();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ pbFour.brand + " \n Capacity = " + pbFour.capacity + " \n Price = " + pbFour.price + " \n FastCharging = " + pbFour.fastCharging + " \n Color = " + pbFour.color+"\n");

		pbFour.brand="Boat";
		pbFour.capacity=10000;
		pbFour.price=899;
		pbFour.fastCharging=true;
		pbFour.color="Red";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+pbFour.brand + " \n Capacity = " + pbFour.capacity + " \n Price =" + pbFour.price + "\n FastCharging= " + pbFour.fastCharging + "\n Color = " + pbFour.color+"\n");


		PowerBank pbFive = new PowerBank();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ pbFive.brand + " \n Capacity = " + pbFive.capacity + " \n Price = " + pbFive.price + " \n FastCharging = " + pbFive.fastCharging + " \n Color = " + pbFive.color+"\n");

		pbFive.brand="Syska";
		pbFive.capacity=20000;
		pbFive.price=1399;
		pbFive.fastCharging=true;
		pbFive.color="Grey";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+pbFive.brand + " \n Capacity = " + pbFive.capacity + " \n Price =" + pbFive.price + "\n FastCharging= " + pbFive.fastCharging + "\n Color = " + pbFive.color+"\n");

	}
}