class Address{
	
	int doorNo;
	String area;
	int pincode;
	String city;
	
	 Address(int doorNo, String area, int pincode, String city ){
		this.doorNo= doorNo;
		this.area=area;
		this.pincode=pincode;
		this.city=city;
	}
	
	void display(){
		System.out.println("DoodrNo :"+this.doorNo);
		System.out.println("Area :"+this.area);
		System.out.println("Pincode :"+this.pincode);
		System.out.println("City :"+this.city);
	}
	
}