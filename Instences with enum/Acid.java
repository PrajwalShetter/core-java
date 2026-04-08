class Acid{
	
	String name;
	double ph;
	boolean isStrong;
	int quantity;
	
	Acid(String name, double ph, boolean isStrong, int quantity){
		this.name = name;
		this.ph = ph;
		this.isStrong = isStrong;
		this.quantity = quantity;
	}
	
	public void display(){
		System.out.println("name :"+name);
		System.out.println("ph :"+ph);
		System.out.println("isStrong :"+isStrong);
		System.out.println("quantity :"+quantity);
	}
}

