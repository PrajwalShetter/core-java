class State{
	
	String name;
	double population;
	int noOfDistrict;
	City[] cities;
	
	State(String name, double population, int noOfDistrict, City[] cities){
		this.name = name;
		this.population = population;
		this.noOfDistrict = noOfDistrict;
		this.cities = cities;
	}
	
	void display(){
		System.out.println("");
		System.out.println("name :" + this.name);
		System.out.println("population :" + this.population);
		System.out.println("noOfDistrict :" + this.noOfDistrict);
		
		if(this.cities != null){
			System.out.println("Cities are:");
			for(City arr : this.cities){
				if(arr != null){
					System.out.println(arr.name);
				}
			}
		}
		else{
			System.out.println("No cities available");
		}
	}
}