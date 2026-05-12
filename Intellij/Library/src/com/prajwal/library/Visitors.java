package com.prajwal.library;

public class Visitors {
    private String name;
    private int age;
    private long number;
    private boolean borrowBooks;

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setBorrowBooks(boolean borrowBooks) {
        this.borrowBooks = borrowBooks;
    }

    public void setNumber(long number) {
        this.number = number;
    }

    public String toString(){
        return "I am fine";
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public long getNumber() {
        return number;
    }

    public boolean getBorrowBooks() {
        return borrowBooks;
    }
}
