class GunModels {

	public static void main(String[] args){

		String g1="AK-47";
		String g2="M16";
		String g3="Glock 17";
		String g4="Desert Eagle";
		String g5="Uzi";
		String g6="MP5";
		String g7="Beretta 92";
		String g8="Colt M1911";
		String g9="Remington 870";
		String g10="M4 Carbine";
		String g11="FN SCAR";
		String g12="HK416";
		String g13="Steyr AUG";
		String g14="FAMAS";
		String g15="RPG-7";
		String g16="Dragunov";
		String g17="M249";
		String g18="MG42";
		String g19="Thompson";
		String g20="Winchester";
		String g21="Lee Enfield";
		String g22="Kar98k";
		String g23="P90";
		String g24="Vector";
		String g25="SPAS-12";
		String g26="Saiga-12";
		String g27="Barrett M82";
		String g28="AWM";
		String g29="Mini Uzi";
		String g30="Tec-9";

		String[] guns = {
			g1,g2,g3,g4,g5,g6,g7,g8,g9,g10,
			g11,g12,g13,g14,g15,g16,g17,g18,g19,g20,
			g21,g22,g23,g24,g25,g26,g27,g28,g29,g30
		};

		
		guns[0] = " AK-47";
		guns[2] = " Glock";
		guns[4] = " Uzi";
		guns[6] = " Beretta";
		guns[8] = " Remington";
		guns[10] = " SCAR";
		guns[12] = " AUG";
		guns[14] = " RPG";
		guns[16] = " M249";
		guns[18] = " Thompson";

		int size = guns.length;

		for(int start = 0; start < size; start++){
			System.out.println("Element at position " + start + " is :" + guns[start]);
		}

			guns[100] = "Invalid";
		
		}
	}
}