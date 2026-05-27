package com.prajwal.learnequlsmethod;

public class TransportMode {
    private String modeName;
    private int seatingCapacity;
    private double fare;
    private boolean isPublic;
    private String fuelType;

    public TransportMode() {
    }

    public TransportMode(String modeName, int seatingCapacity, double fare, boolean isPublic, String fuelType) {
        this.modeName = modeName;
        this.seatingCapacity = seatingCapacity;
        this.fare = fare;
        this.isPublic = isPublic;
        this.fuelType = fuelType;
    }

    public String getModeName() {
        return modeName;
    }

    public void setModeName(String modeName) {
        this.modeName = modeName;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public double getFare() {
        return fare;
    }

    public void setFare(double fare) {
        this.fare = fare;
    }

    public boolean isPublic() {
        return isPublic;
    }

    public void setPublic(boolean aPublic) {
        isPublic = aPublic;
    }

    public String getFuelType() {
        return fuelType;
    }

    public void setFuelType(String fuelType) {
        this.fuelType = fuelType;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null) {
            if(obj instanceof TransportMode){
                TransportMode transportMode = (TransportMode) obj;
                if(this.modeName.equals(transportMode.modeName) && this.fare== transportMode.fare){
                    return true;
                }
            }
        }
        return false;
    }


}
