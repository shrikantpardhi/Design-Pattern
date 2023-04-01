package org.creational.abstractfactory.factory;

import org.creational.abstractfactory.product.Chair;
import org.creational.abstractfactory.product.ModernChair;
import org.creational.abstractfactory.product.ModernSofa;
import org.creational.abstractfactory.product.Sofa;

public class ModernFurniture extends Furniture{
    @Override
    public Chair getChair() {
        return new ModernChair();
    }

    @Override
    public Sofa getSofa() {
        return new ModernSofa();
    }
}
