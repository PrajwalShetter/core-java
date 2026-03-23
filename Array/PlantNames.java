class PlantNames {

	public static void main(String[] args){

		String p1="Rose";
		String p2="Tulip";
		String p3="Sunflower";
		String p4="Jasmine";
		String p5="Lily";
		String p6="Lotus";
		String p7="Daisy";
		String p8="Orchid";
		String p9="Hibiscus";
		String p10="Marigold";
		String p11="Aloe Vera";
		String p12="Bamboo";
		String p13="Cactus";
		String p14="Neem";
		String p15="Tulsi";
		String p16="Mint";
		String p17="Coriander";
		String p18="Spinach";
		String p19="Fern";
		String p20="Lavender";
		String p21="Mango Plant";
		String p22="Banana Plant";
		String p23="Coconut Plant";
		String p24="Apple Plant";
		String p25="Peepal";

		String[] plants = {
			p1,p2,p3,p4,p5,p6,p7,p8,p9,p10,
			p11,p12,p13,p14,p15,p16,p17,p18,p19,p20,
			p21,p22,p23,p24,p25
		};

		plants[0] = " Rose";
		plants[1] = " Tulip";
		plants[2] = " Sunflower";
		plants[3] = " Jasmine";
		plants[4] = " Lily";
		plants[5] = " Lotus";
		plants[6] = " Daisy";
		plants[7] = " Orchid";
		plants[8] = " Hibiscus";
		plants[9] = " Marigold";
		plants[10] = " Aloe Vera";
		plants[11] = " Bamboo";

		int size = plants.length;

		for(int start=0; start<size; start++){
			System.out.println("Element at position " + start + " is :" + plants[start]);
		}

		plants[50] = "Invalid";

	}
}