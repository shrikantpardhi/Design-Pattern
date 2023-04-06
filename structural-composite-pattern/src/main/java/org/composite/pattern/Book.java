package org.composite.pattern;

public class Book extends Product{

    public Book(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return this.getPrice();
    }

    public String getTitle() {
        return this.getName();
    }
}
