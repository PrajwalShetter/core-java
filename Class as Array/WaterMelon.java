/*
Declare below classes with 10 instance variables and init how ever you want.Add an instance method to display all instance variables ; 

WaterMelon, Screen, Silencer,Tissue,Laser,Cricket,SpaceShip,Broccoli,Glove,Movie 

Declare Store Classes for each above classes, then perform save and displayAll methods. Make Sure the range of array is 20
*/

class WaterMelon{
	
	String color;
	String grownLocation;
	String origin;
	String shape;
	double price;
	double sugarContent;
	double quantity;
	boolean issweet;
	boolean isseed;
	boolean isquality;
	
	
	WaterMelon(String color, String grownLocation, String origin, String Shape, double price, double sugarContent, double quantity,boolean issweet,
				boolean isseed, boolean isquality){
					
					this.color = color;
					this.grownLocation = grownLocation;
					this.origin = origin;
					this.shape = shape;
					this.price = price;
					this.sugarContent = sugarContent;
					this.quantity = quantity;
					this.issweet = issweet;
					this.isseed = isseed;
					this.isquality = isquality;
				}
				
				
	void display(){
		System.out.println("===============================");
		System.out.println("Color :"+this.color);
		System.out.println("grownLocation :"+this.grownLocation);
		System.out.println("origin :"+this.origin);
		System.out.println("shape :"+this.shape);
		System.out.println("price :"+this.price);
		System.out.println("sugarContent :"+this.sugarContent);
		System.out.println("quantity :"+this.quantity);
		System.out.println("issweet :"+this.issweet);
		System.out.println("isseed :"+this.isseed);
		System.out.println("isquality :"+this.isseed);
	}
}