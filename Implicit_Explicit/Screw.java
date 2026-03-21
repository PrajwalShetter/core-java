class Screw{

	static void specifications(){

		byte screwSize = 6;
		short screwCode = 240;
		int screwLength = 80;
		long screwSerialNumber = 987654321L;
		float screwWeight = 0.5f;
		double screwDiameter = 3.5;
		char screwGrade = 'A';
		boolean isRustResistant = true;

		System.out.println("screwSize : " + screwSize);
		System.out.println("screwCode : " + screwCode);
		System.out.println("screwLength : " + screwLength);
		System.out.println("screwSerialNumber : " + screwSerialNumber);
		System.out.println("screwWeight : " + screwWeight);
		System.out.println("screwDiameter : " + screwDiameter);
		System.out.println("screwGrade : " + screwGrade);
		System.out.println("isRustResistant : " + isRustResistant);
	}

	static void specifications(int loadCapacity,double threadPitch,char screwType,boolean isMagnetic){

		System.out.println("loadCapacity = " + loadCapacity);
		System.out.println("threadPitch = " + threadPitch);
		System.out.println("screwType = " + screwType);
		System.out.println("isMagnetic = " + isMagnetic);
	}
}