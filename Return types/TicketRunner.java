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

	}
}