class Rock {

    String type;
    String color;
    int weight;
    String origin;
    boolean hard;
    long id;
    String material;
    double density;
    double size;
    boolean valuable;

    
    Rock(String type, String color, int weight, String origin,
         boolean hard, long id, String material,
         double density, double size, boolean valuable) {

        this.type = type;
        this.color = color;
        this.weight = weight;
        this.origin = origin;
        this.hard = hard;
        this.id = id;
        this.material = material;
        this.density = density;
        this.size = size;
        this.valuable = valuable;
    }
}