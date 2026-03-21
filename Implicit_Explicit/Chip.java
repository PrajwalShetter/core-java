class Chip{

	static void chipDetails(){

		byte chipVersion = 3;
		short chipModel = 210;
		int chipSpeed = 3200;
		long chipSerialNumber = 456789123L;
		float chipVoltage = 1.8f;
		double chipTemperature = 45.6;
		char chipGrade = 'A';
		boolean isIntegrated = true;

		System.out.println("chipVersion : " + chipVersion);
		System.out.println("chipModel : " + chipModel);
		System.out.println("chipSpeed : " + chipSpeed);
		System.out.println("chipSerialNumber : " + chipSerialNumber);
		System.out.println("chipVoltage : " + chipVoltage);
		System.out.println("chipTemperature : " + chipTemperature);
		System.out.println("chipGrade : " + chipGrade);
		System.out.println("isIntegrated : " + isIntegrated);
	}

	static void chipDetails(int memorySize,double frequency,char chipType,boolean isSecure){

		System.out.println("memorySize = " + memorySize);
		System.out.println("frequency = " + frequency);
		System.out.println("chipType = " + chipType);
		System.out.println("isSecure = " + isSecure);
	}
}