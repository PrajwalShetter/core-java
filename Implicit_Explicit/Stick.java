class Stick{

	static void stickInfo(){

		byte stickSize = 5;
		short stickCode = 210;
		int stickLength = 100;
		long stickSerialNumber = 654321987L;
		float stickWeight = 1.1f;
		double stickThickness = 2.4;
		char stickGrade = 'B';
		boolean isFlexible = true;

		System.out.println("stickSize : " + stickSize);
		System.out.println("stickCode : " + stickCode);
		System.out.println("stickLength : " + stickLength);
		System.out.println("stickSerialNumber : " + stickSerialNumber);
		System.out.println("stickWeight : " + stickWeight);
		System.out.println("stickThickness : " + stickThickness);
		System.out.println("stickGrade : " + stickGrade);
		System.out.println("isFlexible : " + isFlexible);
	}

	static void stickInfo(int stickStrength,double stickWidth,char stickType,boolean isBamboo){

		System.out.println("stickStrength = " + stickStrength);
		System.out.println("stickWidth = " + stickWidth);
		System.out.println("stickType = " + stickType);
		System.out.println("isBamboo = " + isBamboo);
	}
}