class Refrigerator {
	static void cool(){
		System.out.println("Refrigerator is cooling food");
	}
	
	static void storeFood(){
		System.out.println("Refrigerator is Storing food");
	}
	
	static void makeIce(){
		System.out.println("Refrigerator makes Ice");
		saveEnergy();
		clean();
	}
	
	static void saveEnergy(){
		System.out.println("Energy Saving Mode");
	}
	
	static void clean(){
		System.out.println("cleaning Refrigerator");
	}
	
}