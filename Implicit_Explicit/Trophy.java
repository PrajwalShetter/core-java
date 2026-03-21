class Trophy{

	static void trophyDetails(){

		byte trophyRank = 1;
		short trophyYear = 2024;
		int trophyHeight = 35;
		long trophySerialNumber = 987654321L;
		float trophyWeight = 2.5f;
		double trophyPrice = 1500.75;
		char trophyGrade = 'A';
		boolean isGoldPlated = true;

		System.out.println("trophyRank : " + trophyRank);
		System.out.println("trophyYear : " + trophyYear);
		System.out.println("trophyHeight : " + trophyHeight);
		System.out.println("trophySerialNumber : " + trophySerialNumber);
		System.out.println("trophyWeight : " + trophyWeight);
		System.out.println("trophyPrice : " + trophyPrice);
		System.out.println("trophyGrade : " + trophyGrade);
		System.out.println("isGoldPlated : " + isGoldPlated);
	}

	static void trophyDetails(int awardPoints,double trophyWidth,char trophyType,boolean isShiny){

		System.out.println("awardPoints = " + awardPoints);
		System.out.println("trophyWidth = " + trophyWidth);
		System.out.println("trophyType = " + trophyType);
		System.out.println("isShiny = " + isShiny);
	}
}