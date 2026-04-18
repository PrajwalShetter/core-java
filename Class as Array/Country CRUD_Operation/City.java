class City{ 

	String name;
	District[] district;
	
	City(String name, District[] district){
		this.name = name;
		this.district = district;
	}
	
	void display(){
		System.out.println("");
		System.out.println("name :"+this.name);
		if(this.district != null){
			for(District arr : district){
				if(arr != null){
					System.out.println("District :"+arr.name);
				}
			}
			
		}
	}
}