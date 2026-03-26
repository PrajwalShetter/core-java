class CapRunner {

	public static void main(String[] args){

		Cap c1 = new Cap();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ c1.brand + " \n Color = " + c1.color + " \n Price = " + c1.price + " \n Adjustable = " + c1.isAdjustable + " \n Size = " + c1.size+"\n");

		c1.brand="Nike";
		c1.color="Black";
		c1.price=799;
		c1.isAdjustable=true;
		c1.size="M";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+c1.brand + " \n Color = " + c1.color + " \n Price =" + c1.price + "\n Adjustable= " + c1.isAdjustable + "\n Size = " + c1.size+"\n");


		Cap c2 = new Cap();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ c2.brand + " \n Color = " + c2.color + " \n Price = " + c2.price + " \n Adjustable = " + c2.isAdjustable + " \n Size = " + c2.size+"\n");

		c2.brand="Adidas";
		c2.color="Blue";
		c2.price=699;
		c2.isAdjustable=true;
		c2.size="L";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+c2.brand + " \n Color = " + c2.color + " \n Price =" + c2.price + "\n Adjustable= " + c2.isAdjustable + "\n Size = " + c2.size+"\n");


		Cap c3 = new Cap();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ c3.brand + " \n Color = " + c3.color + " \n Price = " + c3.price + " \n Adjustable = " + c3.isAdjustable + " \n Size = " + c3.size+"\n");

		c3.brand="Puma";
		c3.color="Red";
		c3.price=599;
		c3.isAdjustable=false;
		c3.size="S";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+c3.brand + " \n Color = " + c3.color + " \n Price =" + c3.price + "\n Adjustable= " + c3.isAdjustable + "\n Size = " + c3.size+"\n");


		Cap c4 = new Cap();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ c4.brand + " \n Color = " + c4.color + " \n Price = " + c4.price + " \n Adjustable = " + c4.isAdjustable + " \n Size = " + c4.size+"\n");

		c4.brand="Reebok";
		c4.color="White";
		c4.price=499;
		c4.isAdjustable=true;
		c4.size="M";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+c4.brand + " \n Color = " + c4.color + " \n Price =" + c4.price + "\n Adjustable= " + c4.isAdjustable + "\n Size = " + c4.size+"\n");


		Cap c5 = new Cap();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ c5.brand + " \n Color = " + c5.color + " \n Price = " + c5.price + " \n Adjustable = " + c5.isAdjustable + " \n Size = " + c5.size+"\n");

		c5.brand="Under Armour";
		c5.color="Green";
		c5.price=899;
		c5.isAdjustable=false;
		c5.size="XL";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+c5.brand + " \n Color = " + c5.color + " \n Price =" + c5.price + "\n Adjustable= " + c5.isAdjustable + "\n Size = " + c5.size+"\n");

	}
}