package com.prajwal.library;

public class BorrowRecord {

    private String borrowerName;
    private int advancePayment;
    private String borrowDate;
    private  String returnDate;

    public void setBorrowerName(String borrowerName) {
        this.borrowerName = borrowerName;
    }

    public void setAdvancePayment(int advancePayment) {
        this.advancePayment = advancePayment;
    }

    public void setBorrowDate(String borrowDate) {
        this.borrowDate = borrowDate;
    }

    public void setReturnDate(String returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "Name :"+borrowerName + " advPayment:"+advancePayment + " borrowdate :"+borrowDate + " return date:"+ returnDate;
    }

    public String getBorrowerName() {
        return borrowerName;
    }

    public int getAdvancePayment() {
        return advancePayment;
    }

    public String getBorrowDate() {
        return borrowDate;
    }

    public String getReturnDate() {
        return returnDate;
    }
}
