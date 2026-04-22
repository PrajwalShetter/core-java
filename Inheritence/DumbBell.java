class DumbBell{
	double weight;
	String material;
	
	DumbBell(double weight, String material){
		this.weight = weight;
		this.material = material;
	}
	
	void display(){
		System.out.println("weight : " + this.weight);
		System.out.println("material : " + this.material);
}
}