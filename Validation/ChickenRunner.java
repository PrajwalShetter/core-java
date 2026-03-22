class Chicken{

	static void details(double weight,int price,int pieces,double temperature,boolean isFresh){

		System.out.println("Weight :"+weight);
		if(weight>=0.5 && weight<=5){
			System.out.println("Weight looks normal for chicken");
		}
		else{
			System.out.println("Weight seems unusual");
		}

		System.out.println("Price :"+price);
		if(price>=100 && price<=2000){
			System.out.println("Price seems reasonable");
		}
		else{
			System.out.println("Price does not look realistic");
		}

		System.out.println("Pieces :"+pieces);
		if(pieces>=1 && pieces<=20){
			System.out.println("Piece count looks fine");
		}
		else{
			System.out.println("Piece count seems unusual");
		}

		System.out.println("Temperature :"+temperature);
		if(temperature>=0 && temperature<=10){
			System.out.println("Storage temperature looks safe");
		}
		else{
			System.out.println("Temperature may not be suitable for storage");
		}

		System.out.println("Is Fresh :"+isFresh);
		if(isFresh){
			System.out.println("Chicken appears fresh");
		}
		else{
			System.out.println("Chicken may not be fresh");
		}
	}
}

class ChickenRunner{

	public static void main(String[] args){

		double weight=1.5;
		int price=350;
		int pieces=8;
		double temperature=4;
		boolean isFresh=true;

		Chicken.details(weight,price,pieces,temperature,isFresh);

		Chicken.details(2.0,420,10,5,true);
	}
}