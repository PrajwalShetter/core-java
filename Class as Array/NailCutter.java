class NailCutter{
	
	String brand;
	CutterType type;
	double price;
	
	NailCutter(String brand, CutterType type, double price){
		
		this.brand = brand;
		this.type = type;
		this.price = price;
		
	}
	
	NailCutter(){
		
	}
	
	public void display(){
		System.out.println("Brand : "+this.brand);
		System.out.println("Type : "+this.type);
		System.out.println("Price : "+this.price);
	}
}