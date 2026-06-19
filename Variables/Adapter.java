class Adapter {
    public static void main(String[] args) {
        String brand="MI"; 
		int voltage=220; 
		String color="Black"; 
		boolean fastCharge=true; 
		double price=499;
		System.out.println("Before updation :");
        System.out.println("brand=" + brand);
        System.out.println("voltage=" + voltage);
        System.out.println("color=" + color);
        System.out.println("fastCharge=" + fastCharge);
        System.out.println("price=" + price+"\n");

        brand="Samsung"; 
		voltage=240; 
		color="White"; 
		fastCharge=false; 
		price=699;
		
        System.out.println("After updation :");
		System.out.println("brand=" + brand);
        System.out.println("voltage=" + voltage);
        System.out.println("color=" + color);
        System.out.println("fastCharge=" + fastCharge);
        System.out.println("price=" + price);
    }
}

