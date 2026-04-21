class Coin{
	String country;
	String material;
	double value;
	int year;
	String shape;
	
	Coin(String country, String material, double value){
		this.country = country;
		this.material = material;
		this.value = value;
	}
	
	Coin(String country, String material, double value, int year, String shape){
		
		this(country, material, value);
		this.year = year;
		this.shape = shape;
	}
	
	void display(){
		System.out.println("country :"+this.country);
		System.out.println("material :"+this.material);
		System.out.println("value :"+this.value);
		System.out.println("year :"+this.year);
		System.out.println("shape :"+this.shape);
		System.out.println("---------------------------");
	}
}

