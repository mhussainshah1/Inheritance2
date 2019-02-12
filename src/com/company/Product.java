package com.company;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class Product {

    private String code;
    private String description;
    private double price;
    protected static int count = 0; // a protected static variable

    public Product() {
        code = "";
        description = "";
        price = 0;
        count++;
    }

    // Get and set accessors for the code, description, and price instance variables

    @Override
    public String toString() {
        return  "Code:               " + code + "\n" +
                "Description:        " + description + "\n" +
                "Price:              " + this.getFormattedPrice() + "\n";
    }

    private String getFormattedPrice() {
        // Use the NumberFormat class to format the price to 2 decimal places
        NumberFormat formatter = new DecimalFormat("#0.00");
        return formatter.format(price);

    }

    // Create public access for the count variable
    public static int getCount() {
        return count;
    }

    //generate getter and setter methods
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public boolean equals(Object o) {
        Product product = (Product) o;
        return code.equals(product.code) && description.equals(product.description) && price == product.price;
    }
}