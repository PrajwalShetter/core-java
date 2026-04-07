class Farm {

    SugarCane sugarCane;
    String farmerName;
    int quantity;
    QualityType qualityType;

    Farm(SugarCane sugarCane, String farmerName, int quantity, QualityType qualityType) {
        this.sugarCane = sugarCane;
        this.farmerName = farmerName;
        this.quantity = quantity;
        this.qualityType = qualityType;
    }

    void showDetails() {

        if (sugarCane != null) {
            sugarCane.display();
        } else {
            System.out.println("SugarCane is null");
        }

        System.out.println("Farmer Name: " + farmerName);
        System.out.println("Quantity: " + quantity);
        System.out.println("Quality Type: " + qualityType);
    }
}