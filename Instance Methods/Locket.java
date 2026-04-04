/*
Declare below classes, then declare 10 instance variables, then init those variables using a Constructor,
 then declare a non-static method, print all the instance variables using the method. Runner, Create 3 instances using parameterized 
 const , then invoke non-static method to display info. 
 Locket, Specs,Chain,Locker, Boomer,Rocket,Xerox, SoftDrink,InkPad,Stamp,Umbrella,ArtMaterial,Tyre,WindShield,ThinkPad
 
 declare 5 over-loaded constructors from prev task, create instances using each constructor and invoke method display 
 */
 
 class Locket{
	 
	 String material;
	 String color;
	 double weight;
	 double price;
	 String shape;
	 String designPattern;
	 boolean hasGemStone;
	 String gemStoneType;
	 double size;
	 String brand;
	 
	 Locket(String material, String color, double weight, double price, String shape, String designPattern, boolean hasGemStone,
	 String gemStoneType,double size, String brand){
		 
		 this.material=material;
		 this.color = color;
		 this. weight = weight;
		 this.price = price;
		 this.shape = shape;
		 this.designPattern = designPattern;
		 this.hasGemStone = hasGemStone;
		 this.gemStoneType = gemStoneType;
		 this.size = size;
		 this.brand = brand;
		 
	 }
	 
	
Locket(String material, String color){
    this.material = material;
    this.color = color;
}


Locket(double price, String brand){
    this.price = price;
    this.brand = brand;
}


Locket(String shape){
    this.shape = shape;
}
	 

	 void show(){
		 
		System.out.println("Material :"+material);
		System.out.println("color :"+color);
		System.out.println("weight :"+weight);
		System.out.println("price :"+price);
		System.out.println("shape :"+shape);
		System.out.println("designPattern :"+designPattern);
		System.out.println("hasGemStone :"+hasGemStone);
		System.out.println("gemStoneType :"+gemStoneType);
		System.out.println("size :"+size);
		System.out.println("brand :"+brand);
		System.out.println("\n");
		
		 
		 
		 
	 }
 }