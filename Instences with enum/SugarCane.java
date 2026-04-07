class SugarCane {

    String origin;
    double height;

    SugarCane(String origin, double height) {
        this.origin = origin;
        this.height = height;
    }

    void display() {
        System.out.println("Origin: " + origin);
        System.out.println("Height: " + height);
    }
}