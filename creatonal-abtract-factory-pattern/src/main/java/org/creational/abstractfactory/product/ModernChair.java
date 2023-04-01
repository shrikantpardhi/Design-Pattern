package org.creational.abstractfactory.product;

public class ModernChair implements Chair{
    @Override
    public void assemble() {
        System.out.println("Assembling Modern Chair");
    }
}
