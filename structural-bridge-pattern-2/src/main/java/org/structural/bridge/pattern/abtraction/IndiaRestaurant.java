package org.structural.bridge.pattern.abtraction;

import org.structural.bridge.pattern.impl.Pizza;

public class IndiaRestaurant extends Restaurent{

    public IndiaRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setSauce("Tomato");
    }

    @Override
    void addToppings() {
        pizza.setToppings("");
    }

    @Override
    void makeCrust() {
        pizza.setCrust("thin");
    }
}
