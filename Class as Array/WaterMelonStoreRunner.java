class WaterMelonStoreRunner{
	
	public static void main(String... args){
		
		WaterMelon[] watermelons = new WaterMelon[20];
		
		watermelons[0] = new WaterMelon("green", "bidar", "India", "oval", 35.00,4.5,1.80,true,true,false);
		watermelons[1] = new WaterMelon("dark green", "gulbarga", "India", "round", 50.00,6.5,2.20,true,false,false);
		watermelons[2] = new WaterMelon("light green", "raichur", "India", "oval", 30.00,3.8,1.50,true,true,true);
		watermelons[3] = new WaterMelon("striped", "mysore", "India", "round", 45.00,5.2,2.00,true,false,true);
		watermelons[4] = new WaterMelon("yellow", "hassan", "India", "oval", 55.00,6.0,2.30,false,true,false);
		watermelons[5] = new WaterMelon("green", "tumkur", "India", "round", 40.00,4.8,1.90,true,true,false);
		watermelons[6] = new WaterMelon("dark", "bellary", "India", "oval", 60.00,7.0,2.50,true,false,false);
		watermelons[7] = new WaterMelon("light", "davangere", "India", "round", 28.00,3.5,1.40,true,true,true);
		watermelons[8] = new WaterMelon("striped", "shivamogga", "India", "oval", 48.00,5.5,2.10,false,false,true);
		watermelons[9] = new WaterMelon("green", "udupi", "India", "round", 38.00,4.2,1.70,true,true,false);
		watermelons[10] = new WaterMelon("yellow", "mangalore", "India", "oval", 52.00,6.2,2.40,false,true,true);
		watermelons[11] = new WaterMelon("dark green", "chitradurga", "India", "round", 47.00,5.0,2.00,true,false,false);
		watermelons[12] = new WaterMelon("light green", "kolar", "India", "oval", 33.00,4.0,1.60,true,true,false);
		watermelons[13] = new WaterMelon("striped", "chikkaballapur", "India", "round", 44.00,5.3,2.05,false,false,true);
		watermelons[14] = new WaterMelon("green", "mandya", "India", "oval", 36.00,4.6,1.85,true,true,false);
		watermelons[15] = new WaterMelon("yellow", "kodagu", "India", "round", 58.00,6.8,2.45,false,true,true);
		watermelons[16] = new WaterMelon("dark", "bagalkot", "India", "oval", 62.00,7.2,2.60,true,false,false);
		watermelons[17] = new WaterMelon("light", "yadgir", "India", "round", 29.00,3.7,1.45,true,true,true);
		watermelons[18] = new WaterMelon("striped", "vijayapura", "India", "oval", 49.00,5.6,2.15,false,false,true);
		watermelons[19] = new WaterMelon("green", "hubli", "India", "round", 39.00,4.3,1.75,true,true,false);
		
		WaterMelonStore store = new WaterMelonStore();
		
		for(int i = 0; i < watermelons.length; i++){
			store.store(watermelons[i]);
	
		}
		
		store.display();
		
	}
}