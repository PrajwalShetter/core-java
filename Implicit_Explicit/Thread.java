class Thread{

	static void threadDetails(){

		byte threadSize = 8;
		short threadCode = 120;
		int threadLength = 500;
		long threadSerialNumber = 987654321L;
		float threadThickness = 1.5f;
		double threadStrength = 20.5;
		char threadQuality = 'A';
		boolean isElastic = true;

		System.out.println("threadSize : " + threadSize);
		System.out.println("threadCode : " + threadCode);
		System.out.println("threadLength : " + threadLength);
		System.out.println("threadSerialNumber : " + threadSerialNumber);
		System.out.println("threadThickness : " + threadThickness);
		System.out.println("threadStrength : " + threadStrength);
		System.out.println("threadQuality : " + threadQuality);
		System.out.println("isElastic : " + isElastic);
	}

	static void threadDetails(int spoolLength,double durability,char threadType,boolean isColored){

		System.out.println("spoolLength = " + spoolLength);
		System.out.println("durability = " + durability);
		System.out.println("threadType = " + threadType);
		System.out.println("isColored = " + isColored);
	}
}