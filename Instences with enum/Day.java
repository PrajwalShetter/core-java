class Day{
	
	String name;
	int number;
	boolean isHoliday;
	double temperature;
	
	Day(String name, int number, boolean isHoliday, double temperature){
		this.name = name;
		this.number = number;
		this.isHoliday = isHoliday;
		this.temperature = temperature;
	}
	
	public void display(){
		System.out.println("name :"+name);
		System.out.println("number :"+number);
		System.out.println("isHoliday :"+isHoliday);
		System.out.println("temperature :"+temperature);
	}
}



