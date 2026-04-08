class BurgerInfo{
	
	String shop;
	String city;
	
	BurgerInfo(String shop, String city){
		this.shop = shop;
		this.city = city;
	}
	
	public void display(){
		System.out.println("shop :"+shop);
		System.out.println("city :"+city);
	}
	
	public Burger details(){
		Burger burger = new Burger("Cheese", 150, true, 300);
		return burger;
	}
}

