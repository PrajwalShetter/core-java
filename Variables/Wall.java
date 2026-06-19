class Wall {
    public static void main(String[] args) {

        String color = "Blue";
        double height = 10.5;
        double width = 15.2;
        String material = "Cement";
        boolean painted = true;
		
		System.out.println("Before updation :");
		System.out.println("color=" + color);
        System.out.println("height=" + height);
        System.out.println("width=" + width);
        System.out.println("material=" + material);
        System.out.println("painted=" + painted+"\n");

        color = "White";
        height = 12.0;
        width = 18.0;
        material = "Brick";
        painted = false;
		
		
        System.out.println("After updation :");
		System.out.println("color=" + color);
        System.out.println("height=" + height);
        System.out.println("width=" + width);
        System.out.println("material=" + material);
        System.out.println("painted=" + painted);
    }
}