class HOD{
	
	String name;
	String specialization;
	int yearsOfExperience;
	
	 HOD(String name, String specialization, int yearsOfExperience){
		this.name= name;
		this.specialization=specialization;
		this.yearsOfExperience = yearsOfExperience;
	}
	
	void display(){
		
		System.out.println("Name :"+this.name);
		System.out.println("specialization :"+this.specialization);
		System.out.println("YearsOfExperiences :"+this.yearsOfExperience);
	}
	
}