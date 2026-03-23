class CarModels {

	public static void main(String[] args){

		String c1="Swift";
		String c2="i20";
		String c3="Baleno";
		String c4="Creta";
		String c5="Venue";
		String c6="City";
		String c7="Amaze";
		String c8="Fortuner";
		String c9="Innova";
		String c10="Thar";
		String c11="Scorpio";
		String c12="XUV700";
		String c13="Nexon";
		String c14="Harrier";
		String c15="Safari";
		String c16="Altroz";
		String c17="Punch";
		String c18="Kushaq";
		String c19="Slavia";
		String c20="Virtus";
		String c21="Ciaz";
		String c22="Verna";
		String c23="Seltos";
		String c24="Sonet";
		String c25="Compass";

		String[] cars = {
			c1,c2,c3,c4,c5,c6,c7,c8,c9,c10,
			c11,c12,c13,c14,c15,c16,c17,c18,c19,c20,
			c21,c22,c23,c24,c25
		};

		
		cars[0] = "Updated Swift";
		cars[2] = "Updated Baleno";
		cars[4] = "Updated Venue";
		cars[6] = "Updated Amaze";
		cars[8] = "Updated Innova";
		cars[10] = "Updated Scorpio";
		cars[12] = "Updated Nexon";
		cars[14] = "Updated Safari";
		cars[16] = "Updated Punch";
		cars[18] = "Updated Slavia";

		int size = cars.length;

		for(int start = 0; start < size; start++){
			System.out.println("Element at position " + start + " is :" + cars[start]);
		}

		
		cars[50] = "Invalid";

	}
}