package org.creational.abstractfactory.product;

public class ArtSofa implements Sofa{

    @Override
    public void assemble() {
        System.out.println("Assembling Art Sofa");
    }
}
