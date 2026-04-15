class BroccoliStore{
	
	Broccoli[] broccoli = new Broccoli[20];
	int index = 0;
	
	void store(Broccoli broccoli){
		System.out.println("Storing the array elements to the array");
		if(broccoli != null){
			if(this.index< this.broccoli.length){
				this.broccoli[this.index]=broccoli;
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
		
		for(Broccoli arr : this.broccoli){
			
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