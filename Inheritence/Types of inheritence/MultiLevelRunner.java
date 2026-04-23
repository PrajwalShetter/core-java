class UPS{
	void powerSupply(){
		System.out.println("UPS provides power backup");
	}
}

class InverterUPS extends UPS{
	void convert(){
		System.out.println("Converting DC to AC");
	}
}

class SmartUPS extends InverterUPS{
	void monitor(){
		System.out.println("Smart monitoring enabled");
	}
}

class MultiLevelRunner{
	public static void main(String[] args){
		SmartUPS smartups = new SmartUPS();
		smartups.powerSupply();
		smartups.convert();
		smartups.monitor();
	}
}