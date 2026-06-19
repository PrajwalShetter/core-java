class Bracelet {
    public static void main(String[] args) {
        String material="Gold"; 
		String color="Yellow";
		double weight=15.5;
		boolean costly=true; 
		double price=45000;
		System.out.println("Before updation :");
		System.out.println("material=" + material);
        System.out.println("color=" + color);
        System.out.println("weight=" + weight);
        System.out.println("costly=" + costly);
        System.out.println("price=" + price+"\n");

        material="Silver"; 
		color="White"; 
		weight=10; 
		costly=false; 
		price=5000;
		
        System.out.println("After updation :");
		System.out.println("material=" + material);
        System.out.println("color=" + color);
        System.out.println("weight=" + weight);
        System.out.println("costly=" + costly);
        System.out.println("price=" + price);
    }
}

