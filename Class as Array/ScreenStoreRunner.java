class ScreenStoreRunner{
	
	public static void main(String[] aargs){
		
		Screen[] screens = new Screen[20];
		
		screens[0] = new Screen("LED","Samsung",42.00,"1920x1080",false,144,"IPS",20000.00,true,"Black");
		screens[1] = new Screen("OLED","LG",55.00,"3840x2160",true,120,"OLED",75000.00,false,"Silver");
		screens[2] = new Screen("LCD","Sony",32.00,"1366x768",false,60,"VA",18000.00,false,"Black");
		screens[3] = new Screen("LED","Dell",27.00,"1920x1080",false,75,"IPS",15000.00,false,"Black");
		screens[4] = new Screen("OLED","Apple",24.00,"4480x2520",true,60,"Retina",120000.00,false,"White");
		screens[5] = new Screen("LED","HP",21.50,"1920x1080",false,60,"TN",10000.00,false,"Black");
		screens[6] = new Screen("QLED","Samsung",65.00,"3840x2160",false,120,"VA",95000.00,true,"Black");
		screens[7] = new Screen("LED","Acer",24.00,"1920x1080",false,165,"IPS",18000.00,false,"Black");
		screens[8] = new Screen("OLED","LG",48.00,"3840x2160",true,120,"OLED",85000.00,true,"Black");
		screens[9] = new Screen("LCD","Panasonic",40.00,"1920x1080",false,60,"VA",22000.00,false,"Grey");
		screens[10] = new Screen("LED","Asus",27.00,"2560x1440",false,144,"IPS",30000.00,false,"Black");
		screens[11] = new Screen("QLED","Samsung",50.00,"3840x2160",false,120,"VA",60000.00,false,"Black");
		screens[12] = new Screen("LED","Lenovo",23.80,"1920x1080",false,75,"IPS",12000.00,false,"Black");
		screens[13] = new Screen("OLED","Sony",55.00,"3840x2160",true,120,"OLED",110000.00,false,"Black");
		screens[14] = new Screen("LCD","LG",32.00,"1366x768",false,60,"VA",17000.00,false,"White");
		screens[15] = new Screen("LED","Dell",24.00,"1920x1080",false,60,"IPS",14000.00,false,"Black");
		screens[16] = new Screen("QLED","Samsung",75.00,"3840x2160",false,120,"VA",150000.00,true,"Black");
		screens[17] = new Screen("LED","Acer",21.50,"1920x1080",false,75,"TN",9000.00,false,"Black");
		screens[18] = new Screen("OLED","LG",65.00,"3840x2160",true,120,"OLED",140000.00,true,"Black");
		screens[19] = new Screen("LED","HP",27.00,"2560x1440",false,144,"IPS",25000.00,false,"Black");
		
		ScreenStore store = new ScreenStore();
		
		for(int i=0; i<screens.length; i++){
			store.store(screens[i]);
		}
		
		store.display();
	}
}