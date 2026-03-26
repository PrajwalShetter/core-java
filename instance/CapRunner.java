class CapRunner {

	public static void main(String[] args){

		Cap nikeCap = new Cap();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ nikeCap.brand + " \n Color = " + nikeCap.color + " \n Price = " + nikeCap.price + " \n Adjustable = " + nikeCap.isAdjustable + " \n Size = " + nikeCap.size+"\n");

		nikeCap.brand="Nike";
		nikeCap.color="Black";
		nikeCap.price=799;
		nikeCap.isAdjustable=true;
		nikeCap.size="M";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+nikeCap.brand + " \n Color = " + nikeCap.color + " \n Price =" + nikeCap.price + "\n Adjustable= " + nikeCap.isAdjustable + "\n Size = " + nikeCap.size+"\n");


		Cap adidasCap = new Cap();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ adidasCap.brand + " \n Color = " + adidasCap.color + " \n Price = " + adidasCap.price + " \n Adjustable = " + adidasCap.isAdjustable + " \n Size = " + adidasCap.size+"\n");

		adidasCap.brand="Adidas";
		adidasCap.color="Blue";
		adidasCap.price=699;
		adidasCap.isAdjustable=true;
		adidasCap.size="L";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+adidasCap.brand + " \n Color = " + adidasCap.color + " \n Price =" + adidasCap.price + "\n Adjustable= " + adidasCap.isAdjustable + "\n Size = " + adidasCap.size+"\n");


		Cap pumaCap = new Cap();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ pumaCap.brand + " \n Color = " + pumaCap.color + " \n Price = " + pumaCap.price + " \n Adjustable = " + pumaCap.isAdjustable + " \n Size = " + pumaCap.size+"\n");

		pumaCap.brand="Puma";
		pumaCap.color="Red";
		pumaCap.price=599;
		pumaCap.isAdjustable=false;
		pumaCap.size="S";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+pumaCap.brand + " \n Color = " + pumaCap.color + " \n Price =" + pumaCap.price + "\n Adjustable= " + pumaCap.isAdjustable + "\n Size = " + pumaCap.size+"\n");


		Cap reebokCap = new Cap();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ reebokCap.brand + " \n Color = " + reebokCap.color + " \n Price = " + reebokCap.price + " \n Adjustable = " + reebokCap.isAdjustable + " \n Size = " + reebokCap.size+"\n");

		reebokCap.brand="Reebok";
		reebokCap.color="White";
		reebokCap.price=499;
		reebokCap.isAdjustable=true;
		reebokCap.size="M";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+reebokCap.brand + " \n Color = " + reebokCap.color + " \n Price =" + reebokCap.price + "\n Adjustable= " + reebokCap.isAdjustable + "\n Size = " + reebokCap.size+"\n");


		Cap underArmourCap = new Cap();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ underArmourCap.brand + " \n Color = " + underArmourCap.color + " \n Price = " + underArmourCap.price + " \n Adjustable = " + underArmourCap.isAdjustable + " \n Size = " + underArmourCap.size+"\n");

		underArmourCap.brand="Under Armour";
		underArmourCap.color="Green";
		underArmourCap.price=899;
		underArmourCap.isAdjustable=false;
		underArmourCap.size="XL";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+underArmourCap.brand + " \n Color = " + underArmourCap.color + " \n Price =" + underArmourCap.price + "\n Adjustable= " + underArmourCap.isAdjustable + "\n Size = " + underArmourCap.size+"\n");

	}
}