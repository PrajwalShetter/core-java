class BroccoliStoreRunner{
	
	public static void main(String[] args){
		
		Broccoli[] broccolis = new Broccoli[20];
		
		broccolis[0] = new Broccoli("Broccoli","Green","India",1.2,80.00,true,"Fresh",10,true,"Tree");
		broccolis[1] = new Broccoli("Broccoli","Dark Green","USA",1.5,120.00,false,"Frozen",8,false,"Tree");
		broccolis[2] = new Broccoli("Broccoli","Light Green","UK",1.0,90.00,true,"Fresh",12,true,"Tree");
		broccolis[3] = new Broccoli("Broccoli","Green","Australia",1.3,100.00,false,"Frozen",9,false,"Tree");
		broccolis[4] = new Broccoli("Broccoli","Dark Green","India",1.4,85.00,true,"Fresh",11,true,"Tree");
		broccolis[5] = new Broccoli("Broccoli","Green","Canada",1.1,110.00,false,"Frozen",7,false,"Tree");
		broccolis[6] = new Broccoli("Broccoli","Light Green","India",1.6,95.00,true,"Fresh",13,true,"Tree");
		broccolis[7] = new Broccoli("Broccoli","Green","USA",1.2,105.00,false,"Frozen",6,false,"Tree");
		broccolis[8] = new Broccoli("Broccoli","Dark Green","UK",1.7,130.00,true,"Fresh",14,true,"Tree");
		broccolis[9] = new Broccoli("Broccoli","Green","India",1.3,88.00,false,"Frozen",10,false,"Tree");
		broccolis[10] = new Broccoli("Broccoli","Light Green","Australia",1.2,92.00,true,"Fresh",9,true,"Tree");
		broccolis[11] = new Broccoli("Broccoli","Green","India",1.5,97.00,false,"Frozen",8,false,"Tree");
		broccolis[12] = new Broccoli("Broccoli","Dark Green","Canada",1.8,140.00,true,"Fresh",15,true,"Tree");
		broccolis[13] = new Broccoli("Broccoli","Green","India",1.1,83.00,false,"Frozen",7,false,"Tree");
		broccolis[14] = new Broccoli("Broccoli","Light Green","USA",1.4,115.00,true,"Fresh",12,true,"Tree");
		broccolis[15] = new Broccoli("Broccoli","Green","UK",1.3,102.00,false,"Frozen",9,false,"Tree");
		broccolis[16] = new Broccoli("Broccoli","Dark Green","India",1.6,98.00,true,"Fresh",13,true,"Tree");
		broccolis[17] = new Broccoli("Broccoli","Green","Australia",1.2,89.00,false,"Frozen",8,false,"Tree");
		broccolis[18] = new Broccoli("Broccoli","Light Green","Canada",1.7,125.00,true,"Fresh",14,true,"Tree");
		broccolis[19] = new Broccoli("Broccoli","Green","India",1.3,90.00,false,"Frozen",10,false,"Tree");
		
		BroccoliStore store = new BroccoliStore();
		
		for(int i=0; i<broccolis.length; i++){
			store.store(broccolis[i]);
		}
		
		store.display();
	}
}