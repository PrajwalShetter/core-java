class SilencerStore{
	
	Silencer[] silencer = new Silencer[20];
	int index = 0;
	
	void store(Silencer silencer){
		System.out.println("Storing the array elements to the array");
		if(silencer != null){
			if(this.index< this.silencer.length){
				this.silencer[this.index]=silencer;
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
		
		for(Silencer arr : this.silencer){
			
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