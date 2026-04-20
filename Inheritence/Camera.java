class Camera{
	 
	 String brand;
	 double price;
	 
	 Camera(String brand, double price){
		 this.brand = brand;
		 this.price = price;
	 }
	 
	 void display(){
		System.out.println("brand : " + this.brand);
		System.out.println("price : " + this.price);
	}
 }
 
 