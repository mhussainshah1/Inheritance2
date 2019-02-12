package com.company;

public class Book extends Product {

    private String author;
    private int pages;

    public Book() {
    }

    public Book(String author, int pages) {
        this.author = author;
        this.pages = pages;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPages() {
        return pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    @Override
    public boolean equals(Object o) {
        Book book = (Book) o;
        return (author.equals(book.author) && pages == book.pages);
    }
}