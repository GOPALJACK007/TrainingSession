package com.example;
 
public class Book {
 
    private String title;
    private String author;
    private double price;
 
    public Book(String title, String author, double price) {
        this.title = title;
        this.author = author;
        this.price = price;
    }
 
 
    public String getTitle() {
        return title;
    }
 
    public void setTitle(String title) {
        this.title = title;
    }
 
    public String getAuthor() {
        return author;
    }
 
    public void setAuthor(String author) {
        this.author = author;
    }
 
    public double getPrice() {
        return price;
    }
 
    public void setPrice(double price) {
        this.price = price;
    }
 
    public void displayDetails() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: Amt" + price);
    }
 
    public static void main(String[] args) {
       
        Book book1 = new Book("JAVA", "Vignesh", 100.00);
 
       
        book1.displayDetails();
 
}
}
 