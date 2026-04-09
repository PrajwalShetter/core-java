class Classroom{
	 
	String number;
	int floorNo;
	Duster[] duster;
	 
	Classroom(String number, int floorNo, Duster[] duster){
		 
		this.number = number;
		this.floorNo = floorNo;
		this.duster = duster;
		 
	}
	 
	void display(){
		 
		System.out.println("Number :"+this.number);
		System.out.println("Floor No :"+this.floorNo);
		System.out.println("Duster details :");
		
		if(this.duster != null){
			
			for(Duster duster : this.duster){
				
				if(duster != null){
					duster.display();
				}
			}
		}
	}
}