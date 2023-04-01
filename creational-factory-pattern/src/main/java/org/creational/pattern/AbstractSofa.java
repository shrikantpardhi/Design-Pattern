package org.creational.pattern;

public abstract class AbstractSofa {

    public void getSofa() {
        System.out.println("abstract sofa");
        Sofa sofa = createSofa();
        sofa.build();
    }

    public abstract Sofa createSofa();
}
