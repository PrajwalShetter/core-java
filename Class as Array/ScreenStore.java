class ScreenStore{
	
	Screen[] screen = new Screen[20];
	int index = 0;
	
	void store(Screen screen){
		System.out.println("Storing the array elements to the array");
		if(screen != null){
			if(this.index< this.screen.length){
				this.screen[this.index]=screen;
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
		
		for(Screen arr : this.screen){
			
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