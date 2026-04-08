/*
11 non primitive data types Card,Charger,Lock,Tower,Day,Sand,Diamond,Sword,Acid,Burger,Flower
 //Another class 
 --> three instance variables 
 --> instance method : return one class from above
 */
 
 class Card{
	 
	double size;
	String type;
	String material;
	int noOfCards;
	
	Card(double size, String type, String material, int noOfCards){
		
		this.size= size;
		this.type = type;
		this.material = material;
		this.noOfCards = noOfCards;
	}
	
	public void display(){
		
		System.out.println("Size :"+ this.size);
		System.out.println("type :"+this.type);
		System.out.println("material :"+this.material);
		System.out.println("noOfCards :"+this.noOfCards);

	}
	 
 }