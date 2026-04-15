class SpaceShipStore{
	
	SpaceShip[] spaceShip = new SpaceShip[20];
	int index = 0;
	
	void store(SpaceShip spaceShip){
		System.out.println("Storing the array elements to the array");
		if(spaceShip != null){
			if(this.index< this.spaceShip.length){
				this.spaceShip[this.index]=spaceShip;
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
		
		for(SpaceShip arr : this.spaceShip){
			
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