package com.example.librarybooktracker;

public class PremiumBooks extends Book{

    public PremiumBooks(String bookCode, String title, String author) {
        super(bookCode, title, author);
    }
    public double totalCost() {
        if (getDaysBorrowed() > 7) {
            return (7 * 50.0) + ((getDaysBorrowed() - 7) * 50.0) + (25.0 * (getDaysBorrowed() - 7));
        } else {
            return getDaysBorrowed() * 50.0;
        }
    }
}
