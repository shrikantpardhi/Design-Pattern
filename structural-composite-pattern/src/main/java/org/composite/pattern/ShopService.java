package org.composite.pattern;

public class ShopService {
    Box box;
    public void createOrder(Box... boxes) {
        this.box = new CompositBox(boxes);
    }

    public double calculatePrice() {
        return box.calculatePrice();
    }
}
