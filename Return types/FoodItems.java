/*
Create below classes , then declare static method with takes a parameter and returns ref's based on conditions 
TissuePaper: thickness return the price: 10 
Tyre:  brand and size return price : 12 
WaterMelon : quantity return price : 10 
PenDrive: brand return the size: 5 
Ticket : 1. by place return ticket price : 30
		 2. by movie and seat type and theater return price: 50 
		 3. by name return email : 15 
		 4. by name return mobile number : 15 
FoodItem : by Item return price : 20

*/


class FoodItems{

	static double getPriceByItems(String item){
		
		System.out.println("Executing getPriceByItems "+item);
		
		if("dosa"==item){
			System.out.println("The Price of "+item+" is 80");
			return 80.0;
		}
		if("idli"==item){
			System.out.println("The Price of "+item +" is 40");
			return 40.0;
		}
		if("vada"==item){
			System.out.println("The Price of "+item +" is 30");
			return 30.0;
		}
		if("puri"==item){
			System.out.println("The Price of "+item +" is 50");
			return 50.0;
		}
		if("upma"==item){
			System.out.println("The Price of "+item +" is 40");
			return 40.0;
		}
		if("pongal"==item){
			System.out.println("The Price of "+item +" is 60");
			return 60.0;
		}
		if("bonda"==item){
			System.out.println("The Price of "+item +" is 25");
			return 25.0;
		}
		if("chapati"==item){
			System.out.println("The Price of "+item +" is 45");
			return 45.0;
		}
		if("paratha"==item){
			System.out.println("The Price of "+item +" is 70");
			return 70.0;
		}
		if("rice"==item){
			System.out.println("The Price of "+item +" is 100");
			return 100.0;
		}
		if("meals"==item){
			System.out.println("The Price of "+item +" is 120");
			return 120.0;
		}
		if("curdRice"==item){
			System.out.println("The Price of "+item +" is 80");
			return 80.0;
		}
		if("lemonRice"==item){
			System.out.println("The Price of "+item +" is 70");
			return 70.0;
		}
		if("puliyogare"==item){
			System.out.println("The Price of "+item +" is 75");
			return 75.0;
		}
		if("bisibelebath"==item){
			System.out.println("The Price of "+item +" is 90");
			return 90.0;
		}
		if("vegBiryani"==item){
			System.out.println("The Price of "+item +" is 130");
			return 130.0;
		}
		if("friedRice"==item){
			System.out.println("The Price of "+item +" is 110");
			return 110.0;
		}
		if("noodles"==item){
			System.out.println("The Price of "+item +" is 120");
			return 120.0;
		}
		if("gobiManchurian"==item){
			System.out.println("The Price of "+item +" is 140");
			return 140.0;
		}
		if("paneerButterMasala"==item){
			System.out.println("The Price of "+item +" is 180");
			return 180.0;
		}
		
		System.out.println("Item is not matching");
		return 0;
	}
}