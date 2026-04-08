class DiamondInfo{
	
	String shop;
	String city;
	
	DiamondInfo(String shop, String city){
		this.shop = shop;
		this.city = city;
	}
	
	public void display(){
		System.out.println("shop :"+shop);
		System.out.println("city :"+city);
	}
	
	public Diamond details(){
		Diamond diamond = new Diamond("White", 2.5, true, 500000);
		return diamond;
	}
}

