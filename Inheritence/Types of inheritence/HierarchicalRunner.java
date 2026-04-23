class UPS{
	void powerSupply(){
		System.out.println("UPS provides power backup");
	}
}

class HomeUPS extends UPS{
	void homeUse(){
		System.out.println("Used in home");
	}
}

class OfficeUPS extends UPS{
	void officeUse(){
		System.out.println("Used in office");
	}
}

class HierarchicalRunner{
	public static void main(String[] args){
		HomeUPS home = new HomeUPS();
		OfficeUPS office = new OfficeUPS();
		
		home.powerSupply();
		home.homeUse();
		
		office.powerSupply();
		office.officeUse();
	}
}	