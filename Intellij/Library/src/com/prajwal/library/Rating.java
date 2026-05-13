package com.prajwal.library;

public class Rating {
    private String username;
    private int stars;
    private String review;

    public void setUsername(String username) {
        this.username = username;
    }

    public void setStars(int stars) {
        this.stars = stars;
    }

    public void setReview(String review) {
        this.review = review;
    }

    public String toString(){
        return " username :"+username + "stars:"+stars + " review :"+review;
    }

    public String getUsername() {
        return username;
    }

    public int getStars() {
        return stars;
    }

    public String getReview() {
        return review;
    }
}
