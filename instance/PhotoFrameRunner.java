class PhotoFrameRunner {

	public static void main(String[] args){

		PhotoFrame frameOne = new PhotoFrame();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ frameOne.brand + " \n Material = " + frameOne.material + " \n Price = " + frameOne.price + " \n HasGlass = " + frameOne.hasGlass + " \n Size = " + frameOne.size+"\n");

		frameOne.brand="Home Centre";
		frameOne.material="Wood";
		frameOne.price=499;
		frameOne.hasGlass=true;
		frameOne.size="Medium";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+frameOne.brand + " \n Material = " + frameOne.material + " \n Price =" + frameOne.price + "\n HasGlass= " + frameOne.hasGlass + "\n Size = " + frameOne.size+"\n");


		PhotoFrame frameTwo = new PhotoFrame();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ frameTwo.brand + " \n Material = " + frameTwo.material + " \n Price = " + frameTwo.price + " \n HasGlass = " + frameTwo.hasGlass + " \n Size = " + frameTwo.size+"\n");

		frameTwo.brand="IKEA";
		frameTwo.material="Plastic";
		frameTwo.price=299;
		frameTwo.hasGlass=false;
		frameTwo.size="Small";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+frameTwo.brand + " \n Material = " + frameTwo.material + " \n Price =" + frameTwo.price + "\n HasGlass= " + frameTwo.hasGlass + "\n Size = " + frameTwo.size+"\n");


		PhotoFrame frameThree = new PhotoFrame();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ frameThree.brand + " \n Material = " + frameThree.material + " \n Price = " + frameThree.price + " \n HasGlass = " + frameThree.hasGlass + " \n Size = " + frameThree.size+"\n");

		frameThree.brand="Amazon Basics";
		frameThree.material="Metal";
		frameThree.price=399;
		frameThree.hasGlass=true;
		frameThree.size="Large";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+frameThree.brand + " \n Material = " + frameThree.material + " \n Price =" + frameThree.price + "\n HasGlass= " + frameThree.hasGlass + "\n Size = " + frameThree.size+"\n");


		PhotoFrame frameFour = new PhotoFrame();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ frameFour.brand + " \n Material = " + frameFour.material + " \n Price = " + frameFour.price + " \n HasGlass = " + frameFour.hasGlass + " \n Size = " + frameFour.size+"\n");

		frameFour.brand="Urban Ladder";
		frameFour.material="Wood";
		frameFour.price=699;
		frameFour.hasGlass=true;
		frameFour.size="Extra Large";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+frameFour.brand + " \n Material = " + frameFour.material + " \n Price =" + frameFour.price + "\n HasGlass= " + frameFour.hasGlass + "\n Size = " + frameFour.size+"\n");


		PhotoFrame frameFive = new PhotoFrame();

		System.out.println("Default Values: ");
		System.out.println("Brand = "+ frameFive.brand + " \n Material = " + frameFive.material + " \n Price = " + frameFive.price + " \n HasGlass = " + frameFive.hasGlass + " \n Size = " + frameFive.size+"\n");

		frameFive.brand="Flipkart SmartBuy";
		frameFive.material="Plastic";
		frameFive.price=199;
		frameFive.hasGlass=false;
		frameFive.size="Medium";

		System.out.println("Updated Values:");
		System.out.println("Brand = "+frameFive.brand + " \n Material = " + frameFive.material + " \n Price =" + frameFive.price + "\n HasGlass= " + frameFive.hasGlass + "\n Size = " + frameFive.size+"\n");

	}
}