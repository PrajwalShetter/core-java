final class Restaurant{
	
	 String name;
	 String location;
	 int rating;
	
	Restaurant(String name, String location, int rating){
		this.name = name;
		this.location = location;
		this.rating = rating;
	}
	
	void display(){
		System.out.println("Name : " + this.name);
		System.out.println("Location : " + this.location);
		System.out.println("Rating : " + this.rating);
		System.out.println("---------------------");
	}
}

