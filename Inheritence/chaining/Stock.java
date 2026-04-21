class Stock{
	String companyName;
	double price;
	int quantity;
	String exchange;
	boolean active;

	Stock(String companyName, double price, int quantity, String exchange, boolean active){
		this.companyName = companyName;
		this.price = price;
		this.quantity = quantity;
		this.exchange = exchange;
		this.active = active;
	}
	
	void display(){
		System.out.println("companyName :"+this.companyName);
		System.out.println("price :"+this.price);
		System.out.println("quantity :"+this.quantity);
		System.out.println("exchange :"+this.exchange);
		System.out.println("active :"+this.active);
		System.out.println("==================");
		
	}
}


