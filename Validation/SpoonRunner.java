class Spoon{
	 
	static void details(int price, double weight, int length){
		
		System.out.println("Length :"+length);
		if(length >= 5 && length <= 25){
			System.out.println("Length is Valid");
		}
		else{
			System.out.println("Length is Invalid");
		}
		
		System.out.println("Price :"+price);
		if(price >= 10 && price <= 500){
			System.out.println("Price is Valid");
		}
		else{
			System.out.println("Price is Invalid");
		}
		
		System.out.println("Weight :"+weight);
		if(weight >= 5 && weight <= 100){
			System.out.println("Weight is Valid");
		}
		else{
			System.out.println("Weight is Invalid");
		}
	}
}

class SpoonRunner{
	 
	public static void main(String[] args){
		 
		double weight = 25.5;
		int price = 150;
		int length = 18;
		
		Spoon.details( price, weight, length); 
		
		Spoon.details( 200, 20.5, 15); 
	}
}