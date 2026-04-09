class Shop{
	 
	String name;
	String address;
	NailCutter[] nailCutter;
	 
	Shop(String name, String address, NailCutter[] nailCutter){
		 
		this.name = name;
		this.address = address;
		this.nailCutter = nailCutter;
		 
	}
	 
	void display(){
		 
		System.out.println("Name :"+this.name);
		System.out.println("Address :"+this.address);
		System.out.println("Nail Cutter details :");
		
		if(this.nailCutter != null){
			
			for(NailCutter nailCutter : this.nailCutter){
				
				if(nailCutter != null){
					nailCutter.display();
				}
			}
		}
	}
}