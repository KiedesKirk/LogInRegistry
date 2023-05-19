package com.example.librarybooktracker;

public class RegularBooks extends Book{
    public RegularBooks(String bookCode, String title, String author) {
        super(bookCode, title, author);
    }

    public double totalCost() {
        return getDaysBorrowed() * 20.0;
    }
}
