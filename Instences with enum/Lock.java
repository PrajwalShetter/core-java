class Lock{
	
	String material;
	boolean isdegital;
	String color;
	int rating;
	
	Lock(String material, boolean isdegital, String color, int rating){
		
		this.material = material;
		this.isdegital = isdegital;
		this.color = color;
		this.rating = rating;
	}
	
	public void display(){
		
		System.out.println("material :"+this.material);
		System.out.println("isdegital :"+this.isdegital);
		System.out.println("color :"+this.color);
		System.out.println("rating :"+this.rating);

	}
	
}