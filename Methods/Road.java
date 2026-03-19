class Road {
    static void travel(){
		System.out.println("Vehicles travel on road"); 
		}
		
    static void traffic(){ 
	System.out.println("Traffic moves on road");
	}
	
    static void repair(){ 
	System.out.println("Road is repaired");
	signal();
	cross();	
	}
	
    static void signal(){ 
	System.out.println("Traffic signals on road");
	}
	
    static void cross(){ 
	System.out.println("People cross the road");
	}
}