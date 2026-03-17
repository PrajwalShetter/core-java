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

		if("Jawan" == movie && "Gold" == seatType && "PVR" == theater){
			System.out.println("Ticket Price is 260");
			return 260.0; 
			}
		if("Pathaan" == movie && "Silver" == seatType && "INOX" == theater){
			System.out.println("Ticket Price is 220"); 
			return 220.0; 
			}
		if("Animal" == movie && "Platinum" == seatType && "Cinepolis" == theater){
			System.out.println("Ticket Price is 310");
			return 310.0; 
			}
		if("Dunki" == movie && "Gold" == seatType && "PVR" == theater){
			System.out.println("Ticket Price is 230"); 
			return 230.0; 
			}
		if("Tiger3" == movie && "Silver" == seatType && "INOX" == theater){
			System.out.println("Ticket Price is 215"); 
			return 215.0; 
			}

		if("Bahubali" == movie && "Gold" == seatType && "PVR" == theater){
			System.out.println("Ticket Price is 270"); 
			return 270.0; 
			}
		if("Bahubali2" == movie && "Platinum" == seatType && "INOX" == theater){
			System.out.println("Ticket Price is 320"); 
			return 320.0; 
			}
		if("Kantara" == movie && "Silver" == seatType && "Cinepolis" == theater){
			System.out.println("Ticket Price is 210");
			return 210.0; 
			}
		if("Vikram" == movie && "Gold" == seatType && "PVR" == theater){
			System.out.println("Ticket Price is 260"); 
			return 260.0; 
			}
		if("Master" == movie && "Silver" == seatType && "INOX" == theater){
			System.out.println("Ticket Price is 205"); 
			return 205.0; 
			}

		if("Doctor" == movie && "Gold" == seatType && "Cinepolis" == theater){
			System.out.println("Ticket Price is 240"); 
			return 240.0; 
			}
		if("Beast" == movie && "Silver" == seatType && "PVR" == theater){
			System.out.println("Ticket Price is 200"); 
			return 200.0; 
			}
		if("Jailer" == movie && "Platinum" == seatType && "INOX" == theater){
			System.out.println("Ticket Price is 330");
			return 330.0; 
			}
		if("KGF2" == movie && "Gold" == seatType && "Cinepolis" == theater){
			System.out.println("Ticket Price is 280"); 
			return 280.0; 
			}
		if("Salaar2" == movie && "Silver" == seatType && "PVR" == theater){
			System.out.println("Ticket Price is 225"); 
			return 225.0; 
			}

		if("RRR2" == movie && "Platinum" == seatType && "INOX" == theater){
			System.out.println("Ticket Price is 340");
			return 340.0;
			}
		if("Pushpa2" == movie && "Gold" == seatType && "Cinepolis" == theater){
			System.out.println("Ticket Price is 290");
			return 290.0; 
			}
		if("Leo2" == movie && "Silver" == seatType && "PVR" == theater){
			System.out.println("Ticket Price is 210");
			return 210.0; 
			}
		if("Jawan2" == movie && "Gold" == seatType && "INOX" == theater){
			System.out.println("Ticket Price is 275");
			return 275.0; 
			}
		if("Animal2" == movie && "Platinum" == seatType && "Cinepolis" == theater){
			System.out.println("Ticket Price is 350");
			return 350.0; 
			}
			
		if("War" == movie && "Gold" == seatType && "PVR" == theater){
			System.out.println("Ticket Price is 260"); 
			return 260.0;
			}
		if("Sultan" == movie && "Silver" == seatType && "INOX" == theater){
			System.out.println("Ticket Price is 210");
			return 210.0; 
			}
		if("Dangal" == movie && "Platinum" == seatType && "Cinepolis" == theater){
			System.out.println("Ticket Price is 320"); 
			return 320.0; 
			}
		if("PK" == movie && "Gold" == seatType && "PVR" == theater){
			System.out.println("Ticket Price is 240"); 
			return 240.0; 
			}
		if("3Idiots" == movie && "Silver" == seatType && "INOX" == theater){
			System.out.println("Ticket Price is 200");
			return 200.0; 
			}

		if("Raees" == movie && "Gold" == seatType && "Cinepolis" == theater){
			System.out.println("Ticket Price is 250"); 
			return 250.0; 
			}
		if("Don" == movie && "Silver" == seatType && "PVR" == theater){
			System.out.println("Ticket Price is 205");
			return 205.0; 
			}
		if("ChennaiExpress" == movie && "Platinum" == seatType && "INOX" == theater){
			System.out.println("Ticket Price is 330"); 
			return 330.0; 
			}
		if("Kick" == movie && "Gold" == seatType && "Cinepolis" == theater){
			System.out.println("Ticket Price is 255"); 
			return 255.0; 
			}
		if("Ready" == movie && "Silver" == seatType && "PVR" == theater){
			System.out.println("Ticket Price is 195");
			return 195.0; 
			}
		System.out.println("Details not matching");
		return 0;
	}
	
	static String getEmailByName(String name){

		System.out.println("Executing getEmailByName "+name);

		if("Prajwal" == name){
			System.out.println("Email is prajwal@gmail.com");
			return "prajwal@gmail.com"; 
			}
		if("Ravi" == name){
			System.out.println("Email is ravi@gmail.com");
			return "ravi@gmail.com"; 
			}
		if("Kiran" == name){
			System.out.println("Email is kiran@gmail.com");
			return "kiran@gmail.com"; 
			}
		if("Anil" == name){
			System.out.println("Email is anil@gmail.com");
		return "anil@gmail.com";
		}
		if("Suresh" == name){
			System.out.println("Email is suresh@gmail.com");
			return "suresh@gmail.com";
			}
		if("Mahesh" == name){
			System.out.println("Email is mahesh@gmail.com");
			return "mahesh@gmail.com"; 
			}
		if("Ramesh" == name){ 
			System.out.println("Email is ramesh@gmail.com");
		return "ramesh@gmail.com"; 
		}
		if("Ganesh" == name){
			System.out.println("Email is ganesh@gmail.com");
			return "ganesh@gmail.com"; 
			}
		if("Vijay" == name){
			System.out.println("Email is vijay@gmail.com");
			return "vijay@gmail.com"; 
			}
		if("Ajay" == name){
			System.out.println("Email is ajay@gmail.com");
		return "ajay@gmail.com"; 
		}
		if("Deepak" == name){
			System.out.println("Email is deepak@gmail.com");
			return "deepak@gmail.com"; 
			}
		if("Manoj" == name){
			System.out.println("Email is manoj@gmail.com");
			return "manoj@gmail.com";
			}
		if("Arun" == name){
			System.out.println("Email is arun@gmail.com");
			return "arun@gmail.com"; 
			}
		if("Naveen" == name){
			System.out.println("Email is naveen@gmail.com");
			return "naveen@gmail.com"; 
			}
		if("Rahul" == name){
			System.out.println("Email is rahul@gmail.com");
			return "rahul@gmail.com"; 
			}

		System.out.println("Name is not matching");
		return "not found";
	}


	static long getMobileByName(String name){

		System.out.println("Executing getMobileByName "+name);

		if("Prajwal" == name){
		System.out.println("Mobile is 9876543210"); 
		return 9876543210L; 
		}
	if("Ravi" == name){
		System.out.println("Mobile is 9123456780");
		return 9123456780L; 
		}
	if("Kiran" == name){
		System.out.println("Mobile is 9012345678");
		return 9012345678L; 
		}
	if("Anil" == name){
		System.out.println("Mobile is 9988776655");
		return 9988776655L; 
		}
	if("Suresh" == name){
		System.out.println("Mobile is 9090909090");
		return 9090909090L; 
		}
	if("Mahesh" == name){
		System.out.println("Mobile is 9345678901");
		return 9345678901L;
		}
	if("Ramesh" == name){
		System.out.println("Mobile is 9234567890");
		return 9234567890L; 
		}
	if("Ganesh" == name){
		System.out.println("Mobile is 9876501234");
		return 9876501234L;
		}
	if("Vijay" == name){
		System.out.println("Mobile is 9765432109");
		return 9765432109L; 
		}
	if("Ajay" == name){
		System.out.println("Mobile is 9654321098");
		return 9654321098L; 
		}
	if("Deepak" == name){
		System.out.println("Mobile is 9543210987");
		return 9543210987L; 
		}
	if("Manoj" == name){
		System.out.println("Mobile is 9432109876");
		return 9432109876L; 
		}
	if("Arun" == name){
		System.out.println("Mobile is 9321098765");
		return 9321098765L;
		}
	if("Naveen" == name){
		System.out.println("Mobile is 9210987654");
		return 9210987654L; 
		}
	if("Rahul" == name){
		System.out.println("Mobile is 9109876543");
		return 9109876543L;
		}

	System.out.println("Name is not matching");
	return 0;
}
}