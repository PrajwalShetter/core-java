class Medicine{

	static void getPriceByName(String name){

		System.out.println("The price of the Medicine :"+name);

		if("paracetamol" == name){
			System.out.println("Price :"+20);
			return;
		}
		if("dolo" == name){
			System.out.println("Price :"+35);
			return;
		}
		if("crocin" == name){
			System.out.println("Price :"+30);
			return;
		}
		if("aspirin" == name){
			System.out.println("Price :"+25);
			return;
		}
		if("amoxicillin" == name){
			System.out.println("Price :"+80);
			return;
		}
		if("azithromycin" == name){
			System.out.println("Price :"+120);
			return;
		}
		if("cetirizine" == name){
			System.out.println("Price :"+18);
			return;
		}
		if("pantoprazole" == name){
			System.out.println("Price :"+90);
			return;
		}
		if("ibuprofen" == name){
			System.out.println("Price :"+40);
			return;
		}
		if("metformin" == name){
			System.out.println("Price :"+70);
			return;
		}
		if("ranitidine" == name){
			System.out.println("Price :"+55);
			return;
		}
		if("omeprazole" == name){
			System.out.println("Price :"+65);
			return;
		}
		if("insulin" == name){
			System.out.println("Price :"+350);
			return;
		}
		if("vitaminC" == name){
			System.out.println("Price :"+25);
			return;
		}
		if("zinc" == name){
			System.out.println("Price :"+30);
			return;
		}
		if("antacid" == name){
			System.out.println("Price :"+45);
			return;
		}
		if("ORS" == name){
			System.out.println("Price :"+22);
			return;
		}

		System.out.println("No items are matched");
	}
}