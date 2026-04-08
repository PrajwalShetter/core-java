class SandInfo{
	
	String location;
	String supplier;
	
	SandInfo(String location, String supplier){
		this.location = location;
		this.supplier = supplier;
	}
	
	public void display(){
		System.out.println("location :"+location);
		System.out.println("supplier :"+supplier);
	}
	
	public Sand details(){
		Sand sand = new Sand("River", 50.0, true, 2000);
		return sand;
	}
}

