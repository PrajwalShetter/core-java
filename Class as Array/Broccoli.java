class Broccoli{
	
	String name;
	String color;
	String origin;
	double weight;
	double price;
	boolean organic;
	String type;
	int quantity;
	boolean fresh;
	String shape;
	
	Broccoli(String name, String color, String origin, double weight, double price, boolean organic, String type, int quantity, boolean fresh, String shape){
		
		this.name = name;
		this.color = color;
		this.origin = origin;
		this.weight = weight;
		this.price = price;
		this.organic = organic;
		this.type = type;
		this.quantity = quantity;
		this.fresh = fresh;
		this.shape = shape;
		
	}
	
	void display(){
		
		System.out.println("================");
		System.out.println("name :"+this.name);
		System.out.println("color :"+this.color);
		System.out.println("origin :"+this.origin);
		System.out.println("weight :"+this.weight);
		System.out.println("price :"+this.price);
		System.out.println("organic :"+this.organic);
		System.out.println("type :"+this.type);
		System.out.println("quantity :"+this.quantity);
		System.out.println("fresh :"+this.fresh);
		System.out.println("shape :"+this.shape);
		
	}
}