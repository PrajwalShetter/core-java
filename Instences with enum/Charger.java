class Charger{
	
	int capacity;
	String brand;
	boolean iswire;
	String color;
	
	Charger(int capacity, String brand, boolean iswire, String color){
		
		this.capacity = capacity;
		this.brand = brand;
		this.iswire = iswire;
		this.color = color;
	}
	
	public void display(){
		
		System.out.println("capacity :"+ this.capacity);
		System.out.println("brand :"+this.brand);
		System.out.println("iswire :"+this.iswire);
		System.out.println("color :"+this.color);
		
	}
	
}