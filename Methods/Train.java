class Train{

	static void start(){
		System.out.println("Train is starting");
	}
	
	static void stop(){
		System.out.println("Train is stopping");
	}
	
	static void speed(){
		System.out.println("Train has 200km/h speed");
		horn();
		passengerCapacity();
	}
	
	static void horn(){
		System.out.println("Train makes sounds with horn");
	}
	
	static void passengerCapacity(){
		System.out.println("Train has upto 500-100 passenger capacity");
	}
	
	
}