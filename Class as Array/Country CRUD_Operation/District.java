class District{

		String name;
		Collector collector;
		int noOfCities;
		
		District(String name, Collector collector, int noOfCities){
			this.name = name;
			this.collector = collector;
			this.noOfCities = noOfCities;
		}
		
		void display(){
			System.out.println("");
			System.out.println("name :"+this.name);
			System.out.println("collector :"+this.collector.name);
			System.out.println("noOfCities :"+this.noOfCities);
			
			
		}
}