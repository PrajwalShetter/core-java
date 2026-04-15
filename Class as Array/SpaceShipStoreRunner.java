class SpaceShipStoreRunner{
	
	public static void main(String[] args){
		
		SpaceShip[] ships = new SpaceShip[20];
		
		ships[0] = new SpaceShip("Apollo","USA","Manned",28000.0,30000.5,3,false,95000.0,"Lunar","1969");
		ships[1] = new SpaceShip("Chandrayaan","India","Unmanned",25000.0,25000.0,0,false,80000.0,"Moon","2008");
		ships[2] = new SpaceShip("Voyager","USA","Unmanned",17000.0,15000.0,0,false,60000.0,"Deep Space","1977");
		ships[3] = new SpaceShip("Falcon","USA","Reusable",30000.0,35000.0,7,true,120000.0,"Satellite","2018");
		ships[4] = new SpaceShip("Gaganyaan","India","Manned",27000.0,28000.0,3,true,90000.0,"Orbital","2025");
		ships[5] = new SpaceShip("Soyuz","Russia","Manned",26000.0,29000.0,3,false,85000.0,"ISS","1967");
		ships[6] = new SpaceShip("Shenzhou","China","Manned",26500.0,30000.0,3,false,87000.0,"Space Station","2003");
		ships[7] = new SpaceShip("Dragon","USA","Reusable",31000.0,33000.0,4,true,110000.0,"ISS","2020");
		ships[8] = new SpaceShip("New Shepard","USA","Reusable",15000.0,20000.0,6,true,70000.0,"Suborbital","2021");
		ships[9] = new SpaceShip("Artemis","USA","Manned",29000.0,34000.0,4,true,100000.0,"Moon","2024");
		ships[10] = new SpaceShip("PSLV","India","Unmanned",24000.0,27000.0,0,false,78000.0,"Satellite","1993");
		ships[11] = new SpaceShip("GSLV","India","Unmanned",26000.0,31000.0,0,false,85000.0,"Satellite","2001");
		ships[12] = new SpaceShip("Starship","USA","Reusable",32000.0,50000.0,100,true,200000.0,"Mars","2026");
		ships[13] = new SpaceShip("Hubble","USA","Unmanned",20000.0,11000.0,0,false,50000.0,"Telescope","1990");
		ships[14] = new SpaceShip("Sputnik","USSR","Unmanned",18000.0,10000.0,0,false,40000.0,"Earth Orbit","1957");
		ships[15] = new SpaceShip("Tiangong","China","Unmanned",22000.0,26000.0,0,false,75000.0,"Space Lab","2011");
		ships[16] = new SpaceShip("Orion","USA","Manned",28500.0,32000.0,4,true,95000.0,"Deep Space","2023");
		ships[17] = new SpaceShip("Viking","USA","Unmanned",21000.0,14000.0,0,false,55000.0,"Mars","1975");
		ships[18] = new SpaceShip("Buran","Russia","Reusable",30000.0,36000.0,6,true,115000.0,"Orbital","1988");
		ships[19] = new SpaceShip("Dream Chaser","USA","Reusable",29500.0,34000.0,7,true,105000.0,"Cargo","2022");
		
		SpaceShipStore store = new SpaceShipStore();
		
		for(int i=0; i<ships.length; i++){
			store.store(ships[i]);
		}
		
		store.display();
	}
}