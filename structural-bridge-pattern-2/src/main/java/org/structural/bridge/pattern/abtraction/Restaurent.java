package org.structural.bridge.pattern.abtraction;

import org.structural.bridge.pattern.impl.Pizza;

public abstract class Restaurent {
    protected Pizza pizza;

    protected Restaurent(Pizza pizza) {
        this.pizza = pizza;
    }

    abstract void addSauce();
    abstract void addToppings();
    abstract void makeCrust();

    public void prepare() {
        makeCrust();
        addSauce();
        addToppings();
        pizza.assemble();
        pizza.qualityCheck();
        System.out.println("Order in Progress!");
    }
}
