class Student{
	
	String name;
	int rollNo;
	int marks;
	Address address;
	
	 Student(String name, int rollNo, int marks, Address address){
		this.name= name;
		this.rollNo = rollNo;
		this.marks= marks;
		this.address = address;
	}
	
	void display(){
		System.out.println("Name :"+this.name);
		System.out.println("RollNo :"+this.rollNo);
		System.out.println("Marks :"+this.marks);
		System.out.println("Address :"+this.address.area);
	}
}