package com.xworkz.learningException.checkedexception;

import java.time.LocalDate;

public class PasswordExpiredException extends Exception{

    private final LocalDate expiryDate;

    public PasswordExpiredException(LocalDate expiryDate, String message) {
        super(message);
        this.expiryDate = expiryDate;
    }

    public LocalDate getExpiryDate() { return expiryDate; }
}
}
