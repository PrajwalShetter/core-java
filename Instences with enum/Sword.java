class Sword{
	
	String material;
	double length;
	boolean isSharp;
	int price;
	
	Sword(String material, double length, boolean isSharp, int price){
		this.material = material;
		this.length = length;
		this.isSharp = isSharp;
		this.price = price;
	}
	
	public void display(){
		System.out.println("material :"+material);
		System.out.println("length :"+length);
		System.out.println("isSharp :"+isSharp);
		System.out.println("price :"+price);
	}
}

