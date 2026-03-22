class Ice{

	static void details(double temperature,double weight,int cubes,int hardness,boolean isClean){

		System.out.println("Temperature :"+temperature);
		if(temperature<=0 && temperature>=-20){
			System.out.println("Temperature is appropriate for ice");
		}
		else{
			System.out.println("Temperature does not represent frozen ice");
		}

		System.out.println("Weight :"+weight);
		if(weight>=1 && weight<=500){
			System.out.println("Weight looks normal for ice");
		}
		else{
			System.out.println("Weight seems unusual");
		}

		System.out.println("Cubes :"+cubes);
		if(cubes>=1 && cubes<=50){
			System.out.println("Cube count is reasonable");
		}
		else{
			System.out.println("Cube count looks unrealistic");
		}

		System.out.println("Hardness :"+hardness);
		if(hardness>=1 && hardness<=10){
			System.out.println("Hardness level looks acceptable");
		}
		else{
			System.out.println("Hardness value seems incorrect");
		}

		System.out.println("Is Clean :"+isClean);
		if(isClean){
			System.out.println("Ice appears clean and usable");
		}
		else{
			System.out.println("Ice may not be suitable for consumption");
		}
	}
}

class IceRunner{

	public static void main(String[] args){

		double temperature=-5;
		double weight=120;
		int cubes=12;
		int hardness=7;
		boolean isClean=true;

		Ice.details(temperature,weight,cubes,hardness,isClean);

		Ice.details(-8,100,10,6,true);
	}
}