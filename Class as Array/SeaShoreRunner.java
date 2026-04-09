class SeaShoreRunner{
	
	public static void main(String[] args){
		
		LightHouse lightHouseOne = new LightHouse("Beacon",LightType.LED,45);
		LightHouse lightHouseTwo = new LightHouse("Coastal Light",LightType.SOLAR,60);
		
		LightHouse lightHouses[] = {lightHouseOne,null,lightHouseTwo,null};
		
		SeaShore seaShore = new SeaShore("Marina Beach","India",lightHouses);
		seaShore.display();
	}
}