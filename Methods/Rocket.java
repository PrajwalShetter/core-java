class Rocket {
    static void launch(){
		System.out.println("Rocket is launching");
		}
		
    static void fly(){ 
	System.out.println("Rocket is flying"); 
	}
    static void fuel(){ 
	System.out.println("Rocket uses fuel");
	land();
	space();
	}
    static void land(){
		System.out.println("Rocket landing");
		}
    static void space(){ 
	System.out.println("Rocket travels to space"); 
	}
}