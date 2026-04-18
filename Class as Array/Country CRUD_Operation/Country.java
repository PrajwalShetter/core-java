/*
Declare below class Country 
Country: name,President, State[] 
President: name,age,Address 
State : name,population,noOfDistricts, 
District: name,Collector, noOfCities
City: name,District[] 
Collector: name,batchNo 
Address: no,pincode,State 
 


CountryStore : Country[10] 
save(Country country);
Country findByName(String name)
State findStateByStateName(String name)
City[] findAllCityByStateName(String name) 
int findNoOfDistrictsByCityName(String name)
Country findByCollectorName(String collectorName)
*/

class Country{
	
	String name;
	President president;
	State states[] ;
	
	Country(String name, President president, State[] states){
		this.name =name;
		this.president=president;
		this.states = states;
				
	}
	
	void display(){
		System.out.println("---------------------------");
		System.out.println("name :"+this.name);
		System.out.println("president :"+this.president.name);
		
		if(this.states != null){
			System.out.println("States are:");
			for(State arr :states){
				if(arr != null){
					System.out.println(arr.name);
				}
			}
		}
		
	}
}

