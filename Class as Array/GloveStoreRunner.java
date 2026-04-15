class GloveStoreRunner{
	
	public static void main(String[] args){
		
		Glove[] gloves = new Glove[20];
		
		gloves[0] = new Glove("Winter","Nike","Wool","M","Black",1200.00,true,true,"Outdoor",10);
		gloves[1] = new Glove("Sports","Adidas","Leather","L","White",1500.00,false,false,"Cricket",8);
		gloves[2] = new Glove("Medical","3M","Latex","S","White",500.00,true,false,"Hospital",50);
		gloves[3] = new Glove("Industrial","Bosch","Rubber","L","Yellow",700.00,true,false,"Factory",20);
		gloves[4] = new Glove("Winter","Puma","Wool","M","Grey",1100.00,true,true,"Outdoor",12);
		gloves[5] = new Glove("Sports","Reebok","Leather","XL","Black",1400.00,false,false,"Gym",6);
		gloves[6] = new Glove("Medical","CarePlus","Nitrile","M","Blue",600.00,true,false,"Hospital",40);
		gloves[7] = new Glove("Industrial","Tata","Rubber","L","Orange",800.00,true,false,"Construction",15);
		gloves[8] = new Glove("Winter","NorthFace","Wool","L","Black",2000.00,true,true,"Outdoor",9);
		gloves[9] = new Glove("Sports","SG","Leather","M","White",1300.00,false,false,"Cricket",7);
		gloves[10] = new Glove("Medical","Medline","Latex","S","White",550.00,true,false,"Hospital",60);
		gloves[11] = new Glove("Industrial","JSW","Rubber","XL","Yellow",900.00,true,false,"Factory",18);
		gloves[12] = new Glove("Winter","Decathlon","Wool","M","Blue",1000.00,true,true,"Outdoor",11);
		gloves[13] = new Glove("Sports","Yonex","Synthetic","L","Red",1600.00,false,false,"Badminton",5);
		gloves[14] = new Glove("Medical","Apollo","Nitrile","M","Blue",650.00,true,false,"Hospital",45);
		gloves[15] = new Glove("Industrial","L&T","Rubber","L","Green",850.00,true,false,"Construction",14);
		gloves[16] = new Glove("Winter","Columbia","Wool","XL","Black",1800.00,true,true,"Outdoor",8);
		gloves[17] = new Glove("Sports","MRF","Leather","M","White",1700.00,false,false,"Cricket",6);
		gloves[18] = new Glove("Medical","HealthCare","Latex","S","White",520.00,true,false,"Hospital",55);
		gloves[19] = new Glove("Industrial","Kirloskar","Rubber","XL","Orange",920.00,true,false,"Factory",16);
		
		GloveStore store = new GloveStore();
		
		for(int i=0; i<gloves.length; i++){
			store.store(gloves[i]);
		}
		
		store.display();
	}
}