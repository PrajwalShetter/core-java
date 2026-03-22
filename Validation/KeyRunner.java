class Key{

	static void details(int length,double weight,int cost,char keyType,boolean isDuplicate){

		System.out.println("Length :"+length);
		if(length>=3 && length<=12){
			System.out.println("Length looks appropriate for a key");
		}
		else{
			System.out.println("Length seems unusual for a key");
		}

		System.out.println("Weight :"+weight);
		if(weight>=5 && weight<=50){
			System.out.println("Weight appears reasonable");
		}
		else{
			System.out.println("Weight is outside the expected range");
		}

		System.out.println("Cost :"+cost);
		if(cost>=10 && cost<=2000){
			System.out.println("Cost seems acceptable");
		}
		else{
			System.out.println("Cost looks unrealistic");
		}

		System.out.println("Key Type :"+keyType);
		if(keyType=='A' || keyType=='B' || keyType=='C'){
			System.out.println("Key type is recognizable");
		}
		else{
			System.out.println("Key type is not common");
		}

		System.out.println("Is Duplicate :"+isDuplicate);
		if(isDuplicate){
			System.out.println("This key is a duplicate");
		}
		else{
			System.out.println("This key appears  an original");
		}
	}
}

class KeyRunner{

	public static void main(String[] args){

		int length=6;
		double weight=20.5;
		int cost=150;
		char keyType='A';
		boolean isDuplicate=false;

		Key.details(length,weight,cost,keyType,isDuplicate);

		Key.details(5,18.0,120,'B',true);
	}
}