class TicketRunner{

	public static void main(String[] args){

		double price = Ticket.getPriceByPlace("Bangalore");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Mysore");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Hubli");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Dharwad");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Belgaum");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Mangalore");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Udupi");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Shimoga");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Davangere");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Tumkur");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Chitradurga");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Ballari");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Raichur");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Koppal");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Gadag");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Haveri");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Bidar");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Kalaburagi");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Yadgir");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Vijayapura");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Chikmagalur");
		System.out.println(price);

		price = Ticket.getPriceByPlace("Hassan");
		System.out.println(price);

		String place = "Mandya";
		price = Ticket.getPriceByPlace(place);
		System.out.println(price);

		place = "Ramanagara";
		price = Ticket.getPriceByPlace(place);
		System.out.println(price);

		place = "Kolar";
		price = Ticket.getPriceByPlace(place);
		System.out.println(price);

		place = "Chikkaballapur";
		price = Ticket.getPriceByPlace(place);
		System.out.println(price);

		place = "Bagalkot";
		price = Ticket.getPriceByPlace(place);
		System.out.println(price);

		place = "Kodagu";
		price = Ticket.getPriceByPlace(place);
		System.out.println(price);

		place = "Karwar";
		price = Ticket.getPriceByPlace(place);
		System.out.println(price);

		place = "Hospet";
		price = Ticket.getPriceByPlace(place);
		System.out.println(price);

		
		
		
		price = Ticket.getPriceByMovieSeatTheater("KGF","Gold","PVR");
		System.out.println(price);

		price = Ticket.getPriceByMovieSeatTheater("Salaar","Silver","INOX");
		System.out.println(price);

		price = Ticket.getPriceByMovieSeatTheater("RRR","Platinum","Cinepolis");
		System.out.println(price);

		price = Ticket.getPriceByMovieSeatTheater("Pushpa","Gold","PVR");
		System.out.println(price);

		price = Ticket.getPriceByMovieSeatTheater("Leo","Silver","INOX");
		System.out.println(price);
		
		price = Ticket.getPriceByMovieSeatTheater("Jawan","Gold","PVR");
		System.out.println(price);

		price = Ticket.getPriceByMovieSeatTheater("Pathaan","Silver","INOX");
		System.out.println(price);

		price = Ticket.getPriceByMovieSeatTheater("Animal","Platinum","Cinepolis");
		System.out.println(price);

		price = Ticket.getPriceByMovieSeatTheater("Dunki","Gold","PVR");
		System.out.println(price);

		price = Ticket.getPriceByMovieSeatTheater("Tiger3","Silver","INOX");
		System.out.println(price);
		
		String movie = "Bahubali";
		String seatType = "Gold";
		String theater = "PVR";
		price = Ticket.getPriceByMovieSeatTheater(movie,seatType,theater);
		System.out.println(price);

		movie = "Bahubali2";
		seatType = "Platinum";
		theater = "INOX";
		price = Ticket.getPriceByMovieSeatTheater(movie,seatType,theater);
		System.out.println(price);

		movie = "Kantara";
		seatType = "Silver";
		theater = "Cinepolis";
		price = Ticket.getPriceByMovieSeatTheater(movie,seatType,theater);
		System.out.println(price);
		
		movie = "Master";
		seatType = "Silver";
		theater = "INOX";
		price = Ticket.getPriceByMovieSeatTheater(movie,seatType,theater);
		System.out.println(price);

		movie = "Doctor";
		seatType = "Gold";
		theater = "Cinepolis";
		price = Ticket.getPriceByMovieSeatTheater(movie,seatType,theater);
		System.out.println(price);

		movie = "Beast";
		seatType = "Silver";
		theater = "PVR";
		price = Ticket.getPriceByMovieSeatTheater(movie,seatType,theater);
		System.out.println(price);

		movie = "Jailer";
		seatType = "Platinum";
		theater = "INOX";
		price = Ticket.getPriceByMovieSeatTheater(movie,seatType,theater);
		System.out.println(price);
		
		movie = "KGF2";
		seatType = "Gold";
		theater = "Cinepolis";
		price = Ticket.getPriceByMovieSeatTheater(movie,seatType,theater);
		System.out.println(price);

		movie = "Salaar2";
		seatType = "Silver";
		theater = "PVR";
		price = Ticket.getPriceByMovieSeatTheater(movie,seatType,theater);
		System.out.println(price);

		movie = "RRR2";
		seatType = "Platinum";
		theater = "INOX";
		price = Ticket.getPriceByMovieSeatTheater(movie,seatType,theater);
		System.out.println(price);
		
		movie = "Pushpa2";
		seatType = "Gold";
		theater = "Cinepolis";
		price = Ticket.getPriceByMovieSeatTheater(movie,seatType,theater);
		System.out.println(price);

		movie = "Leo2";
		seatType = "Silver";
		theater = "PVR";
		price = Ticket.getPriceByMovieSeatTheater(movie,seatType,theater);
		System.out.println(price);

		movie = "Jawan2";
		seatType = "Gold";
		theater = "INOX";
		price = Ticket.getPriceByMovieSeatTheater(movie,seatType,theater);
		System.out.println(price);

		movie = "Animal2";
		seatType = "Platinum";
		theater = "Cinepolis";
		price = Ticket.getPriceByMovieSeatTheater(movie,seatType,theater);
		
		price = Ticket.getPriceByMovieSeatTheater("War","Gold","PVR");
		System.out.println(price);

		price = Ticket.getPriceByMovieSeatTheater("Sultan","Silver","INOX");
		System.out.println(price);

		price = Ticket.getPriceByMovieSeatTheater("Dangal","Platinum","Cinepolis");
		System.out.println(price);

		price = Ticket.getPriceByMovieSeatTheater("PK","Gold","PVR");
		System.out.println(price);

		price = Ticket.getPriceByMovieSeatTheater("3Idiots","Silver","INOX");
		System.out.println(price);

		String movie = "Raees";
		String seatType = "Gold";
		String theater = "Cinepolis";
		price = Ticket.getPriceByMovieSeatTheater(movie,seatType,theater);
		System.out.println(price);

		movie = "Don";
		seatType = "Silver";
		theater = "PVR";
		price = Ticket.getPriceByMovieSeatTheater(movie,seatType,theater);
		System.out.println(price);

		movie = "ChennaiExpress";
		seatType = "Platinum";
		theater = "INOX";
		price = Ticket.getPriceByMovieSeatTheater(movie,seatType,theater);
		System.out.println(price);

		movie = "Kick";
		seatType = "Gold";
		theater = "Cinepolis";
		price = Ticket.getPriceByMovieSeatTheater(movie,seatType,theater);
		System.out.println(price);

		movie = "Ready";
		seatType = "Silver";
		theater = "PVR";
		price = Ticket.getPriceByMovieSeatTheater(movie,seatType,theater);
		System.out.println(price);
		
		
		String email = Ticket.getEmailByName("Prajwal");
		System.out.println(email);

		email = Ticket.getEmailByName("Ravi");
		System.out.println(email);

		email = Ticket.getEmailByName("Kiran");
		System.out.println(email);

		email = Ticket.getEmailByName("Anil");
		System.out.println(email);

		email = Ticket.getEmailByName("Suresh");
		System.out.println(email);

		String name = "Mahesh";
		email = Ticket.getEmailByName(name);
		System.out.println(email);

		name = "Ramesh";
		email = Ticket.getEmailByName(name);
		System.out.println(email);

		name = "Ganesh";
		email = Ticket.getEmailByName(name);
		System.out.println(email);

		name = "Vijay";
		email = Ticket.getEmailByName(name);
		System.out.println(email);

		name = "Ajay";
		email = Ticket.getEmailByName(name);
		System.out.println(email);


		long mobile = Ticket.getMobileByName("Prajwal");
		System.out.println(mobile);

		mobile = Ticket.getMobileByName("Ravi");
		System.out.println(mobile);

		mobile = Ticket.getMobileByName("Kiran");
		System.out.println(mobile);

		mobile = Ticket.getMobileByName("Anil");
		System.out.println(mobile);

		mobile = Ticket.getMobileByName("Suresh");
		System.out.println(mobile);
		
		String name = "Mahesh";
		mobile = Ticket.getMobileByName(name);
		System.out.println(mobile);

		name = "Ramesh";
		mobile = Ticket.getMobileByName(name);
		System.out.println(mobile);

		name = "Ganesh";
		mobile = Ticket.getMobileByName(name);
		System.out.println(mobile);

		name = "Vijay";
		mobile = Ticket.getMobileByName(name);
		System.out.println(mobile);

		name = "Ajay";
		mobile = Ticket.getMobileByName(name);
		System.out.println(mobile);

	}
}