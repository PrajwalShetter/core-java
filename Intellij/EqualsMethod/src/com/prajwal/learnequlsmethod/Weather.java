package com.prajwal.learnequlsmethod;

public class Weather {

    private int humidity;
    private double temperature;
    private double windSpeed;
    private boolean isRaining;
    private String climate;

    public Weather() {
    }

    public Weather(int humidity, double temperature, double windSpeed, boolean isRaining, String climate) {
        this.humidity = humidity;
        this.temperature = temperature;
        this.windSpeed = windSpeed;
        this.isRaining = isRaining;
        this.climate = climate;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof  Weather){
                Weather weather = (Weather) obj;
                if(this.climate.equals(weather.climate) && this.humidity==weather.humidity){
                    return true;
                }
            }
        }
        return false;
    }

    public int getHumidity() {
        return humidity;
    }

    public void setHumidity(int humidity) {
        this.humidity = humidity;
    }

    public double getTemperature() {
        return temperature;
    }

    public void setTemperature(double temperature) {
        this.temperature = temperature;
    }

    public double getWindSpeed() {
        return windSpeed;
    }

    public void setWindSpeed(double windSpeed) {
        this.windSpeed = windSpeed;
    }

    public boolean isRaining() {
        return isRaining;
    }

    public void setRaining(boolean raining) {
        isRaining = raining;
    }

    public String getClimate() {
        return climate;
    }

    public void setClimate(String climate) {
        this.climate = climate;
    }
}
