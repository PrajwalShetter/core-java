class Glove{
	
	String type;
	String brand;
	String material;
	String size;
	String color;
	double price;
	boolean waterproof;
	boolean insulated;
	String usage;
	int quantity;
	
	Glove(String type, String brand, String material, String size, String color, double price, boolean waterproof, boolean insulated, String usage, int quantity){
		
		this.type = type;
		this.brand = brand;
		this.material = material;
		this.size = size;
		this.color = color;
		this.price = price;
		this.waterproof = waterproof;
		this.insulated = insulated;
		this.usage = usage;
		this.quantity = quantity;
		
	}
	
	void display(){
		
		System.out.println("================");
		System.out.println("type :"+this.type);
		System.out.println("brand :"+this.brand);
		System.out.println("material :"+this.material);
		System.out.println("size :"+this.size);
		System.out.println("color :"+this.color);
		System.out.println("price :"+this.price);
		System.out.println("waterproof :"+this.waterproof);
		System.out.println("insulated :"+this.insulated);
		System.out.println("usage :"+this.usage);
		System.out.println("quantity :"+this.quantity);
		
	}
}