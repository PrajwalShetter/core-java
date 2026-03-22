class Coffee{

	static void details(double temperature,int sugar,int price,int caffeineMg,boolean isHot){

		System.out.println("Temperature :"+temperature);
		if(temperature>=30 && temperature<=100){
			System.out.println("Temperature is suitable for coffee");
		}
		else{
			System.out.println("Temperature does not look suitable for coffee");
		}

		System.out.println("Sugar :"+sugar);
		if(sugar>=0 && sugar<=5){
			System.out.println("Sugar level looks balanced");
		}
		else{
			System.out.println("Sugar amount seems unusual");
		}

		System.out.println("Price :"+price);
		if(price>=10 && price<=500){
			System.out.println("Price appears reasonable for coffee");
		}
		else{
			System.out.println("Price seems unrealistic");
		}

		System.out.println("Caffeine :"+caffeineMg);
		if(caffeineMg>=20 && caffeineMg<=200){
			System.out.println("Caffeine level is typical");
		}
		else{
			System.out.println("Caffeine level is outside the common range");
		}

		System.out.println("Is Hot :"+isHot);
		if(isHot){
			System.out.println("Coffee is served hot");
		}
		else{
			System.out.println("Coffee is served cold");
		}
	}
}

class CoffeeRunner{

	public static void main(String[] args){

		double temperature=70;
		int sugar=2;
		int price=120;
		int caffeineMg=80;
		boolean isHot=true;

		Coffee.details(temperature,sugar,price,caffeineMg,isHot);

		Coffee.details(65,1,90,75,true);
	}
}