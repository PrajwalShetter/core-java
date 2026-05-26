package com.prajwal.learnequlsmethod;

public class City {
    private String cityName;
    private int noOfPopulation;
    private  String MLA;
    private int area;
    private String distName;

    public City() {
    }


    public City(String cityName, int noOfPopulation, String MLA, int area, String distName) {
        this.cityName = cityName;
        this.noOfPopulation = noOfPopulation;
        this.MLA = MLA;
        this.area = area;
        this.distName = distName;
    }
    public boolean equals(Object obj) {
        if(obj != null) {
            if(obj instanceof City){
                City city = (City) obj;
                if(this.cityName.equals(city.cityName) && this.MLA.equals(city.MLA)){
                    return true;
                }
            }
        }
        return false;
    }
    public String getCityName() {
        return cityName;
    }

    public void setCityName(String cityName) {
        this.cityName = cityName;
    }

    public int getNoOfPopulation() {
        return noOfPopulation;
    }

    public void setNoOfPopulation(int noOfPopulation) {
        this.noOfPopulation = noOfPopulation;
    }

    public String getMLA() {
        return MLA;
    }

    public void setMLA(String MLA) {
        this.MLA = MLA;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public String getDistName() {
        return distName;
    }

    public void setDistName(String distName) {
        this.distName = distName;
    }
}

