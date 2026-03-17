/*
Declare below classes to get price by item, make sure to check 17 conditions in each method. Invoke each method 18 times, 
passing all conditions 1. Grocery 2. Gold 3. Stationary 4. Medicine 5. Gst
*/

class Grocery{
	
	static void getPriceByName(String name){
		
		System.out.println("The price of the Grocery :"+name);
		
		//teaPowder, sugar, peper, soap, paste, brush, pinuts, jagurry, biscuts, oil, jawar, Rice, wheat, coconut, honey, gee, butter
		
		if("teaPowder" == name){
			System.out.println("Price :"+15);
			return;
		}
		if("sugar" == name){
			System.out.println("Price :"+45);
			return;
			
		}
		if("peper" == name){
			System.out.println("Price :"+15);
			return;
		}
		if("soap" == name){
			System.out.println("Price :"+30);
			return;
		}
		if("paste" == name){
			System.out.println("Price :"+20);
			return;
		}
		if("brush" == name){
			System.out.println("Price :"+15);
			return;
		}
		if("pinuts" == name){
			System.out.println("Price :"+150);
			return;
		}
		if("jagurry" == name){
			System.out.println("Price :"+100);
			return;
		}
		if("biscuts" == name){
			System.out.println("Price :"+15);
			return;
		}
		if("oil" == name){
			System.out.println("Price :"+150);
			return;
		}
		if("jawar" == name){
			System.out.println("Price :"+1500);
			return;
		}
		if("Rice" == name){
			System.out.println("Price :"+1500);
			return;
		}
		
		if("wheat" == name){
			System.out.println("Price :"+750);
			return;
		}
		
		if("coconut" == name){
			System.out.println("Price :"+150);
			return;
		}
		if("honey" == name){
			System.out.println("Price :"+75);
			return;
		}
		if("gee" == name){
			System.out.println("Price :"+50);
			return;
		}
		if("butter" == name){
			System.out.println("Price :"+400);
			return;
		}
		System.out.println("No items are matched");
	}
	
	}