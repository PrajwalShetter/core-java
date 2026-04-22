class SmartIpod extends Ipod{
	
	@Override
	void play(){
		System.out.println("Playing high quality music");
	}
	
	@Override
	void charge(){
		System.out.println("Fast charging ipod");
	}
	
	@Override
	void connect(){
		System.out.println("Connecting via bluetooth");
	}
}

