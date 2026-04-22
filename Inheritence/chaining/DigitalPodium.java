class DigitalPodium extends Podium{
	
	@Override
	void speak(){
		System.out.println("Speaking with digital podium");
	}
	
	@Override
	void adjustHeight(){
		System.out.println("Automatic height adjustment");
	}
	
	@Override
	void clean(){
		System.out.println("Cleaning digital podium screen");
	}
}

