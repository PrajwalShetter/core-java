class Leaf{

	static void properties(){

		byte leafAge = 2;
		short leafLength = 120;
		int leafArea = 450;
		long leafSerialNumber = 789456123L;
		float leafThickness = 0.2f;
		double leafMoisture = 35.5;
		char leafColorCode = 'G';
		boolean isMedicinal = true;

		System.out.println("leafAge : " + leafAge);
		System.out.println("leafLength : " + leafLength);
		System.out.println("leafArea : " + leafArea);
		System.out.println("leafSerialNumber : " + leafSerialNumber);
		System.out.println("leafThickness : " + leafThickness);
		System.out.println("leafMoisture : " + leafMoisture);
		System.out.println("leafColorCode : " + leafColorCode);
		System.out.println("isMedicinal : " + isMedicinal);
	}

	static void properties(int chlorophyllLevel,double leafWidth,char leafType,boolean isEvergreen){

		System.out.println("chlorophyllLevel = " + chlorophyllLevel);
		System.out.println("leafWidth = " + leafWidth);
		System.out.println("leafType = " + leafType);
		System.out.println("isEvergreen = " + isEvergreen);
	}
}