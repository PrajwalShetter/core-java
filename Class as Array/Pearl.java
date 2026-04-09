class Pearl{
	
	String color;
	PearlType type;
	double price;
	
	Pearl(String color, PearlType type, double price){
		
		this.color = color;
		this.type = type;
		this.price = price;
		
	}
	
	Pearl(){
		
	}
	
	public void display(){
		System.out.println("Color : "+this.color);
		System.out.println("Type : "+this.type);
		System.out.println("Price : "+this.price);
	}
}