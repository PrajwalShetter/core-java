class Cell{

	static void cellProperties(){

		byte cellLevel = 2;
		short cellEnergy = 120;
		int cellCount = 5000;
		long cellSerialNumber = 876543219L;
		float cellSize = 1.5f;
		double cellTemperature = 36.5;
		char cellType = 'B';
		boolean isLiving = true;

		System.out.println("cellLevel : " + cellLevel);
		System.out.println("cellEnergy : " + cellEnergy);
		System.out.println("cellCount : " + cellCount);
		System.out.println("cellSerialNumber : " + cellSerialNumber);
		System.out.println("cellSize : " + cellSize);
		System.out.println("cellTemperature : " + cellTemperature);
		System.out.println("cellType : " + cellType);
		System.out.println("isLiving : " + isLiving);
	}

	static void cellProperties(int nucleusCount,double cellWidth,char cellGrade,boolean hasMembrane){

		System.out.println("nucleusCount = " + nucleusCount);
		System.out.println("cellWidth = " + cellWidth);
		System.out.println("cellGrade = " + cellGrade);
		System.out.println("hasMembrane = " + hasMembrane);
	}
}