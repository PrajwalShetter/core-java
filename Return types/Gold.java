class Gold{

	static void GetPriceByName(String name){
		
		System.out.println("The Price of the jewellery : "+name);
		
		//necklaces, rings, bangles, bracelets, earrings,chains, Choker, Jhumkas, EarCuffs,
//		Kada, Kundan, Navaratna, Armlet, ToeRings, RaniHaar, HasliNecklace,HaathPhool, Mangalsutra

		if("necklaces" == name){
			System.out.println("Price :"+15);
			return;
		}
		if("rings" == name){
			System.out.println("Price :"+45);
			return;
			
		}
		if("bangles" == name){
			System.out.println("Price :"+15);
			return;
		}
		if("bracelets" == name){
			System.out.println("Price :"+30);
			return;
		}
		if("earrings" == name){
			System.out.println("Price :"+20);
			return;
		}
		if("chains" == name){
			System.out.println("Price :"+15);
			return;
		}
		if("Choker" == name){
			System.out.println("Price :"+150);
			return;
		}
		if("Jhumkas" == name){
			System.out.println("Price :"+100);
			return;
		}
		if("EarCuffs" == name){
			System.out.println("Price :"+15);
			return;
		}
		if("Kundan" == name){
			System.out.println("Price :"+150);
			return;
		}
		if("Kada" == name){
			System.out.println("Price :"+1500);
			return;
		}
		if("Navaratna" == name){
			System.out.println("Price :"+1500);
			return;
		}
		
		if("ToeRings" == name){
			System.out.println("Price :"+750);
			return;
		}
		
		if("Armlet" == name){
			System.out.println("Price :"+150);
			return;
		}
		if("RaniHaar" == name){
			System.out.println("Price :"+75);
			return;
		}
		if("HasliNecklace" == name){
			System.out.println("Price :"+50);
			return;
		}
		if("HaathPhool" == name){
			System.out.println("Price :"+400);
			return;
		}
		System.out.println("No items are matched");


	}

}