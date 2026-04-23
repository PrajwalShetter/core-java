class UPS{
	void powerSupply(){
		System.out.println("UPS provides power backup");
	}
}

class HomeUPS extends UPS{
	void use(){
		System.out.println("Home UPS is used");
	}
}

class SingleRunner{
	public static void main(String[] args){
		HomeUPS ups = new HomeUPS();
		ups.powerSupply();
		ups.use();
	}
}