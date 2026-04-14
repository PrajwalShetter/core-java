class Tablet{
	
	String[] names = new String[5];
	int index;
	
	void save(String name){
		
		System.out.println("Running save from tablet");
		System.out.println("name arg :"+name);
		if(this.names != null){
			System.out.println("The arrray is not null, saving in tablet");
			
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
					
					System.out.println("Tablet is found");
					found = true;
					break;
				}
				
			}
			if(!found){
				System.out.println("The tablet is not found");
			}
		}
		else{
			
			System.out.println("the name is null");
		}
	}
	
}