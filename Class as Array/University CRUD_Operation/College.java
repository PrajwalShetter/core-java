class College{
	
	String name;
	Principal principal;
	Department department[];
	int noOfStudents;
	
	 College(String name, Principal principal, Department[] department, int noOfStudents){
		this.name= name;
		this.principal=principal;
		this.department=department;
		this.noOfStudents=noOfStudents;
	}
	
	void display(){
		System.out.println("Name :"+this.name);
		System.out.println("Principal :"+this.principal.name);
		System.out.println("NoOfStudents :"+this.noOfStudents);
		
		if(department != null){
			System.out.println("departments are :");
			for(Department dpt: department){
				if(dpt != null){
					System.out.println("Name :"+dpt.name);
				}
			}
		}
	}
}