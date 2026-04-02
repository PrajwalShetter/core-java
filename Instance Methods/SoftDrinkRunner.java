class SoftDrinkRunner {

    public static void main(String... args) {

        SoftDrink d1 = new SoftDrink("Coca Cola", "CocaCola", "Cola",
                500, 40, "Dark Brown", true, "Bottle", 35, "12-2026");
        d1.show();

        SoftDrink d2 = new SoftDrink("Pepsi", "PepsiCo", "Cola",
                750, 50, "Black", true, "Can", 38, "11-2026");
        d2.show();

        SoftDrink d3 = new SoftDrink("Fanta", "CocaCola", "Orange",
                600, 45, "Orange", true, "Bottle", 30, "10-2026");
        d3.show();
    }
}