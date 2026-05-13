package com.prajwal.library;

public class Subscription {
    private long subscriptionId;
    private int amt;
    private int duration;
    private String company;

    public void setSubscriptionId(long subscriptionId){
        this.subscriptionId=subscriptionId;
    }

    public void setAmt(int amt) {
        this.amt = amt;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    public String toString(){
        return "Id :"+ subscriptionId + " amt :"+amt +" duration :"+duration + " comapny :"+ company;
    }

    public long getSubscriptionId() {
        return subscriptionId;
    }

    public int getAmt() {
        return amt;
    }

    public int getDuration() {
        return duration;
    }

    public String getCompany() {
        return company;
    }
}
