class Principal{
	
	String name;
	String qualification;
	int experience;
	
	 Principal(String name, String qualification, int experience){
		this.name= name;
		this.qualification = qualification;
		this.experience = experience;
		
	}
	
	void display(){
		System.out.println("Name :"+this.name);
		System.out.println("Experience :"+this.experience);
		System.out.println("Qualification :"+this.qualification);
	}
}