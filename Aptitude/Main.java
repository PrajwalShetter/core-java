class Country{
	
	String countryName;
	int countryCode;
	double countryPopulation;
	State[] state;
	
	public Country(String countryName,int countryCode, double countryPopulation,State[] state){
		this.countryName=countryName;
		this.countryCode=countryCode;
		this.countryPopulation=countryPopulation;
		this.state=state;
	
	}
	
}

class State{
	
	String stateName;
	int stateCode;
	
	public State(String stateName, int stateCode){
		this.stateName=stateName;
		this.stateCode=stateCode;
	}
	
}

class Main{
	
	public static void main(String[] args){
		
		State state1 = new State("karnataka",02);
		State state2 = new State("Kerala",03);
		State state3 = new State("Tamil Nadu",04);
		State[] states ={state1,state2,state3};

		Country country = new Country("India",91,120999999.09,states);
		
		System.out.println(country);
		
	}
}

