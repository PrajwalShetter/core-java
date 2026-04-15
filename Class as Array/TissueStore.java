class TissueStore{
	
	Tissue[] tissue = new Tissue[20];
	int index = 0;
	
	void store(Tissue tissue){
		System.out.println("Storing the array elements to the array");
		if(tissue != null){
			if(this.index< this.tissue.length){
				this.tissue[this.index]=tissue;
				System.out.println("stored the array element at the index:"+this.index);
				this.index++;
			}
			
		}
		else{
			System.out.println("The is in null, cannot store insert the values");
		}
	}
	
	void display(){
		System.out.println("Displaying all elemnts is an array");
		boolean found =false;
		
		for(Tissue arr : this.tissue){
			
			if(arr != null){
				arr.display();
				found = true;
			}
		}
		if(!found){
			System.out.println("Array cannot be null");
		}
	}
}