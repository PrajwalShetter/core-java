class BulbPrice {
	
	public static void main(String[] args){
		
		String[] bulbPrices = new String[10];
		
		bulbPrices[0] = "LED = 20.0";
		bulbPrices[1] = "Philips = 30.0";
		bulbPrices[2] = "Syska = 25.5";
		bulbPrices[3] = "Havells = 35.0";
		bulbPrices[4] = "Wipro = 28.0";
		bulbPrices[5] = "Bajaj = 22.5";
		bulbPrices[6] = "Crompton = 40.0";
		bulbPrices[7] = "Surya = 18.0";
		bulbPrices[8] = "Eveready = 26.0";
		bulbPrices[9] = "Orient = 32.5";
		
		int size = bulbPrices.length;
		System.out.println("The size of the bulbPrices is :"+size);
		
		String ref = bulbPrices[2];
		System.out.println("2nd Position of the bulb price is :"+ref);
		
		ref = bulbPrices[3];
		System.out.println("3rd Position of the bulb price is :"+ref);
		
		ref = bulbPrices[5];
		System.out.println("5th Position of the bulb price is :"+ref);
		
		ref = bulbPrices[7];
		System.out.println("7th Position of the bulb price is :"+ref);
		
		ref = bulbPrices[9];
		System.out.println("9th Position of the bulb price is :"+ref);
		
		ref = bulbPrices[0];
		System.out.println("0th Position of the bulb price is :"+ref);
		
		ref = bulbPrices[1];
		System.out.println("1st Position of the bulb price is :"+ref);
		
		ref = bulbPrices[4];
		System.out.println("4th Position of the bulb price is :"+ref);
		
		
		
	}
	
}