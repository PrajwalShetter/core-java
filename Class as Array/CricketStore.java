class CricketStore{
	
	Cricket[] cricket = new Cricket[20];
	int index = 0;
	
	void store(Cricket cricket){
		System.out.println("Storing the array elements to the array");
		if(cricket != null){
			if(this.index< this.cricket.length){
				this.cricket[this.index]=cricket;
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
		
		for(Cricket arr : this.cricket){
			
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