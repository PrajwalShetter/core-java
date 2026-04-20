class DSLR extends Camera{
	 
	 DSLR(String brand, double price){
		super(brand, price);
	 }
 }
 
 class CameraRunner{
	 
	 public static void main(String[] args){
		 
	 Camera camera1 = new Camera("Sony", 10000);
	 Camera camera2 = new Camera("Samsong", 90000);
	 
	 camera1.display();
	 camera2.display();
	 
	 }
 }