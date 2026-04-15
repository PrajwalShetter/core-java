class SilencerStoreRunner{
	
	public static void main(String[] args){
		
		Silencer[] silencers = new Silencer[20];
		
		silencers[0] = new Silencer("Exhaust","Bosch","Stainless Steel",45.5,10.2,3.8,"Bike",true,3500.00,"Silver");
		silencers[1] = new Silencer("Performance","Yamaha","Alloy Steel",40.0,9.5,3.2,"Bike",true,4200.00,"Black");
		silencers[2] = new Silencer("Standard","Honda","Mild Steel",42.0,10.0,3.5,"Car",true,3000.00,"Grey");
		silencers[3] = new Silencer("Sport","Suzuki","Titanium",38.0,8.5,2.8,"Bike",true,5500.00,"Black");
		silencers[4] = new Silencer("Heavy Duty","Tata","Iron",50.0,12.0,5.0,"Truck",true,6000.00,"Silver");
		silencers[5] = new Silencer("Exhaust","Hero","Steel",43.0,9.8,3.6,"Bike",true,2800.00,"Black");
		silencers[6] = new Silencer("Performance","KTM","Alloy",39.5,9.0,3.0,"Bike",true,4800.00,"Orange");
		silencers[7] = new Silencer("Standard","Mahindra","Steel",47.0,11.5,4.5,"Car",true,3500.00,"Grey");
		silencers[8] = new Silencer("Sport","TVS","Titanium",37.0,8.0,2.5,"Bike",true,5200.00,"Black");
		silencers[9] = new Silencer("Heavy Duty","Ashok Leyland","Iron",52.0,13.0,5.5,"Truck",true,7000.00,"Silver");
		silencers[10] = new Silencer("Exhaust","Bajaj","Steel",44.0,10.1,3.7,"Bike",true,2900.00,"Black");
		silencers[11] = new Silencer("Performance","Royal Enfield","Alloy",46.0,10.5,4.0,"Bike",true,6500.00,"Chrome");
		silencers[12] = new Silencer("Standard","Hyundai","Mild Steel",41.0,9.7,3.4,"Car",true,3100.00,"Grey");
		silencers[13] = new Silencer("Sport","BMW","Titanium",36.5,8.3,2.6,"Bike",true,8000.00,"Black");
		silencers[14] = new Silencer("Heavy Duty","Volvo","Iron",53.0,13.5,5.8,"Truck",true,9000.00,"Silver");
		silencers[15] = new Silencer("Exhaust","Ford","Steel",45.0,10.0,3.9,"Car",true,3300.00,"Grey");
		silencers[16] = new Silencer("Performance","Audi","Alloy",48.0,11.0,4.2,"Car",true,8500.00,"Black");
		silencers[17] = new Silencer("Standard","Nissan","Steel",42.5,9.9,3.6,"Car",true,3000.00,"Grey");
		silencers[18] = new Silencer("Sport","Kawasaki","Titanium",37.5,8.4,2.7,"Bike",true,7200.00,"Green");
		silencers[19] = new Silencer("Heavy Duty","Eicher","Iron",51.0,12.8,5.3,"Truck",true,7500.00,"Silver");
		
		SilencerStore store = new SilencerStore();
		
		for(int i=0; i<silencers.length; i++){
			store.store(silencers[i]);
		}
		
		store.display();
	}
}