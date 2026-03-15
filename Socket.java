class Socket {
    public static void main(String[] args) {

        String brand = "Anchor";
        int pins = 3;
        String color = "White";
        boolean working = true;
        double price = 120;
		System.out.println("Before updation :");
        System.out.println("brand=" + brand);
        System.out.println("pins=" + pins);
        System.out.println("color=" + color);
        System.out.println("working=" + working);
        System.out.println("price=" + price+"\n");

        brand = "Havells";
        pins = 2;
        color = "Black";
        working = false;
        price = 150;
		
		System.out.println("After updation :");
        System.out.println("brand=" + brand);
        System.out.println("pins=" + pins);
        System.out.println("color=" + color);
        System.out.println("working=" + working);
        System.out.println("price=" + price);
    }
}