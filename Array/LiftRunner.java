class LiftRunner{
	
	public static void main(String[] args){
		
		Lift lift = new Lift();
		lift.save("Passenger Lift");
		lift.save("Goods Lift");
		lift.save("Hospital Lift");
		lift.save("Hydraulic Lift");
		lift.save("Traction Lift");
		
		lift.search("Goods Lift");
		lift.search("Car Lift");
	}
}