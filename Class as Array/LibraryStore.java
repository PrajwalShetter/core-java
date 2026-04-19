class LibraryStore{
	
	String[] names = new String[5];
	int index;
	
	void saveBook(String name){
		
		System.out.println("Running savebook from library store");
		System.out.println("name arg :"+name);
		if(this.names != null){
			System.out.println("The arrray is not null, saving in library");
			
			if(this.index<this.names.length){
				this.names[this.index]=name;
				System.out.println("the name is store in index :"+this.index);
				this.index++;
			}	
		}
		else{
			System.out.println("the array is null");
		}
		
	}
	
	void search(String name){
		
		if(name != null){
			
			System.out.println("the name is not null, will search");
			boolean found= false;
			for(String temp : this.names){
				if(name == temp){
					
					System.out.println("Book is found");
					found = true;
					break;
				}
				
			}
			if(!found){
				System.out.println("The book is not found");
			}
		}
		else{
			
			System.out.println("the name is null");
		}
	}
	
	void display(){
		
		System.out.println("Displaying all array elements");
		boolean found = false;
		for(String arr : this.names){
			
			if(arr !=null){
				System.out.println(arr);
				found=true;
			}
			
		}
		if(!found){
			System.out.println("sry Array is empty we can't dispaly elements ");
		}
	}
	
	void update(String oldName, String newName){
		
		if(oldName != null && newName != null){
			boolean found = false;
			for(int start=0;start<this.names.length;start++){
				
				if(names[start] == oldName){
					
					names[start] = newName;
					found = true;
				}
				
			}
			if(!found){
				System.out.println("sry the element is not found to update");
			}
			
		}
		else{
			System.out.println("oldName and newName can't be null");
		}
		
	}
	
}