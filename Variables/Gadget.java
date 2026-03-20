class Gadget {
    public static void main(String[] args) {
        String name="SmartWatch"; 
		String brand="Boat"; 
		double price=2999; 
		boolean bluetooth=true; 
		int warranty=1;
		System.out.println("Before updation :");
        System.out.println("name=" + name);
        System.out.println("brand=" + brand);
        System.out.println("price=" + price);
        System.out.println("bluetooth=" + bluetooth);
        System.out.println("warranty=" + warranty+"\n");

        name="Earbuds"; 
		brand="Noise"; 
		price=1999; 
		bluetooth=false;
		warranty=2;
		
        System.out.println("After updation :");
		System.out.println("name=" + name);
        System.out.println("brand=" + brand);
        System.out.println("price=" + price);
        System.out.println("bluetooth=" + bluetooth);
        System.out.println("warranty=" + warranty);
    }
}

