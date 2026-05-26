package com.prajwal.learnequlsmethod;

public class Report {

    private String name;
    private int noOfPages;
    private double lineSpace;
    private String font;
    private double cost;

    public Report() {

    }

    public Report(String name, int noOfPages, double lineSpace, String font, double cost) {
        this.name = name;
        this.noOfPages = noOfPages;
        this.lineSpace = lineSpace;
        this.font = font;
        this.cost = cost;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj != null){
            if(obj instanceof Report){
                Report report = (Report) obj;
                if(this.name.equals(report.name) && this.noOfPages==report.noOfPages){
                    return true;
                }

            }
        }
        return false;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNoOfPages() {
        return noOfPages;
    }

    public void setNoOfPages(int noOfPages) {
        this.noOfPages = noOfPages;
    }

    public double getLineSpace() {
        return lineSpace;
    }

    public void setLineSpace(double lineSpace) {
        this.lineSpace = lineSpace;
    }

    public String getFont() {
        return font;
    }

    public void setFont(String font) {
        this.font = font;
    }

    public double getCost() {
        return cost;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }
}
