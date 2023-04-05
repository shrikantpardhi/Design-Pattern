package org.structural.bridge.pattern.abtraction;

import org.structural.bridge.pattern.impl.Pizza;

public class ItalianRestaurant extends Restaurent{

    public ItalianRestaurant(Pizza pizza) {
        super(pizza);
    }

    @Override
    void addSauce() {
        pizza.setSauce("Oil");
    }

    @Override
    void addToppings() {
        pizza.setToppings("*");
    }

    @Override
    void makeCrust() {
        pizza.setCrust("thik");
    }
}
