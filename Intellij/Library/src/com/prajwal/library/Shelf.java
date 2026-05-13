package com.prajwal.library;

public class Shelf {
    private int noOfShelf;
    private String shelfType;
    private int warrenty;
    private int qualityRating;

    public void setNoOfShelf(int noOfShelf) {
        this.noOfShelf = noOfShelf;
    }

    public void setShelfType(String shelfType) {
        this.shelfType = shelfType;
    }

    public void setQualityRating(int qualityRating) {
        this.qualityRating = qualityRating;
    }

    public void setWarrenty(int warrenty) {
        this.warrenty = warrenty;
    }

    @Override
    public String toString() {
        return "noofshelf :"+noOfShelf + " shelftype :"+shelfType + " quality :"+qualityRating + " warrenty :"+warrenty;

    }

    public int getNoOfShelf() {
        return noOfShelf;
    }

    public String getShelfType() {
        return shelfType;
    }

    public int getQualityRating() {
        return qualityRating;
    }

    public int getWarrenty() {
        return warrenty;
    }
}
