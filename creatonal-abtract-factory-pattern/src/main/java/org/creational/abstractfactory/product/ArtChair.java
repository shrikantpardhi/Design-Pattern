package org.creational.abstractfactory.product;

public class ArtChair implements Chair{

    @Override
    public void assemble() {
        System.out.println("Assembling Art Chair");
    }
}

