class LuxuryFarmHouse extends FarmHouse{
	
	@Override
	void openGate(){
		System.out.println("Luxury farmhouse automatic gate opened");
	}
	
	@Override
	void waterPlants(){
		System.out.println("Automatic irrigation system activated");
	}
	
	@Override
	void securityCheck(){
		System.out.println("Advanced security with CCTV");
	}
}