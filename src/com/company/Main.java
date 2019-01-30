package com.company;

/**
 * Inheritance 2
 * Using the code from the previous "Inheritance completion activity #1", create an override of the equals class for the
 * superclass, and Book and Software subclasses.
 */

/**
 * Inheritance 1
 * Make the following application work. To check your result, print out all the object instances you created.
 */
public class Main {

    public static void main(String[] args) {

        Book book = new Book("Ivor Horton", 500);
        book.setCode("123456789");
        book.setDescription("Java Programming Book");
        book.setPrice(49.9986);
        System.out.println(book);

        Software software = new Software("Muhammad Shah", "Java", "Windows");
        software.setCode("987654321");
        software.setDescription("Java Runtime Enviroment");
        software.setPrice(0.99);
        System.out.println(software);

        System.out.println("Number of Products :" + Product.getCount());
    }
}
