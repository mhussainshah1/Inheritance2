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
        if (this == o) return true;
        if (!(o instanceof Book)) return false;
        if (!super.equals(o)) return false;

        Book book = (Book) o;

        if (getPages() != book.getPages()) return false;
        return getAuthor().equals(book.getAuthor());
    }

}