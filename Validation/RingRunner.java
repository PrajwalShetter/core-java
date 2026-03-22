class Ring{
	static void details(double weight, double diameter,int cost,int noOFStones,boolean isGold ){
		System.out.println("weight :"+weight);
		if(weight>=1 && weight<=20){
			System.out.println(" weight looks good");
		}
		else{
			System.out.println("weight is unusuall for ring");
		}
		
		System.out.println("Diameter :"+diameter);
		if(diameter>=10 && diameter<=30){
			System.out.println("Diameter is within normal size range");
		}
		else{
			System.out.println("Diameter is outside the expected range");
		}

		System.out.println("Cost :"+cost);
		if(cost>=500 && cost<=500000){
			System.out.println("Cost appears reasonable");
		}
		else{
			System.out.println("Cost value looks unrealistic");
		}

		System.out.println("Number Of Stones :"+noOFStones);
		if(noOFStones>=0 && noOFStones<=10){
			System.out.println("Stone count is acceptable");
		}
		else{
			System.out.println("Stone count is not typical");
		}

		System.out.println("Is Gold :"+isGold);
		if(isGold){
			System.out.println("This ring is made of gold");
		}
		else{
			System.out.println("This ring is made of another material");
		}
	}
}

class RingRunner{

	public static void main(String[] args){

		double weight=5.5;
		double diameter=18.2;
		int cost=25000;
		int noOFStones=3;
		boolean isGold=true;

		Ring.details(weight,diameter,cost,noOFStones,isGold);

		Ring.details(7.2,20.5,15000,2,true);
	
}
}