class MicRunner{
	
	public static void main(String[] args){
		
		System.out.println("---- Static Polymorphism ----");
		Mic mic1 = new Mic();
		mic1.record();
		mic1.record(5);
		
		System.out.println("---- Constructor Overloading ----");
		Mic mic2 = new Mic("Sony");
		
		System.out.println("---- Dynamic Polymorphism ----");
		Mic mic3 = new WirelessMic();
		mic3.sound();
		
		System.out.println("---- instanceof + Casting ----");
		Mic mic4 = new StudioMic();
		
		if(m4 instanceof StudioMic){
			StudioMic studio = (StudioMic)mic4;
			studio.filter();
		}
	}
}