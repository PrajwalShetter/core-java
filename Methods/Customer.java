//Task 2 Customer-->address()-->Address-->info()-->Street-->details()--->pincode() 

class Customer{
	
	public static void main(String[] args){
		address();
	}
	
	static void address(){
		System.out.println("Customer address details");
		Address.info();
	}
}
