class Hairband {
    public static void main(String[] args) {
        String color="Pink"; 
		String material="Plastic"; 
		double price=50; 
		boolean elastic=true; 
		String size="Medium";
		System.out.println("Before Updation :");
        System.out.println("color=" + color);
        System.out.println("material=" + material);
        System.out.println("price=" + price);
        System.out.println("elastic=" + elastic);
        System.out.println("size=" + size+"\n");

        color="Black";
		material="Cloth"; 
		price=80;
		elastic=false; 
		size="Large";
		System.out.println("After Updation :");
        System.out.println("color=" + color);
        System.out.println("material=" + material);
        System.out.println("price=" + price);
        System.out.println("elastic=" + elastic);
        System.out.println("size=" + size);
    }
}