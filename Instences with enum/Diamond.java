class Diamond{
	
	String color;
	double weight;
	boolean isOriginal;
	int price;
	
	Diamond(String color, double weight, boolean isOriginal, int price){
		this.color = color;
		this.weight = weight;
		this.isOriginal = isOriginal;
		this.price = price;
	}
	
	public void display(){
		System.out.println("color :"+color);
		System.out.println("weight :"+weight);
		System.out.println("isOriginal :"+isOriginal);
		System.out.println("price :"+price);
	}
}

