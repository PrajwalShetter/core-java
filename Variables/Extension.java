class Extension {
    public static void main(String[] args) {
        String brand="GM"; 
		int sockets=4; 
		double wireLength=3; 
		boolean switch=true; 
		double price=550;
		System.out.println("Before updation :");
        System.out.println("brand=" + brand);
        System.out.println("sockets=" + sockets);
        System.out.println("wireLength=" + wireLength);
        System.out.println("switch=" + switch);
        System.out.println("price=" + price+"\n");

		brand="Anchor"; 
		sockets=5; 
		wireLength=5; 
		switch=false; 
		price=750;
		
        System.out.println("After updation :");
        System.out.println("brand=" + brand);
        System.out.println("sockets=" + sockets);
        System.out.println("wireLength=" + wireLength);
        System.out.println("switch=" + switch);
        System.out.println("price=" + price);
    }
}

