class Wire {
    public static void main(String[] args) {
        String type="Copper";
		String color="Red"; 
		double length=5.5; 
		boolean insulated=true; 
		double price=200;
		System.out.println("Before updation :");
        System.out.println("type=" + type);
        System.out.println("color=" + color);
        System.out.println("length=" + length);
        System.out.println("insulated=" + insulated);
        System.out.println("price=" + price+"\n");

        type="Aluminium"; 
		color="Black";
		length=10; 
		insulated=false; 
		price=350;
		
        System.out.println("After updation :");
		System.out.println("type=" + type);
        System.out.println("color=" + color);
        System.out.println("length=" + length);
        System.out.println("insulated=" + insulated);
        System.out.println("price=" + price);
    }
}

