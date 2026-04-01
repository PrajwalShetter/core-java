/*
Declare below class types, then declare 10 instance variables, then declare a constructor to init all the instance variables
 using this keyword. 
 In Runner, Create 25 instances of each class, init variables using declared constructor, then print the variables using reference 
 Stump,FishTank,VRBox,Wheel,DumbBells,BarBell,Bell,AsianPaint,Rock,ThreadMill,IPL,IPLTeam 
 READ : this keyword, constructor's
 */
 
 
 class Stump{
	 
	 String brand = "BlackRock";
	 String color = "black";
	 int cost = 45000;
	 String origin = "USA";
	 boolean camera = true;
	 long id = 7890245L;
	 String material = "fiber";
	 double weight = 4;
	 double length = 2.8;
	 double sharpness = 5.5;
	 
	 Stump(String brand, String color, int cost, String origin, boolean camera, long id, String material, double weight, double length, double sharpness ){
		this.brand = brand;
		this. color = color;
		this.cost = cost;
		this.origin = origin;
		this.camera = camera;
		this.id = id;
		this.material = material;
		this.weight = weight;
		this.length = length;
		this.sharpness = sharpness;
		 
	 }
	 
	 
 }