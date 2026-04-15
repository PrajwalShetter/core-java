class Silencer{
	
	String type;
	String brand;
	String material;
	double length;
	double diameter;
	double weight;
	String vehicleType;
	boolean noiseReduction;
	double price;
	String color;
	
	Silencer(String type, String brand, String material, double length, double diameter, double weight, String vehicleType, boolean noiseReduction,double price, String color){
		this.type=type;
		this.brand=brand;
		this.material=material;
		this.length=length;
		this.diameter=diameter;
		this.weight=weight;
		this.vehicleType=vehicleType;
		this.noiseReduction=noiseReduction;
		this.price=price;
		this.color=color;
			
	}
	
	void display(){
		System.out.println("================");
		System.out.println("type :"+type);
		System.out.println("brand :"+brand);
		System.out.println("material :"+material);
		System.out.println("length :"+length);
		System.out.println("diameter :"+diameter);
		System.out.println("weight :"+weight);
		System.out.println("vehicleType :"+vehicleType);
		System.out.println("noiseReduction :"+noiseReduction);
		System.out.println("price :"+price);
		System.out.println("color :"+color);
		
	
	
	}
}