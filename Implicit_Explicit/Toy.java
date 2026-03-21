class Toy{

	static void details(){

		byte toyAgeGroup = 5;
		short toyModel = 310;
		int toyPrice = 500;
		long toySerialNumber = 456789123L;
		float toyWeight = 1.2f;
		double toySize = 15.5;
		char toyQuality = 'A';
		boolean isBatteryOperated = true;

		System.out.println("toyAgeGroup : " + toyAgeGroup);
		System.out.println("toyModel : " + toyModel);
		System.out.println("toyPrice : " + toyPrice);
		System.out.println("toySerialNumber : " + toySerialNumber);
		System.out.println("toyWeight : " + toyWeight);
		System.out.println("toySize : " + toySize);
		System.out.println("toyQuality : " + toyQuality);
		System.out.println("isBatteryOperated : " + isBatteryOperated);
	}

	static void details(int toyPieces,double toyHeight,char toyType,boolean isElectronic){

		System.out.println("toyPieces = " + toyPieces);
		System.out.println("toyHeight = " + toyHeight);
		System.out.println("toyType = " + toyType);
		System.out.println("isElectronic = " + isElectronic);
	}
}