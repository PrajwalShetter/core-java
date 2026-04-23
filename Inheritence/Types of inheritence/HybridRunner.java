class UPS{
	void powerSupply(){
		System.out.println("UPS provides power backup");
	}
}

interface SmartFeatures{
	void wifiControl();
}

class HybridUPS extends UPS implements SmartFeatures{
	public void wifiControl(){
		System.out.println("Controlling UPS via WiFi");
	}
}

class HybridRunner{
	public static void main(String[] args){
		HybridUPS hyb = new HybridUPS();
		hyb.powerSupply();
		hyb.wifiControl();
	}
}