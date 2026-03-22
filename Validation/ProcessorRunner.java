/*
NOTE : InvokNOTE : Invoke each method twice, one passing explicit and one passing implicit 
Processor.details(speed,gen,storage)
Spoon.details(weight,price,length)
 Ring.details(weight,diameter,cost,noOFStones,isGold) 
 Paper.details(height,weight,cost,goodQuality,width); 
 Write below classes, add details method with least 5 primitive parameters and validate Key ,Bell ,Coffee,Ice ,Chicken 
 
 */
 
 class Processor{
	 
	 static void details(double speed, int gen, int storage){
			
		System.out.println("Storage :"+storage);
		if(storage>=1 && storage <= 512){
			System.out.println("Storage is Valid");
		}
		else{
			System.out.println("Storage is Invalid");
		}
		
		System.out.println("gen :"+gen);
		if(gen>=1 && gen<=13){
			System.out.println("Gen is Valid");
		}
		else{
			System.out.println("Gen is not Valid");
		}
		
		System.out.println("speed :"+speed);
		if(speed>=1 && speed <=5){
			System.out.println("Speed is valid");
		}
		else{
			System.out.println("Speed is In Valid");
		}
	 }
	 
	 
 }
 
 class ProcessorRunner{
	 
	 public static void main(String[] args){
		 
		 double speed = 2.5;
		int gen = 13;
		int storage = 256;
		
		Processor.details(speed, gen, storage);
		
		
		Processor.details(4.5, 8, 128);
	 }
 }
 