class PersonDetails {

	static void getDetails(String name, String email, long mobileNo, String pgAddress, String homeAddress){

		if(name==null || email==null || pgAddress==null || homeAddress==null){
			System.out.println("Invalid details");
			return;
		}

		System.out.println("Name :"+name);
		System.out.println("Email :"+email);
		System.out.println("Mobile :"+mobileNo);
		System.out.println("PG Address :"+pgAddress);
		System.out.println("Home Address :"+homeAddress);
		System.out.println("/n");
	}
}

