package org.creational.pattern;

public class ModernSofaFactory extends AbstractSofa{
    @Override
    public Sofa createSofa() {
        System.out.println("modern sofa factory");
        return new ModernSofa();
    }
}
