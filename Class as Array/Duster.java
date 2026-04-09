class Duster{
	
	String brand;
	DusterType type;
	double price;
	
	Duster(String brand, DusterType type, double price){
		
		this.brand = brand;
		this.type = type;
		this.price = price;
		
	}
	
	Duster(){
		
	}
	
	public void display(){
		System.out.println("Brand : "+this.brand);
		System.out.println("Type : "+this.type);
		System.out.println("Price : "+this.price);
	}
}