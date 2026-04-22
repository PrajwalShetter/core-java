class AdhesiveTape extends Tape{
	
	@Override
	void stick(){
		System.out.println("Strong adhesive sticking");
	}
	
	@Override
	void cut(){
		System.out.println("Cutting adhesive tape precisely");
	}
	
	@Override
	void store(){
		System.out.println("Storing adhesive tape safely");
	}
}

