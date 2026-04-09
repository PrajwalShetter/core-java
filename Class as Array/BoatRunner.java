class BoatRunner{
	
	public static void main(String[] as){
		
		Passenger passengerOne = new Passenger("arun",IdProof.PAN_CARD,"8908");
		Passenger passengerTwo = new Passenger("Tarun",IdProof.PAN_CARD,"5688");
		Passenger passenger =new Passenger();
		
		Passenger passengers[]={passengerOne,null,passengerTwo,null};
		
		Boat boat=new Boat("a1234","Sagar",passengers);
		boat.display();
	}
}