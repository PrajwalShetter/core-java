class ChargerRunner{
	
	public static void main(String[] args){
		
		Charger1 charger1 = new Charger1("USA", "Green");
		charger1.display();
		
		Charger charger = charger1.details();
		charger.display();
	}
	
}