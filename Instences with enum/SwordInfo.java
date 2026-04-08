class SwordInfo{
	
	String origin;
	String type;
	
	SwordInfo(String origin, String type){
		this.origin = origin;
		this.type = type;
	}
	
	public void display(){
		System.out.println("origin :"+origin);
		System.out.println("type :"+type);
	}
	
	public Sword details(){
		Sword sword = new Sword("Steel", 3.5, true, 10000);
		return sword;
	}
}

