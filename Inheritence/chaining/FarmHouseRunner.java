class FarmHouseRunner{
	
	public static void main(String[] args){
		
		LuxuryFarmHouse f1 = new LuxuryFarmHouse();
		LuxuryFarmHouse f2 = new LuxuryFarmHouse();
		
		f1.openGate();
		f1.closeGate();
		f1.waterPlants();
		f1.cleanArea();
		f1.securityCheck();
		
		System.out.println("------------------");
		
		f2.openGate();
		f2.closeGate();
		f2.waterPlants();
		f2.cleanArea();
		f2.securityCheck();
	}
}