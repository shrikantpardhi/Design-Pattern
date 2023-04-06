package org.composite.pattern;

public class Mobile extends Product{
    public Mobile(String name, double price) {
        super(name, price);
    }

    @Override
    public double calculatePrice() {
        return this.price;
    }

    public String getTitle() {
        return this.getName();
    }
}
