class President{
	
	String name;
	int age;
	Address address;
	
	President(String name, int age, Address address){
		this.name = name;
		this.age = age;
		this.address = address;
	}
	
	void display(){
		System.out.println("");
		System.out.println("name :"+this.name);
		System.out.println("age :"+this.age);
		System.out.println("address :"+this.address.pincode);

	}
}