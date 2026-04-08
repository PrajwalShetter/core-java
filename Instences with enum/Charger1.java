class Charger1{
	
	String origin;
	String color;
	
	Charger1(String origin, String color){
		
		this.origin = origin;
		this.color = color;
		
	}
	
	public void display(){
		
		System.out.println("origin :"+this.origin);
		System.out.println("color :"+this.color);
	}
	
	public Charger details(){
		
		Charger charger = new Charger(18,"vivo", true, "white");
		return charger;
		
	}
}