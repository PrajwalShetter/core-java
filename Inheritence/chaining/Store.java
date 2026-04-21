class Store{
	String name;
	String location;
	int noOfItems;
	double revenue;
	boolean open;
	
	Store(String name, String location, int noOfItems){
		this.name = name;
		this.location = location;
		this.noOfItems = noOfItems;
	}
	
	Store(String name, String location, int noOfItems, double revenue, boolean open){
		this(name, location, noOfItems); 
		this.revenue = revenue;
		this.open = open;
	}
	
	void display(){
		System.out.println("Name : " + this.name);
		System.out.println("Location : " + this.location);
		System.out.println("Items : " + this.noOfItems);
		System.out.println("Revenue : " + this.revenue);
		System.out.println("Open : " + this.open);
		System.out.println("----------------------");
	}
}

