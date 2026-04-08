class Tower{
	
	double frequency;
	String company;
	boolean isworking;
	int cost;
	
	Tower(double frequency, String company, boolean isworking, int cost){
		this.frequency = frequency;
		this.company = company;
		this.isworking = isworking;
		this.cost = cost;
	}
	
	public void display(){
		
		System.out.println("frequency :"+frequency);
		System.out.println("company :"+company);
		System.out.println("isworking :"+isworking);
		System.out.println("cost :"+cost);
	}
	
}