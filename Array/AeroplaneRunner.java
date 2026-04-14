class AeroplaneRunner{
	
	public static void main(String[] args){
		
		Aeroplane plane = new Aeroplane();
		plane.save("Boeing 747");
		plane.save("Airbus A320");
		plane.save("Boeing 777");
		plane.save("Airbus A380");
		plane.save("Concorde");
		
		plane.search("Boeing 777");
		plane.search("F16");
	}
}