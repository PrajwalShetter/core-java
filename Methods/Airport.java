class Airport {
    static void flights(){ 
	System.out.println("Flights arrive at airport"); 
	}
	
    static void security(){
		System.out.println("Airport security check"); 
		}
		
    static void boarding(){
		System.out.println("Passengers boarding flight");
		runway();
		luggage();
		}
		
    static void runway(){ 
		System.out.println("Planes use runway");
		}
		
    static void luggage(){
		System.out.println("Luggage check at airport"); 
		}
}
