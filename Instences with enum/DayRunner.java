class DayRunner{
	
	public static void main(String... args){
		
		Week week = new Week("April", "Bangalore");
		week.display();
		
		Day day = week.details();
		day.display();
	}
}