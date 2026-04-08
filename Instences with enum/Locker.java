class Locker{
	
	String size;
	String type;
	
	Locker(String size, String type){
		
		this.size = size;
		this.type = type;
	}
	
	public void display(){
		
		System.out.println("size :"+size);
		System.out.println("type :"+type);
		
	}
	
	public Lock details(){
		
		Lock lock = new Lock("Steel", false, "black", 5);
		return lock;
	}
}