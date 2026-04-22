class OilPaint extends Paint{
	
	@Override
	void apply(){
		System.out.println("Appliying oil paint");
	}
	
	@Override
	void mix(){
		System.out.println("Mixing oil paint");
	}
	
	@Override
	void store(){
		System.out.println("Storeing oil paint");
	}
}

