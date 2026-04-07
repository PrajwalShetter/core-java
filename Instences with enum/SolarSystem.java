class SolarSystem {

    SolarPanel solarPanel;
    String location;
    int numberOfPanels;
    PanelType panelType;

    SolarSystem(SolarPanel solarPanel, String location, int numberOfPanels, PanelType panelType) {
        this.solarPanel = solarPanel;
        this.location = location;
        this.numberOfPanels = numberOfPanels;
        this.panelType = panelType;
    }

    void showDetails() {

        if (solarPanel != null) {
            solarPanel.display();
        } else {
            System.out.println("SolarPanel is null");
        }

        System.out.println("Location: " + location);
        System.out.println("Number of Panels: " + numberOfPanels);
        System.out.println("Panel Type: " + panelType);
    }
}