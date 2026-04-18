class CountryStore {

	Country country[] = new Country[10];
	int index = 0;

	// save country
	void save(Country country) {

		if (country != null) {

			if (this.index < this.country.length) {
				this.country[index] = country;
				System.out.println("country is stored at the index of :" + index);
				index++;
			}
		} else {
			System.out.println("Country cannot be null");
		}
	}

	void display() {
		int count = 0;
		for (Country arr : country) {
			if (arr != null) {
				arr.display();
				count++;
			}
		}
		if (count == 0) {
			System.out.println("the country array is empty");
		}
	}

	Country findByName(String name) {
		System.out.println("Finding the country its name :" + name);

		if (name != null) {
			boolean found = false;
			for (int i = 0; i < country.length; i++) {
				if (country[i] != null && name.equals(country[i].name)) {
					System.out.println("country found at the index of :" + i);
					found = true;
					return country[i];
				}
			}
			if (!found) {
				System.out.println("sry, country is not found try with new name");
				return null;
			}
		} else {
			System.out.println("name cannot be null");
			return null;
		}
		return null;
	}

	State findStateByStateName(String name) {
		System.out.println("Finding state by its name :" + name);
		if (name != null) {
			boolean found = false;
			for (Country arr : country) {
				if (arr != null && arr.states != null) {
					for(State arr1 : arr.states) {
						if (arr1 != null && name.equals(arr1.name)) {
							System.out.println("state is found ");
							found = true;
							return arr1;
						}
					}
				}
			}
			if (!found) {
				System.out.println("sry state is not found try with new name");
			}
		} else {
			System.out.println("name cannot be null");
		}
		return null;
	}
	
	City[] findAllCityByStateName(String name) {
		System.out.println("Findin all cities by state name :"+name);
	if(name != null){
		for(Country carr : country){
			if(carr != null && carr.states != null){
				for(State sarr : carr.states){
					if(sarr != null && name.equals(sarr.name)){
						if(sarr.cities != null){
							for(City ciarr : sarr.cities){
								if(ciarr != null){
									System.out.println("city : " + ciarr.name);
								}
							}
							return sarr.cities;
						}
					}
				}
			}
		}
		
		System.out.println("state not found");
	}
	else{
		System.out.println("name cannot be null");
	}
	
	return null;
}

int findNoOfDistrictsByCityName(String name){
	
	System.out.println("Finding number of district by city name :"+name);
	if(name != null){
		for(Country carr : country){
			if(carr != null && carr.states != null){
				for(State sarr : carr.states){
					if(sarr != null && sarr.cities != null){
						for(City ciarr : sarr.cities){
							if(ciarr != null && name.equals(ciarr.name)){
								if(ciarr.district != null){
									return ciarr.district.length;
								}
								else{
									return 0;
									}
							}
						}
					}
				}
			}
		}
		System.out.println("City not found");
	}
	else{
		System.out.println("name cannot be null");
	}
	return 0;
}

Country findByCollectorName(String collectorName){
	System.out.println("finding country by collector name :"+collectorName);
	if(collectorName != null){
		for(Country carr : country){
			if(carr != null && carr.states != null){
				for(State sarr : carr.states){
					if(sarr != null && sarr.cities != null){
						for(City ciarr : sarr.cities){
							if(ciarr != null && ciarr.district !=null){
								for(District darr : ciarr.district){
									if(darr != null && darr.collector !=null && collectorName.equals(darr.collector.name)){
										System.out.println("Collector name found and country name is :"+carr.name);
										return carr;
									}
								}
							}
						}
					}
				}
			}
		}
		System.out.println("Collector is not found");
	}
	else{
		System.out.println("Name cannot be null");
	}
	return null;
}

}