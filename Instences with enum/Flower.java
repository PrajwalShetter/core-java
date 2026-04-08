class Flower{
	
	String name;
	String color;
	boolean isFragrant;
	int price;
	
	Flower(String name, String color, boolean isFragrant, int price){
		this.name = name;
		this.color = color;
		this.isFragrant = isFragrant;
		this.price = price;
	}
	
	public void display(){
		System.out.println("name :"+name);
		System.out.println("color :"+color);
		System.out.println("isFragrant :"+isFragrant);
		System.out.println("price :"+price);
	}
}

