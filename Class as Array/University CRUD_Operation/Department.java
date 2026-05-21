class Department{
	
	String name;
	HOD hod;
	Student[] student;
	int noOfFaculty;
	
	 Department(String name, HOD hod, Student[] student, int noOfFaculty){
		this.name=name;
		this.hod=hod;
		this.student=student;
		this.noOfFaculty=noOfFaculty;
	}
	
	void display(){
		System.out.println("Name :"+this.name);
		System.out.println("HOD :"+this.hod.name);
		
		if(student != null){
			System.out.println("Students are :");
			for(Student std: student){
				if(std != null){
					System.out.println("Name :"+std.name);
				}
			}
		}
		System.out.println("NoOfFaculty :"+noOfFaculty);
		
	}
}