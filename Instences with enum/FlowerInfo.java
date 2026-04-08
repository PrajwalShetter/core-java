class FlowerInfo{
	
	String garden;
	String season;
	
	FlowerInfo(String garden, String season){
		this.garden = garden;
		this.season = season;
	}
	
	public void display(){
		System.out.println("garden :"+garden);
		System.out.println("season :"+season);
	}
	
	public Flower details(){
		Flower flower = new Flower("Rose", "Red", true, 20);
		return flower;
	}
}

