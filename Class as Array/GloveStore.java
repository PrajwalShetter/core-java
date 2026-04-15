class GloveStore{
	
	Glove[] glove = new Glove[20];
	int index = 0;
	
	void store(Glove glove){
		System.out.println("Storing the array elements to the array");
		if(glove != null){
			if(this.index< this.glove.length){
				this.glove[this.index]=glove;
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
		
		for(Glove arr : this.glove){
			
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