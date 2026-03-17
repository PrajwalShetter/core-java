class Gst{

	static void getRateByType(String type){

		System.out.println("GST rate for :"+type);

		if("cgst" == type){
			System.out.println("Rate :"+9);
			return;
		}
		if("sgst" == type){
			System.out.println("Rate :"+9);
			return;
		}
		if("igst" == type){
			System.out.println("Rate :"+18);
			return;
		}
		if("utgst" == type){
			System.out.println("Rate :"+9);
			return;
		}
		if("luxuryTax" == type){
			System.out.println("Rate :"+28);
			return;
		}
		if("foodItems" == type){
			System.out.println("Rate :"+5);
			return;
		}
		if("electronics" == type){
			System.out.println("Rate :"+18);
			return;
		}
		if("cars" == type){
			System.out.println("Rate :"+28);
			return;
		}
		if("gold" == type){
			System.out.println("Rate :"+3);
			return;
		}
		if("hotelRooms" == type){
			System.out.println("Rate :"+12);
			return;
		}
		if("textiles" == type){
			System.out.println("Rate :"+5);
			return;
		}
		if("cement" == type){
			System.out.println("Rate :"+28);
			return;
		}
		if("soap" == type){
			System.out.println("Rate :"+18);
			return;
		}
		if("toothpaste" == type){
			System.out.println("Rate :"+18);
			return;
		}
		if("biscuit" == type){
			System.out.println("Rate :"+12);
			return;
		}
		if("mobile" == type){
			System.out.println("Rate :"+18);
			return;
		}
		if("insurance" == type){
			System.out.println("Rate :"+18);
			return;
		}

		System.out.println("No items are matched");
	}
}