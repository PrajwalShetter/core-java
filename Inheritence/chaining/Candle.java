class Candle{
	final String color;
	final double price;
	final String shape;
	
	Candle(String color, doubles price, String shape){
		this.color = color;
		this.price = price;
		this.shape = shape;
	}
	
	void display(){
		System.out.println("Color :"+this.color);
		System.out.println("price :"+this.price);
		System.out.println("shape :"+this.shape);
		System.out.println("+++++++++++++++");
		
	}
}


