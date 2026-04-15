class LaserStoreRunner{
	
	public static void main(String[] args){
		
		Laser[] lasers = new Laser[20];
		
		lasers[0] = new Laser("Diode","Coherent","808nm",5.5,"Medical",true,150000.00,"Grey",true,"Air Cooling");
		lasers[1] = new Laser("Fiber","IPG","1064nm",10.0,"Industrial",false,250000.00,"Black",true,"Water Cooling");
		lasers[2] = new Laser("CO2","Trumpf","10600nm",20.0,"Cutting",false,300000.00,"White",true,"Air Cooling");
		lasers[3] = new Laser("Nd:YAG","Bosch","1064nm",8.0,"Welding",false,220000.00,"Grey",true,"Water Cooling");
		lasers[4] = new Laser("Diode","Philips","650nm",2.5,"Medical",true,80000.00,"Blue",true,"Air Cooling");
		lasers[5] = new Laser("Fiber","Raycus","1070nm",15.0,"Industrial",false,270000.00,"Black",true,"Water Cooling");
		lasers[6] = new Laser("CO2","Epilog","10600nm",18.0,"Engraving",false,260000.00,"Red",true,"Air Cooling");
		lasers[7] = new Laser("Diode","Osram","780nm",3.0,"Medical",true,90000.00,"Grey",true,"Air Cooling");
		lasers[8] = new Laser("Nd:YAG","Panasonic","1064nm",7.5,"Welding",false,210000.00,"Black",true,"Water Cooling");
		lasers[9] = new Laser("Fiber","Maxphotonics","1080nm",12.0,"Industrial",false,240000.00,"White",true,"Water Cooling");
		lasers[10] = new Laser("CO2","Universal","10600nm",22.0,"Cutting",false,320000.00,"Grey",true,"Air Cooling");
		lasers[11] = new Laser("Diode","Sharp","700nm",2.0,"Medical",true,75000.00,"Blue",true,"Air Cooling");
		lasers[12] = new Laser("Fiber","JPT","1070nm",14.0,"Industrial",false,260000.00,"Black",true,"Water Cooling");
		lasers[13] = new Laser("Nd:YAG","Hitachi","1064nm",9.0,"Welding",false,230000.00,"Silver",true,"Water Cooling");
		lasers[14] = new Laser("CO2","Trotec","10600nm",19.0,"Engraving",false,280000.00,"Red",true,"Air Cooling");
		lasers[15] = new Laser("Diode","LG","660nm",2.8,"Medical",true,82000.00,"White",true,"Air Cooling");
		lasers[16] = new Laser("Fiber","Hans","1080nm",16.0,"Industrial",false,290000.00,"Black",true,"Water Cooling");
		lasers[17] = new Laser("Nd:YAG","Mitsubishi","1064nm",8.5,"Welding",false,225000.00,"Grey",true,"Water Cooling");
		lasers[18] = new Laser("CO2","Gravotech","10600nm",21.0,"Cutting",false,310000.00,"White",true,"Air Cooling");
		lasers[19] = new Laser("Diode","Sony","750nm",3.2,"Medical",true,95000.00,"Black",true,"Air Cooling");
		
		LaserStore store = new LaserStore();
		
		for(int i=0; i<lasers.length; i++){
			store.store(lasers[i]);
		}
		
		store.display();
	}
}