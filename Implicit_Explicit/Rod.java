//Declare below classes , then declare two methods 1. Method with no parameters, store 8 variables, then print it
// 2. Method with parameters, least 4, print it Invoke the methods , by passing implicit reference and explicit 
//reference Rod, Thread, Chip, Screw, Toy, Leaf, Trophy, Cell, Bat, Stick.

class Rod{

	static void specifications(){

		byte rodGrade = 5;
		short rodCode = 1200;
		int rodLength = 5000;
		long rodSerialNumber = 987654321L;
		float rodWeight = 2.5f;
		double rodDensity = 7.85;
		char rodQuality = 'A';
		boolean isFlexible = true;

		System.out.println("rodGrade : " + rodGrade);
		System.out.println("rodCode : " + rodCode);
		System.out.println("rodLength : " + rodLength);
		System.out.println("rodSerialNumber : " + rodSerialNumber);
		System.out.println("rodWeight : " + rodWeight);
		System.out.println("rodDensity : " + rodDensity);
		System.out.println("rodQuality : " + rodQuality);
		System.out.println("isFlexible : " + isFlexible);
	}

	static void specifications(int loadCapacity, double corrosionResistance, char rodType, boolean isHeatResistant){

		System.out.println("loadCapacity = " + loadCapacity);
		System.out.println("corrosionResistance = " + corrosionResistance);
		System.out.println("rodType = " + rodType);
		System.out.println("isHeatResistant = " + isHeatResistant);
	}
}