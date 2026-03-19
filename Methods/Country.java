//Task 1 Country-->run()-->State-->run()--> District-->run()-->taxing()-->measure()-->collect()-->revenue()-->budget()

class Country{
	
	public static void main(String[] args){
		System.out.println("Starting Country Information");
		run();
	}
	
	static void run(){
		System.out.println("India is my Country");
		System.out.println("Calling State Information");
		State.run();
	}
}
