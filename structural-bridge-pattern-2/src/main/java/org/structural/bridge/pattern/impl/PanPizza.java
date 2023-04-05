package org.structural.bridge.pattern.impl;

public class PanPizza extends Pizza{
    @Override
    public void assemble() {
        System.out.println("Assemble panpizza");
    }

    @Override
    public void qualityCheck() {
        System.out.println("qualityCheck panpizza");
    }
}
