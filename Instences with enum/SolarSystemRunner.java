class SolarSystemRunner {

    public static void main(String... args) {

        SolarPanel solarPanel = new SolarPanel("Tata Power", 500);

        SolarSystem system = new SolarSystem(solarPanel, "Bangalore", 10, PanelType.MONOCRYSTALLINE);

        system.showDetails();
    }
}