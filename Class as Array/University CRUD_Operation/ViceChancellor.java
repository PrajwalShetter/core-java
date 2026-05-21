class ViceChancellor{
	
	String name;
	int experience;
	Address address;	
	
	 ViceChancellor(String name, int experience, Address address){
		this.name= name;
		this.experience = experience;
		this.address = address;
	}
	
	void display(){
		System.out.println("Name :"+this.name);
		System.out.println("Experience :"+this.experience);
		System.out.println("Address :"+this.address.area);
		
	}
}