class Laser{
	
	String type;
	String brand;
	String wavelength;
	double power;
	String application;
	boolean portable;
	double price;
	String color;
	boolean safetyCertified;
	String coolingMethod;
	
	
	Laser(String type, String brand, String wavelength, double power, String application, boolean portable, double price, String color, boolean safetyCertified, String coolingMethod){
		
		
		this.type=type;
		this.brand=brand;
		this.wavelength=wavelength;
		this.power=power;
		this.application=application;
		this.portable=portable;
		this.price=price;
		this.color=color;
		this.safetyCertified=safetyCertified;
		this.coolingMethod=coolingMethod;

	}
	
	void display(){
		
		System.out.println("==================");
		System.out.println("type :"+this.type);
		System.out.println("brand :"+this.brand);
		System.out.println("wavelength :"+this.wavelength);
		System.out.println("power :"+this.power);
		System.out.println("application :"+this.application);
		System.out.println("portable :"+this.portable);
		System.out.println("price :"+this.price);
		System.out.println("color :"+this.color);
		System.out.println("safetyCertified :"+this.safetyCertified);
		System.out.println("coolingMethod :"+this.coolingMethod);
		
		
	}
}