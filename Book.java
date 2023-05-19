package com.example.librarybooktracker;

public abstract class Book {
    private  String bookCode;
    private  String title;
    private String author;
    private int daysBorrowed = 0;
    private boolean isBorrowed = false;

    public Book(String bookCode, String title, String author) {
        this.bookCode = bookCode;
        this.title = title;
        this.author = author;
        this.daysBorrowed = daysBorrowed;
        this.isBorrowed = isBorrowed;
    }

    public void setBookCode(String bookCode) {
        this.bookCode = bookCode;
    }
    public String getBookCode() {
        return bookCode;
    }
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getDaysBorrowed() {
        return daysBorrowed;
    }

    public void setDaysBorrowed(int daysBorrowed) {
        this.daysBorrowed = daysBorrowed;
    }

    public boolean isBorrowed() {
        return isBorrowed;
    }

    public void setBorrowed(boolean borrowed) {
        isBorrowed = borrowed;
    }
    public double totalCost() {
        return getDaysBorrowed() * 30.0;
    }
}


