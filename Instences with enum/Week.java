class Week{
	
	String month;
	String location;
	
	Week(String month, String location){
		this.month = month;
		this.location = location;
	}
	
	public void display(){
		System.out.println("month :"+this.month);
		System.out.println("location :"+this.location);
	}
	
	public Day details(){
		Day day = new Day("Monday", 1, false, 28.5);
		return day;
	}
}