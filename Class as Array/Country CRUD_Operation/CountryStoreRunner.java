class CountryStoreRunner{
	
	public static void main(String[] args){
	
	Collector collector = new Collector("ramu", 25696);
	Collector collector1 = new Collector("ramesh", 9086);
	
	District district0 = new District("koppal", collector, 30);
	District district1 = new District("Kodagu", collector1, 20);
	District district2 = new District("Mysore", collector, 90);
	District district3 = new District("Ballari", collector1, 70);
	District district4 = new District("Bidar", collector, 55);
	District district5 = new District("mandaya", collector1, 30);
	District district6 = new District("Udupi", collector, 68);
	District district7 = new District("Raichur", collector1, 88);
	District district8 = new District("Gulbarga", collector, 22);
		District districts[] = {district0,district1,district2,district4};
		District districts1[] = {district5,district6,district7,district8};
	
	City city1 = new City("kushtagi", districts);
	City city2 = new City("madikeri", districts1);
	City cities[] ={city1,city2};
	
	State state1 = new State("karnataka", 250000.89, 31,cities);
	State state2 = new State("UP", 90000.89, 34,cities);
	State state3 = new State("TamilNadu", 70000.89, 90,cities);
	State state4 = new State("Keral", 400000.89, 60,cities);
	State state5 = new State("Odisha", 60030.89, 31,cities);
	State state6 = new State("Texa", 89023.89, 55,cities);
	State state7 = new State("florida", 90345.89, 30,cities);
	State state8 = new State("california", 90345.89, 80,cities);
	State state9 = new State("newYork", 87652.89, 20,cities);
	State state10 = new State("mexico", 56392.89, 10,cities);
	State[] India = {state1,state2,state3,state4,state5};
	State[] USA = {state6,state7,state8,state9,state10};
	//State[] states = {state1,state2,state3,state4,state5,state6,state7,state8,state9,state10};
	
	
	Address address1 = new Address(1234556789L, 583288, state1);
	Address address2 = new Address(1234556249L, 583222, state2);
	
	President president1 = new President("sagar", 33, address1);
	President president2 = new President("chetan", 37, address2);
	
	Country country1 = new Country("India", president1, India);
	Country country2 = new Country("USA", president2, USA);
	
	CountryStore store = new CountryStore();
	
	store.save(country1);
	store.save(country2);
	
	
	System.out.println("");
	store.display();
	
	System.out.println("");
	Country ref = store.findByName("USA");
	if(ref != null){
		ref.display();
	}
	
	System.out.println("");
	State ref1 = store.findStateByStateName("california");
	if(ref1 != null){
		ref1.display();
	}
	System.out.println("");
	State ref2 = store.findStateByStateName("karnataka");
	if(ref2 != null){
		ref2.display();
	}
	
	System.out.println("");
	City[] ref3 = store.findAllCityByStateName("karnataka");
	if(ref3 != null){
		for(City arr : ref3){
			if(arr != null){
				arr.display();
			}
		}
	}
	
	System.out.println("");
	int count = store.findNoOfDistrictsByCityName("kushtagi");
	System.out.println("no of districts :"+count);
	
	
	System.out.println("");
	Country ref4 = store.findByCollectorName("ramu");
	if(ref4 != null){
		ref4.display();
	}
	}
}