class MovieStore{
	
	Movie[] movie = new Movie[20];
	int index = 0;
	
	void store(Movie movie){
		System.out.println("Storing the array elements to the array");
		if(movie != null){
			if(this.index< this.movie.length){
				this.movie[this.index]=movie;
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
		
		for(Movie arr : this.movie){
			
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