class Ticket{

	static double getPriceByPlace(String place){

		System.out.println("Executing getPriceByPlace "+place);

		if("Bangalore" == place){
			System.out.println("Price is 100");
			return 100.0; 
			}
		if("Mysore" == place){
			System.out.println("Price is 120");
			return 120.0;
			}
		if("Hubli" == place){ 
		System.out.println("Price is 140");
		return 140.0;
		}
		if("Dharwad" == place){
			System.out.println("Price is 130");
			return 130.0;
			}
		if("Belgaum" == place){ 
			System.out.println("Price is 150");
			return 150.0; 
			}
		if("Mangalore" == place){
			System.out.println("Price is 180");
			return 180.0;
			}
		if("Udupi" == place){ 
			System.out.println("Price is 170"); 
			return 170.0; 
			}
		if("Shimoga" == place){
			System.out.println("Price is 160");
			return 160.0;
			}
		if("Davangere" == place){
			System.out.println("Price is 155");
			return 155.0; 
			}
		if("Tumkur" == place){
			System.out.println("Price is 110"); 
			return 110.0; 
			}
		if("Chitradurga" == place){
			System.out.println("Price is 145"); 
			return 145.0; 
			}
		if("Ballari" == place){
			System.out.println("Price is 165");
			return 165.0; 
			}
		if("Raichur" == place){
			System.out.println("Price is 175"); 
			return 175.0; 
			}
		if("Koppal" == place){
			System.out.println("Price is 135");
			return 135.0; 
			}
		if("Gadag" == place){
			System.out.println("Price is 125");
			return 125.0; 
			}
		if("Haveri" == place){
			System.out.println("Price is 115");
			return 115.0;
			}
		if("Bidar" == place){
			System.out.println("Price is 190");
			return 190.0; 
			}
		if("Kalaburagi" == place){
			System.out.println("Price is 200");
			return 200.0; 
			}
		if("Yadgir" == place){
			System.out.println("Price is 185");
			return 185.0; 
			}
		if("Vijayapura" == place){
			System.out.println("Price is 195");
			return 195.0; 
			}
		if("Chikmagalur" == place){
			System.out.println("Price is 175");
			return 175.0; 
			}
		if("Hassan" == place){
			System.out.println("Price is 150");
			return 150.0; 
			}
		if("Mandya" == place){
			System.out.println("Price is 105");
			return 105.0; 
			}
		if("Ramanagara" == place){
			System.out.println("Price is 95");
			return 95.0; 
			}
		if("Kolar" == place){
			System.out.println("Price is 90");
			return 90.0; 
			}
		if("Chikkaballapur" == place){
			System.out.println("Price is 85"); 
			return 85.0; 
			}
		if("Bagalkot" == place){
			System.out.println("Price is 155");
			return 155.0; 
			}
		if("Kodagu" == place){
			System.out.println("Price is 210");
			return 210.0; 
			}
		if("Karwar" == place){
			System.out.println("Price is 220");
			return 220.0; 
			}
		if("Hospet" == place){
			System.out.println("Price is 165");
			return 165.0; 
			}

		System.out.println("Place is not matching");
		return 0;
	}
	
	static double getPriceByMovieSeatTheater(String movie, String seatType, String theater){

		System.out.println("Executing getPriceByMovieSeatTheater "+movie+" "+seatType+" "+theater);

		if("KGF" == movie && "Gold" == seatType && "PVR" == theater){
			System.out.println("Ticket Price is 250");
			return 250.0;
		}
		if("Salaar" == movie && "Silver" == seatType && "INOX" == theater){
			System.out.println("Ticket Price is 200");
			return 200.0;
		}
		if("RRR" == movie && "Platinum" == seatType && "Cinepolis" == theater){
			System.out.println("Ticket Price is 300");
			return 300.0;
		}
		if("Pushpa" == movie && "Gold" == seatType && "PVR" == theater){
			System.out.println("Ticket Price is 240");
			return 240.0;
		}
		if("Leo" == movie && "Silver" == seatType && "INOX" == theater){
			System.out.println("Ticket Price is 210");
			return 210.0;
		}
		
		if("KGF" == movie && "Gold" == seatType && "PVR" == theater){ System.out.println("Ticket Price is 250"); return 250.0; }
		if("Salaar" == movie && "Silver" == seatType && "INOX" == theater){ System.out.println("Ticket Price is 200"); return 200.0; }
		if("RRR" == movie && "Platinum" == seatType && "Cinepolis" == theater){ System.out.println("Ticket Price is 300"); return 300.0; }
		if("Pushpa" == movie && "Gold" == seatType && "PVR" == theater){ System.out.println("Ticket Price is 240"); return 240.0; }
		if("Leo" == movie && "Silver" == seatType && "INOX" == theater){ System.out.println("Ticket Price is 210"); return 210.0; }

		if("Jawan" == movie && "Gold" == seatType && "PVR" == theater){ System.out.println("Ticket Price is 260"); return 260.0; }
		if("Pathaan" == movie && "Silver" == seatType && "INOX" == theater){ System.out.println("Ticket Price is 220"); return 220.0; }
		if("Animal" == movie && "Platinum" == seatType && "Cinepolis" == theater){ System.out.println("Ticket Price is 310"); return 310.0; }
		if("Dunki" == movie && "Gold" == seatType && "PVR" == theater){ System.out.println("Ticket Price is 230"); return 230.0; }
		if("Tiger3" == movie && "Silver" == seatType && "INOX" == theater){ System.out.println("Ticket Price is 215"); return 215.0; }


		System.out.println("Details not matching");
}