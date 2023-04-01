package org.creational.pattern;

public class MainApp
{
    public static void main( String[] args )
    {
        AbstractSofa modernSofa = new ModernSofaFactory();
        modernSofa.getSofa();
        System.out.println( "****************");
        AbstractSofa artSofa = new ArtSofaFactory();
        artSofa.getSofa();
    }
}
