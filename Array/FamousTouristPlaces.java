class FamousTouristPlaces {

	public static void main(String[] args){

		String t1="Taj Mahal";
		String t2="Mysore Palace";
		String t3="Hampi";
		String t4="Goa Beach";
		String t5="Kerala Backwaters";
		String t6="Charminar";
		String t7="Red Fort";
		String t8="Qutub Minar";
		String t9="India Gate";
		String t10="Golden Temple";
		String t11="Meenakshi Temple";
		String t12="Ooty";
		String t13="Coorg";
		String t14="Manali";
		String t15="Shimla";
		String t16="Darjeeling";
		String t17="Andaman Islands";
		String t18="Ladakh";
		String t19="Kedarnath";
		String t20="Rishikesh";
		String t21="Varanasi";
		String t22="Ajanta Caves";
		String t23="Ellora Caves";
		String t24="Sundarbans";
		String t25="Mahabalipuram";
		String t26="Kanyakumari";
		String t27="Amritsar";
		String t28="Udaipur";
		String t29="Jaipur";
		String t30="Jaisalmer";

		String[] places = {
			t1,t2,t3,t4,t5,t6,t7,t8,t9,t10,
			t11,t12,t13,t14,t15,t16,t17,t18,t19,t20,
			t21,t22,t23,t24,t25,t26,t27,t28,t29,t30
		};

		places[0] = "Updated Taj Mahal";
		places[1] = "Updated Mysore Palace";
		places[2] = "Updated Hampi";
		places[3] = "Updated Goa Beach";
		places[4] = "Updated Kerala";
		places[5] = "Updated Charminar";
		places[6] = "Updated Red Fort";
		places[7] = "Updated Qutub Minar";
		places[8] = "Updated India Gate";
		places[9] = "Updated Golden Temple";
		places[10] = "Updated Meenakshi";
		places[11] = "Updated Ooty";
		places[12] = "Updated Coorg";
		places[13] = "Updated Manali";
		places[14] = "Updated Shimla";

		int size = places.length;

		for(int start=0; start<size; start++){
			System.out.println("Element at position " + start + " is :" + places[start]);
		}

		places[100] = "Invalid";

	}
}