class Sand{
	
	String type;
	double weight;
	boolean isWet;
	int cost;
	
	Sand(String type, double weight, boolean isWet, int cost){
		this.type = type;
		this.weight = weight;
		this.isWet = isWet;
		this.cost = cost;
	}
	
	public void display(){
		System.out.println("type :"+type);
		System.out.println("weight :"+weight);
		System.out.println("isWet :"+isWet);
		System.out.println("cost :"+cost);
	}
}

