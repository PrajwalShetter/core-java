class WaterMelon{

	static double getPriceByQuantity(int quantity){

		System.out.println("Executing getPriceByQuantity "+quantity);

		if(quantity == 1){
			System.out.println("The Price for "+quantity+" WaterMelon is 40");
			return 40.0;
		}
		if(quantity == 2){
			System.out.println("The Price for "+quantity+" WaterMelon is 75");
			return 75.0;
		}
		if(quantity == 3){
			System.out.println("The Price for "+quantity+" WaterMelon is 110");
			return 110.0;
		}
		if(quantity == 4){
			System.out.println("The Price for "+quantity+" WaterMelon is 140");
			return 140.0;
		}
		if(quantity == 5){
			System.out.println("The Price for "+quantity+" WaterMelon is 170");
			return 170.0;
		}
		if(quantity == 6){
			System.out.println("The Price for "+quantity+" WaterMelon is 200");
			return 200.0;
		}
		if(quantity == 7){
			System.out.println("The Price for "+quantity+" WaterMelon is 230");
			return 230.0;
		}
		if(quantity == 8){
			System.out.println("The Price for "+quantity+" WaterMelon is 260");
			return 260.0;
		}
		if(quantity == 9){
			System.out.println("The Price for "+quantity+" WaterMelon is 290");
			return 290.0;
		}
		if(quantity == 10){
			System.out.println("The Price for "+quantity+" WaterMelon is 320");
			return 320.0;
		}

		System.out.println("Quantity is not matching");
		return 0;
	}
}