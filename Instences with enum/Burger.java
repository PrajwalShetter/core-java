class Burger{
	
	String type;
	double price;
	boolean isVeg;
	int calories;
	
	Burger(String type, double price, boolean isVeg, int calories){
		this.type = type;
		this.price = price;
		this.isVeg = isVeg;
		this.calories = calories;
	}
	
	public void display(){
		System.out.println("type :"+type);
		System.out.println("price :"+price);
		System.out.println("isVeg :"+isVeg);
		System.out.println("calories :"+calories);
	}
}

