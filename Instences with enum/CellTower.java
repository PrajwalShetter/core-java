class CellTower{
	
	String location;
	String branch;
	
	CellTower(String location, String branch){
		
		this.location = location;
		this.branch = branch;
	}
	
	public void display(){
		
		System.out.println("location :"+this.location);
		System.out.println("branch :"+this.branch);
	}
	
	public Tower details(){
		
		Tower tower = new Tower(14.5,"reliance", true, 15000);
		return tower;
	}
	
}