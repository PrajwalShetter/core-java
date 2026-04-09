class Box{
	 
	double weight;
	double length;
	double height;
	Pearl[] pearl;
	 
	Box(double weight, double length, double height, Pearl[] pearl){
		 
		this.weight = weight;
		this.length = length;
		this.height = height;
		this.pearl = pearl;
		 
	}
	 
	void display(){
		 
		System.out.println("Weight :"+this.weight);
		System.out.println("Length :"+this.length);
		System.out.println("Height :"+this.height);
		System.out.println("Pearl details :");
		
		if(this.pearl != null){
			
			for(Pearl pearl : this.pearl){
				
				if(pearl != null){
					pearl.display();
				}
			}
		}
	}
}