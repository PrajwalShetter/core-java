class LaserStore{
	
	Laser[] laser = new Laser[20];
	int index = 0;
	
	void store(Laser laser){
		System.out.println("Storing the array elements to the array");
		if(laser != null){
			if(this.index< this.laser.length){
				this.laser[this.index]=laser;
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
		
		for(Laser arr : this.laser){
			
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