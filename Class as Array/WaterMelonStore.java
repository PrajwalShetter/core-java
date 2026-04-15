class WaterMelonStore{
	
	WaterMelon[] watermelon = new WaterMelon[20];
	int index =0;
	
	void store(WaterMelon watermelon){
		System.out.println("Storing the array elements to the array");
		if(watermelon != null){
			if(this.index<this.watermelon.length){
				this.watermelon[this.index]=watermelon;
				System.out.println("stored the array element at the index:"+this.index);
				this.index++;
				
			}
		}
		else{
			System.out.println("The array contains null, cannot be store");
		}
	}
	
	void display(){
		
		System.out.println("Displaying all elemnts is an array");
		int count =0;
		for(WaterMelon arr : this.watermelon){
			
			if(arr !=null){
				arr.display();
				count++;
			}
		}
		if(count==0){
			System.out.println("Array cannot be null");
		}
	}
}