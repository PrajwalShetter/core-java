class Specs {
    public static void main(String[] args) {
        String brand="RayBan";
		String frameColor="Black";
		double price=2500; 
		boolean power=true;
		String type="FullFrame";
		System.out.println("Before updation :");
        System.out.println("brand=" + brand);
        System.out.println("frameColor=" + frameColor);
        System.out.println("price=" + price);
        System.out.println("power=" + power);
        System.out.println("type=" + type+"\n");

        brand="Fastrack"; 
		frameColor="Blue"; 
		price=1500; 
		power=false;
		type="HalfFrame";
		
        System.out.println("After updation :");
		System.out.println("brand=" + brand);
        System.out.println("frameColor=" + frameColor);
        System.out.println("price=" + price);
        System.out.println("power=" + power);
        System.out.println("type=" + type);
    }
}

