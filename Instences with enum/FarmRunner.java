class FarmRunner {

    public static void main(String... args) {

        SugarCane sugarCane = new SugarCane("Mandya", 10.5);

        Farm farm = new Farm(sugarCane, "Ramesh", 200, QualityType.HIGH);

        farm.showDetails();
    }
}