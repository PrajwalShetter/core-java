class Button {
    public static void main(String[] args) {
        String type="Power";
		String color="Red"; 
		String shape="Round";
		boolean working=true; 
		double size=1.2;
		System.out.println("Before updation :");
        System.out.println("type=" + type);
        System.out.println("color=" + color);
        System.out.println("shape=" + shape);
        System.out.println("working=" + working);
        System.out.println("size=" + size+"\n");
		
        type="Volume"; 
		color="Black";  
		shape="Square"; 
		working=false; 
		size=1.5;
		
        System.out.println("After updation :");
		System.out.println("type=" + type);
        System.out.println("color=" + color);
        System.out.println("shape=" + shape);
        System.out.println("working=" + working);
        System.out.println("size=" + size);
    }
}

