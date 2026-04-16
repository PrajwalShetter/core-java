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
	
	void searchByLocation(String location){
		System.out.println("searching a location and display all info of the watermelon"+location);
		if(location != null){
			boolean found = false;
			for(WaterMelon arr :this.watermelon){
				
				if(arr != null && location.equals(arr.grownLocation)){
					System.out.println("the location is found");
					arr.display();
					found =true;
					
				}	
			}
			if(!found){
				System.out.println("sry the location is not found, try new location again");
			}
		}
		else{
			System.out.println("Location can not be null");
		}
	}
	
	WaterMelon findByLocation(String location){
		System.out.println("returning the values using location");
		if(location != null){
			
			for(WaterMelon arr : this.watermelon){
				
				if(arr != null && location.equals(arr.grownLocation)){
					System.out.println("The location found");
					return arr;
				}
			}
			
			System.out.println("The location is not found");
			
		}
		else{
			System.out.println("location can not be null");
			return null;
		}
		return null;
		
	}
	
	void updatePriceByLocation(double price, String location){
		System.out.println("Updating price by location and displaying all info of the watermelon :"+location);
		if( price >0.00 && location != null){
			int count =0;
			for(WaterMelon arr : this.watermelon){
				if(arr != null && location == arr.grownLocation){
					System.out.println("the locatin is found and updating price");
					arr.price= price;
					System.out.println("The price is updated");
					arr.display();
					count =1;
				}
			}
			if(count ==0){
				System.out.println("sry the location is not found, try with new location");
			}
		}
		else{
			System.out.println("The price and location can not be zero and null");
		}
	}
}