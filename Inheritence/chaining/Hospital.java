class Hospital{
	String name;
	String location;
	int noOfBeds;
	boolean emergencyAvailable;
	String type;
	
	Hospital(String name, String location, int noOfBeds, boolean emergencyAvailable, String type){
		this.name = name ;
		this.location = location;
		this.noOfBeds = noOfBeds;
		this.emergencyAvailable = emergencyAvailable;
		this.type = type;
	}
	
	void display(){
		System.out.println("name : "+this.name);
		System.out.println("location : "+this.location);
		System.out.println("noOfBeds : "+this.noOfBeds);
		System.out.println("emergencyAvailable : "+this.emergencyAvailable);
		System.out.println("type : "+this.type);
		System.out.println("=====================");
		
		
	}
}

