class HoneyBee {
    static void fly(){
		System.out.println("HoneyBee is flying"); 
		}
		
    static void collect(){ 
	System.out.println("HoneyBee collects nectar"); 
	}
	
    static void makeHoney(){
		System.out.println("HoneyBee makes honey"); 
		sting();
		hive();
		}
    static void sting(){ 
	System.out.println("HoneyBee can sting");
	}
    static void hive(){ 
	System.out.println("HoneyBee lives in hive");
	}
}