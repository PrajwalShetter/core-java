class Bat{

	static void batDetails(){

		byte batSize = 6;
		short batCode = 300;
		int batLength = 85;
		long batSerialNumber = 765432198L;
		float batWeight = 1.3f;
		double batPrice = 3500.50;
		char batGrade = 'A';
		boolean isWooden = true;

		System.out.println("batSize : " + batSize);
		System.out.println("batCode : " + batCode);
		System.out.println("batLength : " + batLength);
		System.out.println("batSerialNumber : " + batSerialNumber);
		System.out.println("batWeight : " + batWeight);
		System.out.println("batPrice : " + batPrice);
		System.out.println("batGrade : " + batGrade);
		System.out.println("isWooden : " + isWooden);
	}

	static void batDetails(int runs,double batWidth,char batType,boolean isProfessional){

		System.out.println("runs = " + runs);
		System.out.println("batWidth = " + batWidth);
		System.out.println("batType = " + batType);
		System.out.println("isProfessional = " + isProfessional);
	}
}