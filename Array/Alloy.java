class Alloy{
	
	String[] names = new String[5];
	int index;
	
	void save(String name){
		
		System.out.println("Running save from alloy");
		System.out.println("name arg :"+name);
		if(this.names != null){
			System.out.println("The arrray is not null, saving in alloy");
			
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
					
					System.out.println("Alloy is found");
					found = true;
					break;
				}
				
			}
			if(!found){
				System.out.println("The alloy is not found");
			}
		}
		else{
			
			System.out.println("the name is null");
		}
	}
	
}