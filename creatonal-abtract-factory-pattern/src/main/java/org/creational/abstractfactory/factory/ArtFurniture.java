package org.creational.abstractfactory.factory;

import org.creational.abstractfactory.product.ArtChair;
import org.creational.abstractfactory.product.ArtSofa;
import org.creational.abstractfactory.product.Chair;
import org.creational.abstractfactory.product.Sofa;

public class ArtFurniture extends Furniture {
    @Override
    public Chair getChair() {
        return new ArtChair();
    }

    @Override
    public Sofa getSofa() {
        return new ArtSofa();
    }
}
