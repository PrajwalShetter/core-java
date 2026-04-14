class SolarSystemRunner {
    public static void main(String[] args) {

        SolarSystem store = new SolarSystem();

        store.save("Mercury");
        store.save("Venus");
        store.save("Earth");
        store.save("Mars");
        store.save("Jupiter");

        store.search("Earth");      
        store.search("Pluto");      
    }
}