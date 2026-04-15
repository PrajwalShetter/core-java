class SpaceShip{
	
	
	String name;
	String country;
	String type;
	double speed;
	double weight;
	int crewCapacity;
	boolean reusable;
	double fuelCapacity;
	String missionType;
	String launchDate;
	
	SpaceShip(String name, String country, String type, double speed, double weight, int crewCapacity, boolean reusable, double fuelCapacity, String missionType, String launchDate){
		
		this.name =name;
		this.country =country;
		this.type =type;
		this.speed =speed;
		this.weight =weight;
		this.crewCapacity =crewCapacity;
		this.reusable =reusable;
		this.fuelCapacity =fuelCapacity;
		this.missionType =missionType;
		this.launchDate =launchDate;
		
	}
	
	void display(){
		
		System.out.println("================");
		System.out.println("name :"+this.name);
		System.out.println("country :"+this.country);
		System.out.println("type :"+this.type);
		System.out.println("speed :"+this.speed);
		System.out.println("weight :"+this.weight);
		System.out.println("crewCapacity :"+this.crewCapacity);
		System.out.println("reusable :"+this.reusable);
		System.out.println("fuelCapacity :"+this.fuelCapacity);
		System.out.println("missionType :"+this.missionType);
		System.out.println("launchDate :"+this.launchDate);
		
		
	}
}