package com.pb.korchevskaja.hw5;

public class Book {
    private String title;
    private String author;
    private int year;

    public Book(String title, String author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;

    }

    public String getTitle () {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTitle(String number) {
        this.title = title;
    }

    String getInfo() {
        return title + " (" + author + " , год: " + year + "г.)";
    }
}
//
//public void takeBook (int number) {
//    System.out.println("Петров взял 3 книги");
//
//}

