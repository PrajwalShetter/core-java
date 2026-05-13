package com.prajwal.library;

public class Inogration {
    private String date;
    private int activities;
    private String chifeGuest;
    private int fond;

    public void setDate(String date) {
        this.date = date;
    }

    public void setActivities(int activities) {
        this.activities = activities;
    }

    public void setChifeGuest(String chifeGuest) {
        this.chifeGuest = chifeGuest;
    }

    public void setFound(int fond) {
        this.fond = fond;
    }

    public String toString(){
        return "Date :"+date + "Activities :"+ activities + " chiefguest "+chifeGuest +" fund :"+ fond;
    }

    public String getDate() {
        return date;
    }

    public int getActivities() {
        return activities;
    }

    public String getChifeGuest() {
        return chifeGuest;
    }

    public int getFond() {
        return fond;
    }
}
