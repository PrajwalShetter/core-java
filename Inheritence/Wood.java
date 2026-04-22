class Wood{
	String type;
	double price;
	
	Wood(String type, double price){
		this.type = type;
		this.price = price;
	}
	
	void display(){
		System.out.println("type : " + this.type);
		System.out.println("price : " + this.price);
	}
}
