class Mic{
	
	void record(){
		System.out.println("Recording audio");
	}
	
	void record(int duration){
		System.out.println("Recording for " + duration + " minutes");
	}
	
	Mic(){
		System.out.println("Default Mic");
	}
	
	Mic(String brand){
		System.out.println("Mic brand: " + brand);
	}
	
	void sound(){
		System.out.println("Mic captures sound");
	}
}