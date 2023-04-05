package org.structural.bridge.pattern.impl;

public class ItalianPizza extends Pizza{
    @Override
    public void assemble() {
        System.out.println("Assemble italianPizza");
    }

    @Override
    public void qualityCheck() {
        System.out.println("qualityCheck italianPizza");
    }
}
