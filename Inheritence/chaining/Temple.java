class Temple{
	String name;
	String location;
	String deity;
	int age;
	boolean openAllDays;
	
	Temple(String name, String location, String deity, int age, boolean openAllDays){
		this.name = name;
		this.location = location;
		this.deity = deity;
		this.age = age;
		this.openAllDays = openAllDays;
	}
	
	void display(){
		System.out.println("name :"+this.name);
		System.out.println("location :"+this.location);
		System.out.println("deity :"+this.deity);
		System.out.println("age :"+this.age);
		System.out.println("openAllDays :"+this.openAllDays);
		System.out.println("=================");
		
		
	}
}

