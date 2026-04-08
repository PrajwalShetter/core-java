class BurgerRunner{
	public static void main(String... args){
		BurgerInfo info = new BurgerInfo("McD", "Bangalore");
		info.display();
		Burger burger = info.details();
		burger.display();
	}
}