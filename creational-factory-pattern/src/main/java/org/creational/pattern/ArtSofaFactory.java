package org.creational.pattern;

public class ArtSofaFactory extends AbstractSofa{
    @Override
    public Sofa createSofa() {
        System.out.println("return ArtSofa factory object");
        return new ArtSofa();
    }
}
