class IceCream {
    public static void main(String[] args) {

        String flavor = "Chocolate";
        int scoops = 2;
        double price = 80;
        char size = 'M';
        boolean nuts = true;

        System.out.println("flavor=" + flavor);
        System.out.println("scoops=" + scoops);
        System.out.println("price=" + price);
        System.out.println("size=" + size);
        System.out.println("nuts=" + nuts+"\n");

        flavor = "Vanilla";
        scoops = 1;
        price = 50;
        size = 'S';
        nuts = false;

        System.out.println("flavor=" + flavor);
        System.out.println("scoops=" + scoops);
        System.out.println("price=" + price);
        System.out.println("size=" + size);
        System.out.println("nuts=" + nuts);
    }
}