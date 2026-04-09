class SeaShore{
	 
	String name;
	String countryName;
	LightHouse[] lightHouse;
	 
	SeaShore(String name, String countryName, LightHouse[] lightHouse){
		 
		this.name = name;
		this.countryName = countryName;
		this.lightHouse = lightHouse;
		 
	}
	 
	void display(){
		 
		System.out.println("Name :"+this.name);
		System.out.println("Country Name :"+this.countryName);
		System.out.println("LightHouse details :");
		
		if(this.lightHouse != null){
			
			for(LightHouse lightHouse : this.lightHouse){
				
				if(lightHouse != null){
					lightHouse.display();
				}
			}
		}
	}
}