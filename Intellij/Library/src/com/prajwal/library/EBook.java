package com.prajwal.library;

public class EBook {
    private int memorySpace;
    private double cost;
    private String bookName;
    private String publishedDate;

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public void setMemorySpace(int memorySpace) {
        this.memorySpace = memorySpace;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    @Override
    public String toString() {
        return "BookName :"+bookName + " cost :"+cost + " memorySpace :"+memorySpace + " published date:"+ publishedDate;
    }

    public String getBookName() {
        return bookName;
    }

    public double getCost() {
        return cost;
    }

    public int getMemorySpace() {
        return memorySpace;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

}
