class TissueStoreRunner{
	
	public static void main(String[] args){
		
		Tissue[] tissues = new Tissue[20];
		
		tissues[0] = new Tissue("Facial","Kleenex","Paper",2,100,true,"Aloe Vera",120.00,"White",true);
		tissues[1] = new Tissue("Toilet","Origami","Paper",3,200,false,"None",150.00,"White",true);
		tissues[2] = new Tissue("Facial","Softy","Paper",2,120,true,"Rose",130.00,"White",true);
		tissues[3] = new Tissue("Kitchen","Presto","Paper",2,80,false,"None",90.00,"White",true);
		tissues[4] = new Tissue("Facial","Bella","Paper",3,150,true,"Lemon",160.00,"White",true);
		tissues[5] = new Tissue("Toilet","Scott","Paper",2,180,false,"None",140.00,"White",true);
		tissues[6] = new Tissue("Kitchen","Selpak","Paper",2,90,false,"None",100.00,"White",true);
		tissues[7] = new Tissue("Facial","Paseo","Paper",3,110,true,"Lavender",170.00,"White",true);
		tissues[8] = new Tissue("Toilet","Charmin","Paper",3,210,false,"None",180.00,"White",true);
		tissues[9] = new Tissue("Facial","Velvet","Paper",2,95,true,"Mint",125.00,"White",true);
		tissues[10] = new Tissue("Kitchen","Zee","Paper",2,85,false,"None",95.00,"White",true);
		tissues[11] = new Tissue("Facial","Premier","Paper",3,130,true,"Jasmine",165.00,"White",true);
		tissues[12] = new Tissue("Toilet","Angel Soft","Paper",2,170,false,"None",145.00,"White",true);
		tissues[13] = new Tissue("Kitchen","Nova","Paper",2,75,false,"None",85.00,"White",true);
		tissues[14] = new Tissue("Facial","Lotus","Paper",3,140,true,"Sandal",175.00,"White",true);
		tissues[15] = new Tissue("Toilet","Cottonelle","Paper",2,190,false,"None",155.00,"White",true);
		tissues[16] = new Tissue("Kitchen","EcoSoft","Paper",2,88,false,"None",105.00,"White",true);
		tissues[17] = new Tissue("Facial","Bloom","Paper",3,125,true,"Peach",160.00,"White",true);
		tissues[18] = new Tissue("Toilet","FreshSoft","Paper",2,160,false,"None",135.00,"White",true);
		tissues[19] = new Tissue("Kitchen","Daily","Paper",2,70,false,"None",80.00,"White",true);
		
		TissueStore store = new TissueStore();
		
		for(int i=0; i<tissues.length; i++){
			store.store(tissues[i]);
		}
		
		store.display();
	}
}