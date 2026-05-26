package com.prajwal.learnequlsmethod;

public class Sensor {

    private String sensorType;
    private double range;
    private double accuracy;
    private boolean isActive;
    private String manufacturer;

    public Sensor() {
    }

    public Sensor(String sensorType, double range, double accuracy, boolean isActive, String manufacturer) {
        this.sensorType = sensorType;
        this.range = range;
        this.accuracy = accuracy;
        this.isActive = isActive;
        this.manufacturer = manufacturer;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof Sensor){
                Sensor sensor = (Sensor) obj;
                if(this.sensorType.equals(sensor.sensorType) && this.accuracy == sensor.accuracy);
                return true;
            }
        }
        return false;
    }
    public String getSensorType() {
        return sensorType;
    }

    public void setSensorType(String sensorType) {
        this.sensorType = sensorType;
    }

    public double getRange() {
        return range;
    }

    public void setRange(double range) {
        this.range = range;
    }

    public double getAccuracy() {
        return accuracy;
    }

    public void setAccuracy(double accuracy) {
        this.accuracy = accuracy;
    }

    public boolean isActive() {
        return isActive;
    }

    public void setActive(boolean active) {
        isActive = active;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }
}
