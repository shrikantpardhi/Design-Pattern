package org.creational.abstractfactory;

import org.creational.abstractfactory.factory.ArtFurniture;
import org.creational.abstractfactory.factory.Furniture;
import org.creational.abstractfactory.factory.ModernFurniture;
import org.creational.abstractfactory.product.ModernSofa;
import org.creational.abstractfactory.product.Sofa;

/**
 * Hello world!
 *
 */
public class MainApp
{
    public static void main( String[] args )
    {
        Furniture artFurniture = new ArtFurniture();
        artFurniture.getChair();
        artFurniture.getSofa();
        System.out.println( "********************" );
        Furniture modernFurniture = new ModernFurniture();
        modernFurniture.getSofa();
        modernFurniture.getChair();
    }
}
