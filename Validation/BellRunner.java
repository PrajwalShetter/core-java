class Bell{

	static void details(double weight,int cost,double diameter,char bellType,boolean isMetal){

		System.out.println("Weight :"+weight);
		if(weight>=100 && weight<=5000){
			System.out.println("Weight seems suitable for a bell");
		}
		else{
			System.out.println("Weight does not look typical for a bell");
		}

		System.out.println("Cost :"+cost);
		if(cost>=50 && cost<=10000){
			System.out.println("Cost appears reasonable");
		}
		else{
			System.out.println("Cost seems unusual");
		}

		System.out.println("Diameter :"+diameter);
		if(diameter>=5 && diameter<=50){
			System.out.println("Diameter is within a common size range");
		}
		else{
			System.out.println("Diameter is outside the expected range");
		}

		System.out.println("Bell Type :"+bellType);
		if(bellType=='S' || bellType=='T' || bellType=='C'){
			System.out.println("Bell type is recognized");
		}
		else{
			System.out.println("Bell type is unfamiliar");
		}

		System.out.println("Is Metal :"+isMetal);
		if(isMetal){
			System.out.println("Bell is made of metal");
		}
		else{
			System.out.println("Bell is made of another material");
		}
	}
}

class BellRunner{

	public static void main(String[] args){

		double weight=800;
		int cost=1200;
		double diameter=18.5;
		char bellType='T';
		boolean isMetal=true;

		Bell.details(weight,cost,diameter,bellType,isMetal);

		Bell.details(650,900,15.2,'S',true);
	}
}