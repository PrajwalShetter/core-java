class Address{
	long no ;
	int pincode;
	State state;
	
	Address(long no, int pincode, State state){
		this.no = no;
		this.pincode = pincode;
		this.state = state;
	}
	
	void display(){
		System.out.println("");
		System.out.println("number : "+this.no);
		System.out.println("pincode :"+this.pincode);
		System.out.println("state :"+this.state.name);
	}
}